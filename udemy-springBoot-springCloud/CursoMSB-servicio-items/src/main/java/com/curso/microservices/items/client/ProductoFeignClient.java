package com.curso.microservices.items.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.curso.microservices.items.entity.Producto;


@FeignClient(name = "servicio-productos")
public interface ProductoFeignClient {
	
	@GetMapping(value = "/")
	public ResponseEntity<List<Producto>> findByAll();
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Producto> findById(@PathVariable(name = "id", required = true) Long id);

}
