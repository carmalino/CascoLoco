package com.cascoloco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cascoloco.idao.IProductoDao;
import com.cascoloco.model.Producto;
import com.connection.Conexion;

public class ProductoDaoImpl implements IProductoDao {

	@Override
	public boolean registrar(Producto producto) {
		boolean registrar = false;
		String sql = "INSERT INTO Producto(referencia, descripcion) VALUES(?,?)";
		
		try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, producto.getReferencia());
			pstmt.setString(2, producto.getDescripcion());			
			pstmt.executeUpdate();
			registrar = true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return registrar;
	}

	@Override
	public List<Producto> obtener() {
		String sql = "select id,referencia,descripcion from Producto order by referencia ";
		List<Producto> listaProductos = new ArrayList<Producto>();
		try (Connection conn = Conexion.conectar();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			
			while (rs.next()) {
				Producto producto = new Producto();
				producto.setId(rs.getInt("id"));
				producto.setReferencia(rs.getString("referencia"));
				producto.setDescripcion(rs.getString("descripcion"));
				listaProductos.add(producto);				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return listaProductos;
	}

	@Override
	public boolean actualizar(Producto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(Producto producto) {
		// TODO Auto-generated method stub
		return false;
	}

}
