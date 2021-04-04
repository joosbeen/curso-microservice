package com.curso.microservices.productos.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.microservices.productos.entity.Producto;
import com.curso.microservices.productos.service.ProductoService;

@RestController
@RequestMapping(value = "/")
public class ProductoRestController {
	

	private static final Logger log = LoggerFactory.getLogger(ProductoRestController.class);
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping
	public ResponseEntity<List<Producto>> findByAll(){
		return ResponseEntity.ok(productoService.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Producto> findById(@PathVariable(name = "id", required = true) Long id) {
		
		Producto producto = productoService.findById(id);
		
		if (producto == null) {
			log.info("producto no encontrado.");
			return ResponseEntity.noContent().build();
		}
		log.info("producto encontrado.");
		
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		return ResponseEntity.ok(producto);
		
		
	}

}
