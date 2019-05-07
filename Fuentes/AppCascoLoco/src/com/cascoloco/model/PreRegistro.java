package com.cascoloco.model;

public class PreRegistro {
	
	private int id;
	private int idCliente;
	private String nombreCliente;
	private int idProducto;
	private int cantidad;
	private String refProducto;
	
	public PreRegistro() {
				
	}
	
	public PreRegistro(int idCliente, int idProducto, int cantidad) {
		super();
		this.idCliente = idCliente;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "PreRegistro [id=" + id + ", Cliente=" + nombreCliente + ", Producto=" + refProducto + ", cantidad="
				+ cantidad + "]";
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getRefProducto() {
		return refProducto;
	}

	public void setRefProducto(String refProducto) {
		this.refProducto = refProducto;
	}
	
	

}
