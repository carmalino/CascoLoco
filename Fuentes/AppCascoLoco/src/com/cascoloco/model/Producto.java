package com.cascoloco.model;

public class Producto {
	
	private int id;
	private String referencia;
	private String descripcion;
	
	public Producto() {
		
	}
	
	public Producto(String referencia, String descripcion) {
		super();
		this.referencia = referencia;
		this.descripcion = descripcion;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getReferencia() {
		return referencia;
	}



	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	@Override
	public String toString() {
		return "Producto [id=" + id + ", referencia=" + referencia + ", descripcion=" + descripcion + "]";
	}

}
