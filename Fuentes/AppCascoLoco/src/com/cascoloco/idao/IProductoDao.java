package com.cascoloco.idao;

import java.util.List;
import com.cascoloco.model.Producto;

public interface IProductoDao {

	public boolean registrar(Producto producto);
	public List<Producto> obtener();
	public boolean actualizar(Producto producto);
	public boolean eliminar(Producto producto);
}
