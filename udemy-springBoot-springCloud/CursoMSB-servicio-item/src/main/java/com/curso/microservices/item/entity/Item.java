package com.curso.microservices.item.entity;

public class Item {

	private Producto producto;
	private int cantidad;

	public Item() {
	}

	public Item(Producto producto, int cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Double subTotal() {
		return (this.cantidad * this.producto.getPrecio());
	}

}
