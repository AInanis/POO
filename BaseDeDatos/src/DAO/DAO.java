package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Persona;

public class DAO {

	private String user = "root";
	private String psw = "milei";
	private String path = "jdbc:mysql://localhost:3306/bd_52";

	
	public void eliminar( ) {
		String sql = "DELETE FROM tabla1 ";
		try (Connection conexion = DriverManager.getConnection(path, user, psw);
			PreparedStatement stnt = conexion.prepareStatement(sql)){
			int filas = stnt.executeUpdate(); 
				System.out.println("se elimino ");
	          
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
	public void eliminarPorFiltro(int id ) {
		String sql = "DELETE FROM tabla_1 WHERE id = ? ";
		try (Connection conexion = DriverManager.getConnection(path, user, psw);
			PreparedStatement stnt = conexion.prepareStatement(sql)){
			  stnt.setInt(1, id);
			int filas = stnt.executeUpdate();
				System.out.println("se elimino x filtro ");
	          
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
	public void eliminarPorParametro (int id) {
		Connection c = null;
		String SQL = "DELETE from personas WHERE id = ?";
		try {
			c = conectar();
			PreparedStatement stmt = c.prepareStatement(SQL);
			stmt.setInt(1,id);
			stmt.executeUpdate();
			System.out.println("Se elimino el registro con exito");
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
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
	public void eliminarPorParametro(String id) {
		String sql = "DELETE FROM tabla WHERE id = ?";
		Connection conexion = null;
		try {
			conexion = conectar();
		PreparedStatement stnt = conexion.prepareStatement(sql);
		stnt.setString(1, sql);	
		}catch(SQLException e ){
			e.printStackTrace();
		}
	}
	
	
	
	public Persona consultarPersonaPorParametro(int id) {

	    String sql = "SELECT * FROM tabla WHERE id = ?";

	    try (Connection conexion = conectar();
	         PreparedStatement stnt = conexion.prepareStatement(sql)) {

	        stnt.setInt(1, id);

	        try (ResultSet resultado = stnt.executeQuery()) {

	            if (resultado.next()) {

	                float locura = resultado.getFloat("locura");
	                float secretos = resultado.getFloat("secretos");
	                float ubicacion = resultado.getFloat("ubicacion");

	                Persona bro = new Persona(locura, secretos, ubicacion);

	                return bro;
	            }
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return null;
	}
	public void actualizarPersonaPorParametro(Persona personaAnterior, Persona personaNueva) {

	    String sql = "UPDATE tabla SET nombre = ?, dni = ? WHERE id = ?";

	    try {
            Connection c = null;
            c = conectar();
            PreparedStatement stnt = c.prepareStatement(sql);
	        stnt.setString(1, personaNueva.getNombre());
	        stnt.setFloat(2, personaNueva.getLocura());
	        stnt.setInt(3, personaAnterior.getId());

	        int filas = stnt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	public void actualizar() {
		String sql = "UPDATE tabla_1 SET nombre = ?, dni = ? WHERE id = ?;";
		try {
		Connection conexion = DriverManager.getConnection(path, user, psw);
				PreparedStatement stnt = conexion.prepareStatement(sql);
				stnt.setString(1, "nico");	
				stnt.setInt(2, 6);
				stnt.setInt(3, 3456789);
			int filas = stnt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
	public ArrayList<Persona> consultar() {
		Connection c = null;
		String sql = "SELECT * from personas";
		ArrayList<Persona> solucion = new ArrayList<>();
		try {
			c = conectar();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String nombre = rs.getString("nombre");
				float locura = (float)rs.getInt("locura");
				float secretos = (float)rs.getInt("secretos");
				float ubicacion = (float)rs.getInt("ubicacion");
				Persona p = new Persona(nombre,locura,secretos,ubicacion);
				solucion.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return solucion;
	}
	public int agregarPersonaPorParametro(Persona p) {
		Connection c = null;
		int filas = 0;
		String SQL = "INSERT INTO personas (nombre, locura) VALUES (?,?);"; // Cada ? corresponde a un valor
																			// parametrizable
		try {
			c = conectar();
			PreparedStatement stmt = c.prepareStatement(SQL); // precompila la query
			stmt.setString(1, p.getNombre()); // Primero va el "numero" de "?" y luego el valor que toma la consulta
			stmt.setFloat(2, p.getLocura()); // Tener en cuenta los tipos de dato
			filas = stmt.executeUpdate(); // Se ejecuta sin reinstanciar el String SQL ya que se "prepara" antes
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return filas; // devuelve las filas afectadas

	}

	public void agregar() {
		String sql = "INSERT INTO `tabla`(`id`,`nombre`,`dni`)VALUES(2,'Lautaro', 23456789);";
		Connection conexion = null;
		try {
			conexion = conectar();
			Statement stnt = conexion.createStatement();
			int filas = stnt.executeUpdate(sql);
			System.out.println(filas);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}