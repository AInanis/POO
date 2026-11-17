package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionPersona {
	String user = "root";
	String psw = "admin";
	String path = "jdbc:mysql://localhost:3306/gestion_barrios";

	public Connection conectar() {
		Connection c = null;
		try {
			c = DriverManager.getConnection(path, user, psw);
			System.out.println("Se conectó");
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return c;
	}
}
