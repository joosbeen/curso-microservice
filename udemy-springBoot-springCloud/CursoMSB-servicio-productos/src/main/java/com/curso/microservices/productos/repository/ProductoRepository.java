package com.curso.microservices.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.microservices.productos.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
