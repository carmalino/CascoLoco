package com.cascoloco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cascoloco.idao.IPreRegistroDao;
import com.cascoloco.model.PreRegistro;
import com.connection.Conexion;

public class PreRegistroDaoImpl implements IPreRegistroDao {

	@Override
	public boolean registrar(PreRegistro preRegistro) {
		boolean registrar = false;

		String sql = "INSERT INTO PreRegistro(idCliente, idProducto, Cantidad) VALUES(?,?,?)";
		
		try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, preRegistro.getIdCliente());
			pstmt.setInt(2, preRegistro.getIdProducto());
			pstmt.setInt(3, preRegistro.getCantidad());			
			pstmt.executeUpdate();
			registrar = true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return registrar;
	}

	@Override
	public List<PreRegistro> obtener() {
		String sql = "select pre.id,cli.identificacion,pro.referencia,pre.cantidad from PreRegistro pre inner join Cliente cli on pre.IdCliente = cli.id "
				+ "inner join producto pro on pre.IdProducto = pro.id"
				+ " order by cli.identificacion ";
		List<PreRegistro> listaPreRegistros = new ArrayList<PreRegistro>();
		try (Connection conn = Conexion.conectar();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			// loop through the result set
			while (rs.next()) {
				PreRegistro preRegistro = new PreRegistro();
				preRegistro.setId(rs.getInt("id"));
				preRegistro.setNombreCliente(rs.getString("identificacion"));
				preRegistro.setRefProducto(rs.getString("referencia"));
				preRegistro.setCantidad(rs.getInt("cantidad"));
				listaPreRegistros.add(preRegistro);				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return listaPreRegistros;
	}

	@Override
	public boolean actualizar(PreRegistro preRegistro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(PreRegistro preRegistro) {
		// TODO Auto-generated method stub
		return false;
	}

}
