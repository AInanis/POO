package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Comuna;
import modelo.Persona;

public class conexion {

	String user = "root";
	String psw = "milei";
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

	public void agregarComuna(Comuna comuna) {

		Connection c = null;
		String sql = "INSERT INTO comuna(numeroComuna,sedeComunal,cantidadBarrios)VALUES (?,?,?);";
		try {
			c = conectar();
			PreparedStatement stmt = c.prepareStatement(sql);
			 stmt.setInt(1, comuna.getNumeroComuna());
		      stmt.setString(2, comuna.getSedeComunal());
		      stmt.setInt(3, comuna.getCantidadBarrios());

		        stmt.executeUpdate();

			
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
	
	
	public void eliminarPorParametro (Comuna comuna) {
		Connection c = null;
		String SQL = "DELETE from comuna WHERE numeroComuna = ?";
		try {
			c = conectar();
			PreparedStatement stmt = c.prepareStatement(SQL);
			 stmt.setInt(1, comuna.getNumeroComuna());
			 int filas = stmt.executeUpdate();
              if (filas > 0) {
		            System.out.println("shau registro");
		        } else {
		            System.out.println("No se encontrocomuna");
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
	}
	
	
	public ArrayList<Comuna> consultarComuna() {
		Connection c = null;
		String sql = "SELECT * from comuna";
		ArrayList<Comuna> solucion = new ArrayList<>();
		try {
			c = conectar();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String sedeComunal = rs.getString("sedeComunal");
				int numeroComuna = rs.getInt("numeroComuna");
				int cantidadBarrios = rs.getInt("cantidadBarrios");
				Comuna p = new Comuna(numeroComuna,sedeComunal, cantidadBarrios);
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
	
	public void actualizarComunaPorParametro(Comuna comunaAntes, Comuna comunaNueva) {

	    String sql = "UPDATE comuna SET sedeComunal = ? ,cantidadBarrios = ? WHERE numeroComuna = ?";
	    Connection c = null;
	    try {
           
            c = conectar();
            PreparedStatement stnt = c.prepareStatement(sql);
            stnt.setString(1, comunaNueva.getSedeComunal());
            stnt.setInt(2, comunaNueva.getCantidadBarrios());
            stnt.setInt(3, comunaAntes.getNumeroComuna());

	        int filas = stnt.executeUpdate();

	        if (filas > 0) {
	            System.out.println("c modifico exito");
	        } else {
	            System.out.println("No se encontró la comuna");
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }finally {
	        try {
	            if (c != null) {
	                c.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    
	}
}
