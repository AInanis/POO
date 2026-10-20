package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {

	private String user = "root";
	private String psw = "admin";
	private String path = "jdbc:mysql://localhost:3306/bd_53";

	
	public void eliminar( ) {
		String sql = "DELETE FROM tabla_1 ";
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
	
	public void actualizar() {
		String sql = "UPDATE tabla_1 SET nombre = ?, dni = ? WHERE id = ?;";
		try (Connection conexion = DriverManager.getConnection(path, user, psw);
				PreparedStatement stnt = conexion.prepareStatement(sql)){
				stnt.setString(1, "nico");	
				stnt.setInt(2, 6);
				stnt.setInt(3, 3456789);
			int filas = stnt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}


	public void agregar() {
		String sql = "INSERT INTO `tabla_1`(`id`,`nombre`,`dni`)VALUES(2,'Lautaro', 23456789);";
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
