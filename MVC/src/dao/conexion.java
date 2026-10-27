package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Estudiante;

public class conexion {
	
private String user = "root";
 private String psw = "admin";
 private String path = "jdbc:mysql://localhost:3306/bd_52";
 
 public Connection conectar() {
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(path, user, psw);

			System.out.println("se conecto");
		} catch (SQLException e) {
			e.printStackTrace();

		}

		return conexion;
	}
 
public void eliminarPersona(int id) {
	String sql = "DELETE FROM personas WHERE id = ? ";
	Connection c = null;
	try {
		c = conectar();
		PreparedStatement stnt = c.prepareStatement(sql);
		stnt.setInt(1, id);
		
		int filas = stnt.executeUpdate();
		
	}catch (SQLException e) {
		e.printStackTrace();
	}
}

public int agregarPersonaPorParametro(Estudiante e) {
	Connection c = null;
	int filas = 0;
	String SQL = "INSERT INTO personas (nombre, nivelEstudios ) VALUES (?,?);"; // Cada ? corresponde a un valor
																		// parametrizable
	try {
		c = conectar();
		PreparedStatement stmt = c.prepareStatement(SQL); // precompila la query
		stmt.setString(1, e.getNombre());
		stmt.setString(2, e.getNivelEstudios());
		stmt.setDate(3, Date.valueOf(e.getFechaNacimiento()));
		filas = stmt.executeUpdate();
	} catch (SQLException m) {
		m.printStackTrace();

	} finally {
		try {
			c.close();
		} catch (SQLException m) {
			m.printStackTrace();
		}

	}
	return filas; // devuelve las filas afectadas

}


}