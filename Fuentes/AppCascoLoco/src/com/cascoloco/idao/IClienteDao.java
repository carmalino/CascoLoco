package com.cascoloco.idao;

import java.util.List;

import com.cascoloco.model.Cliente;

public interface IClienteDao {

	public boolean registrar(Cliente cliente);
	public List<Cliente> obtener();
	public boolean actualizar(Cliente cliente);
	public boolean eliminar(Cliente cliente);
	
}
