package com.curso.microservices.items.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.microservices.items.entity.Item;
import com.curso.microservices.items.entity.Producto;

@Service(value = "itemService")
public class ItemServiceImpl implements ItemService {
	
	
	private static final Logger log = LoggerFactory.getLogger(ItemServiceImpl.class);


	@Autowired
	private RestTemplate clientProducto;

	@Value("${rest.producto.ip}")
	private String productoHost;
	@Value("${rest.producto.port}")
	private String productoPort;

	@Override
	public List<Item> findByAll() {
		
		log.info(productoHost + ":" + productoPort);
		List<Producto> items = Arrays
				.asList(clientProducto.getForObject(productoHost + ":" + productoPort + "/products", Producto[].class));
		return items.stream().map(p -> {
			return new Item(p, 1);
		}).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, int cantidad) {

		log.info(productoHost + ":" + productoPort);
		
		Map<String, String> pathVariables = new HashMap<String, String>();
		
		pathVariables.put("id", id.toString());
		
		Producto producto = clientProducto.getForObject(productoHost + ":" + productoPort + "/products/{id}", Producto.class, pathVariables);
		
		return new Item(producto, cantidad);
	}

}
