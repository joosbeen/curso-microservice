package com.curso.microservices.items.service;

import java.util.List;

import com.curso.microservices.items.entity.Item;

public interface ItemService {
		
	List<Item> findByAll();
	
	Item findById(Long id, int cantidad);

}
