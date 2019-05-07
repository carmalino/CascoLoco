package com.cascoloco.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.cascoloco.idao.IClienteDao;
import com.cascoloco.model.Cliente;
import com.connection.Conexion;

public class ClienteDaoImpl implements IClienteDao {

	@Override
	public boolean registrar(Cliente cliente) {
		boolean registrar = false;

		String sql = "INSERT INTO Cliente(identificacion,nombre,email,telefono) VALUES(?,?,?,?,?)";
		
		try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, cliente.getIdentificacion());
			pstmt.setString(2, cliente.getNombre());
			pstmt.setString(3, cliente.getEmail());
			pstmt.setString(4, cliente.getTelefono());
			pstmt.executeUpdate();
			registrar = true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return registrar;
	}

	@Override
	public List<Cliente> obtener() {
		String sql = "select id,identificacion,nombre,email,telefono from Cliente order by identificacion ";
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		try (Connection conn = Conexion.conectar();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			// loop through the result set
			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setId(rs.getInt("id"));
				cliente.setIdentificacion(rs.getString("identificacion"));
				cliente.setNombre(rs.getString("nombre"));
				cliente.setEmail(rs.getString("email"));
				cliente.setTelefono(rs.getString("telefono"));
				listaClientes.add(cliente);				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return listaClientes;

	}

	@Override
	public boolean actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

}
