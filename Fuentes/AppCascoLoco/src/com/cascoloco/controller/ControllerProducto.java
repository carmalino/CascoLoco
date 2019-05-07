package com.cascoloco.controller;

import java.util.ArrayList;
import java.util.List;


import com.cascoloco.dao.ProductoDaoImpl;
import com.cascoloco.idao.IProductoDao;
import com.cascoloco.model.Producto;
import com.cascoloco.vista.ViewProducto;

public class ControllerProducto {
	private ViewProducto vista = new ViewProducto();
	
	public ControllerProducto() {
		
	}
	// llama al DAO para guardar un producto
		public void registrar(Producto producto) {
			IProductoDao dao = new ProductoDaoImpl();
			dao.registrar(producto);
		}

		// llama al DAO para actualizar un producto
		public void actualizar(Producto producto) {
			IProductoDao dao = new ProductoDaoImpl();
			dao.actualizar(producto);
		}

		// llama al DAO para eliminar un producto
		public void eliminar(Producto producto) {
			IProductoDao dao = new ProductoDaoImpl();
			dao.eliminar(producto);
		}

		// llama al DAO para obtener todos los productos y luego los muestra en la vista
		public void verProductos() {
			List<Producto> productos = new ArrayList<Producto>();
			IProductoDao dao = new ProductoDaoImpl();
			productos = dao.obtener();
			vista.verClientes(productos);
		}
		//Comprobar que el producto es valido
		public int esProductoValido(String buscarProducto) {
			List<Producto> productos = new ArrayList<Producto>();
			int idProducto = 0;
			IProductoDao dao = new ProductoDaoImpl();
			productos = dao.obtener();
			for (Producto producto : productos) {
				if(producto.getReferencia().equals(buscarProducto))
				{
					idProducto = producto.getId();
				}
			}
			return idProducto;
		}

}
