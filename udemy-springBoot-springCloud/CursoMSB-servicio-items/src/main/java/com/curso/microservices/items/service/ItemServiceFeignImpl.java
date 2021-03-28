package com.curso.microservices.items.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.curso.microservices.items.client.ProductoFeignClient;
import com.curso.microservices.items.entity.Item;

@Service(value = "itemServiceFeign")
@Primary
public class ItemServiceFeignImpl implements ItemService {
	
	@Autowired
	private ProductoFeignClient feignClient;

	@Override
	public List<Item> findByAll() {
		return feignClient.findByAll().getBody().stream().map(p -> {
			return new Item(p, 1);
		}).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, int cantidad) {
		return new Item(feignClient.findById(id).getBody(), cantidad);
	}

}
