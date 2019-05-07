package com.cascoloco.vista;

import java.util.List;

import com.cascoloco.model.PreRegistro;

public class ViewPreRegistro {

	public void verCliente(PreRegistro preRegistro) {
		System.out.println("Datos del preRegistro: "+preRegistro);
	}
	
	public void verClientes(List<PreRegistro> preRegistros) {
		for (PreRegistro preRegistro : preRegistros) {
			System.out.println("Datos del Producto: "+preRegistro);
		}		
	}
}
