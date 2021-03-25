package com.curso.microservices.item.service;

import java.util.List;

import com.curso.microservices.item.entity.Item;

public interface ItemService {
		
	List<Item> findByAll();
	
	Item findById(Long id, int cantidad);

}
