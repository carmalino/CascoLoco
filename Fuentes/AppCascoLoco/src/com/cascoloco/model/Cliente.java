package com.cascoloco.model;

public class Cliente {

	private int id;
	private String identificacion;
	private String nombre;
	private String email;
	private String telefono;
	
	public Cliente() {
		
	}	
	public Cliente(String identificacion, String nombre, String email, String telefono) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", identificacion=" + identificacion + ", nombre=" + nombre + ", email=" + email
				+ ", telefono=" + telefono + "]";
	}
	
}
