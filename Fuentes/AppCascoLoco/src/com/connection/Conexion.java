package com.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {

	public static Connection conectar() {
		Connection conn = null;
		Properties prop = new Properties();

		try {
		    // load a properties file
		    prop.load(Conexion.class.getResourceAsStream("/database.properties")); // note the leading /

		    //System.out.println(prop.getProperty("datasource.url"));

		} catch (IOException ex) {
		    ex.printStackTrace();
		}
		
        try {
            conn = DriverManager.getConnection(prop.getProperty("datasource.url"));            
            //System.out.println("Connection to SQLite has been established.");            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
		return conn;
	}
}
