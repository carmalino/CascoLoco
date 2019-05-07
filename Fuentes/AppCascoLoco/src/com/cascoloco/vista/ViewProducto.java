package com.cascoloco.vista;

import java.util.List;

import com.cascoloco.model.Producto;

public class ViewProducto {

	public void verCliente(Producto producto) {
		System.out.println("Datos del Producto: "+producto);
	}
	
	public void verClientes(List<Producto> productos) {
		for (Producto producto : productos) {
			System.out.println("Datos del Producto: "+producto);
		}		
	}
}
