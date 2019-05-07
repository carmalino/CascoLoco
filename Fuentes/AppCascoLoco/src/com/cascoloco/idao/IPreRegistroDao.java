package com.cascoloco.idao;

import java.util.List;
import com.cascoloco.model.PreRegistro;

public interface IPreRegistroDao {

	public boolean registrar(PreRegistro preRegistro);
	public List<PreRegistro> obtener();
	public boolean actualizar(PreRegistro preRegistro);
	public boolean eliminar(PreRegistro preRegistro);
}
