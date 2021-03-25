package com.curso.microservices.productos.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.curso.microservices.productos.entity.Producto;
import com.curso.microservices.productos.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {
		
	@Autowired
	private ProductoRepository productoRepository;
	

	@Override
	public Producto save(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		return productoRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return productoRepository.findAll();
	}

	@Override
	public Producto edit(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public void delete(Producto producto) {
		
		
	}

	@Override
	public void deleteById(Long id) {

		
		
	}

}
