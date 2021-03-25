package com.curso.microservices.productos.service;

import java.util.List;
import java.util.Optional;

import com.curso.microservices.productos.entity.Producto;


public interface ProductoService {
	
	Producto save(Producto producto);

	Producto findById(Long id);

	List<Producto> findAll();

	Producto edit(Producto producto);

	void delete(Producto producto);

	void deleteById(Long id);

}
