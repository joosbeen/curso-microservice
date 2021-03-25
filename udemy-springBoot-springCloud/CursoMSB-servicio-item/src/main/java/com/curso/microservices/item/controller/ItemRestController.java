package com.curso.microservices.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.microservices.item.entity.Item;
import com.curso.microservices.item.service.ItemService;

@RestController
@RequestMapping(value = "/items")
public class ItemRestController {
	
	@Autowired
	private ItemService itemService;
	
	
	@GetMapping
	public ResponseEntity<List<Item>> findAll(){
		List<Item> body = itemService.findByAll();
		return ResponseEntity.ok(body);
	}
	
	@GetMapping(value = "/{id}/{cantidad}")
	public ResponseEntity<Item> findById(@PathVariable(name = "id", required = true) Long id, @PathVariable(name = "cantidad", required = true) Integer cantidad){
		Item body = itemService.findById(id, cantidad);
		return ResponseEntity.ok(body);
	}

}
