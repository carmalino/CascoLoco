package com.cascoloco.controller;

import java.util.ArrayList;
import java.util.List;


import com.cascoloco.dao.PreRegistroDaoImpl;
import com.cascoloco.idao.IPreRegistroDao;
import com.cascoloco.model.PreRegistro;
import com.cascoloco.vista.ViewPreRegistro;

public class ControllerPreRegistro {

	ViewPreRegistro vista = new ViewPreRegistro();
	
	public ControllerPreRegistro() {
		
	}
	
	// llama al DAO para registrar un preregistro
	public void registrar(PreRegistro preRegistro) {
		IPreRegistroDao dao = new PreRegistroDaoImpl();
		dao.registrar(preRegistro);
	}
	
	// llama al DAO para actualizar un preregistro
	public void actualizar(PreRegistro preRegistro) {
		IPreRegistroDao dao = new PreRegistroDaoImpl();
		dao.actualizar(preRegistro);
	}
	
	// llama al DAO para eliminar un preregistro
	public void eliminar(PreRegistro preRegistro) {
		IPreRegistroDao dao = new PreRegistroDaoImpl();
		dao.eliminar(preRegistro);
	}
	
	// llama al DAO para ver los elementos preregistro
	public void verPreRegistros() {
		List<PreRegistro> preRegistros = new ArrayList<PreRegistro>();
		IPreRegistroDao dao = new PreRegistroDaoImpl();
		preRegistros = dao.obtener();
		vista.verClientes(preRegistros);
	}
}
