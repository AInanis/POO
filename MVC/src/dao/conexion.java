package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.Estudiante;
import java.util.ArrayList;
public class conexion {
	
private String user = "root";
 private String psw = "admin";
 private String path = "jdbc:mysql://localhost:3306/tifinalpoo";
 
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
	return filas;
}// devuelve las filas afectadas

	public ArrayList<Estudiante> consultar(){
		 Connection conexion = null;
		 String sql = "SELECT * FROM personas";
		 ArrayList<Estudiante> solucion = new ArrayList<>();
		 //sql = "SELECT * FROM personas;"; //WHERE nombre = '"+p.getNombre()+"'
			try {
				conexion = conectar();
				Statement stmt = conexion.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()) {
			        String nombre = rs.getString("nombre");
					String fecha = rs.getString("nacimiento");
					String tieneHijos = rs.getString("hijoas");
					String dni = rs.getString("dni");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					conexion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return solucion;
	}
	
	public void actualizarPersonaPorParametro(Estudiante personaAnterior, Estudiante personaNueva) {

	    String sql = "UPDATE tabla SET nombre = ? dni = ? fechaNacimiento = ? hijoas = ? WHERE dni = ?";

	    try {
            Connection c = null;
            c = conectar();
            PreparedStatement stnt = c.prepareStatement(sql);
	        stnt.setString(1, personaNueva.getNombre());
	        stnt.setString(2, personaNueva.getDni());
	        stnt.setDate(3, Date.valueOf(personaNueva.getFechaNacimiento()));
	        stnt.setInt(4, personaNueva.getNivelEstudios());

	        int filas = stnt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}


}