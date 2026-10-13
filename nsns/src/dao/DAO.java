package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class DAO {

	String user = "root";
	String psw = "admin";
	String path = "jdbc:mysql://localhost:3306/app";
	String sql = "INSERT INTO `app`.`tablita`(`id`,`nombre`,`dni`) VALUES(6,'Vieties','123456')";
	
	public void agregar() {
		Connection conexion = null;
	
		try {
			conexion = conectar();
			Statement stmt = conexion.createStatement();
			int filas = stmt.executeUpdate(sql);
			System.out.println(filas);
			
		}catch (SQLException e ){
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			}catch(SQLException e ) {
				e.printStackTrace();
			}
		}
	
		
	}
	
	public Connection conectar() {
		Connection conexion = null;
		
		try {
			conexion = DriverManager.getConnection(path, user, psw);
			System.out.println("c conecto(creo)");			
		
			
			
			
		}catch(SQLException e ) {
			e.printStackTrace();

		}finally {
			try {
				conexion.close();
			}catch(SQLException e ) {
				e.printStackTrace();
			}
			
		}
		return conexion;
	}

}
