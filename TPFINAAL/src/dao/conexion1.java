package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Barrio;
import modelo.Comuna;
import modelo.TrazadoFormal;
import modelo.UrbanizacionPlanificada;
import modelo.ComplejoHabitacional;
public class conexion1 {
	String user = "root";
	String psw = "admin ";
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
	public void agregarBarrio(Barrio barrio) {

		Connection c = null;
		   String sql = "INSERT INTO barrios(nombreBarrio, hectareas, tipoBarrio, cantidadPH, porcentajeAsfalto, numeroLey, aguaFormal, monoblocks, consorcioActivo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			c = conectar();
			PreparedStatement stmt = c.prepareStatement(sql);
               stmt.setString(1, barrio.getNombre());
		       stmt.setDouble(2, barrio.getSuperficieHectareas());
		       stmt.executeUpdate();
		        if (barrio instanceof TrazadoFormal) {

		       TrazadoFormal tf = (TrazadoFormal) barrio;
		       stmt.setInt(3, tf.getCantidadEdificiosPH());
		       stmt.setDouble(4, tf.getPorcentajeAsfalto());
		       stmt.setNull(5, java.sql.Types.DOUBLE);
		       stmt.setNull(6, java.sql.Types.BOOLEAN);
		       stmt.setNull(7, java.sql.Types.INTEGER);
		       stmt.setNull(8, java.sql.Types.BOOLEAN);

		        } else if (barrio instanceof UrbanizacionPlanificada) {

		        UrbanizacionPlanificada up = (UrbanizacionPlanificada) barrio;
		        stmt.setNull(3,  java.sql.Types.INTEGER);
		        stmt.setNull(4,  java.sql.Types.DOUBLE);
                stmt.setInt(5, up.getNumeroLeyIntegracion());
		        stmt.setBoolean(6, up.isConexionFormalAgua());
		        stmt.setNull(7,  java.sql.Types.INTEGER);
		        stmt.setNull(8,  java.sql.Types.BOOLEAN);
		        
		            
                } else if (barrio instanceof ComplejoHabitacional) {
		        ComplejoHabitacional ch = (ComplejoHabitacional) barrio;
		        stmt.setNull(3,  java.sql.Types.INTEGER);
		        stmt.setNull(4,  java.sql.Types.DOUBLE);
		        stmt.setNull(5,  java.sql.Types.DOUBLE);
		        stmt.setNull(6,  java.sql.Types.INTEGER);
 		        stmt.setInt(7, ch.getCantidadMonoblocks());
		        stmt.setBoolean(8, ch.isConsorcioActivo());

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
	
	
	public void eliminarBarrioPorParametro (Barrio barrio) {
		Connection c = null;
		String SQL = "DELETE from barrios WHERE nombreBarrio = ?";
		try {
			c = conectar();
			PreparedStatement stmt = c.prepareStatement(SQL);
			 stmt.setString(1, barrio.getNombre());
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
	
	public ArrayList<Barrio> consultarBarrio() {
		Connection c = null;
		String sql = "SELECT * from barrios";
		ArrayList<Barrio> solucion = new ArrayList<>();
		try {
			c = conectar();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String nombreBarrio = rs.getString("nombreBarrio");
				double hectareas = rs.getDouble("hectareas");
				String tipoBarrio = rs.getString("tipoBarrio");
				Barrio b = null;

				if (tipoBarrio.equals("Trazado formal")) {
				    b = new TrazadoFormal(tipoBarrio, hectareas, 0, hectareas);
				}

				if (tipoBarrio.equals("Urbanizacion Planificada")) {
				   b = new UrbanizacionPlanificada(tipoBarrio, hectareas, 0, false);
				}

				if (tipoBarrio.equals("Complejo Habitacional")) {
				   b = new ComplejoHabitacional(tipoBarrio, hectareas, 0, false);
				}
				solucion.add(b);
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
	
	
	public void actualizarBarrioPorParametro(Barrio barrioAntes, Barrio BarrioNuevo) {

	    String sql = "UPDATE barrios SET hectareas = ? WHERE nombreBarrio = ?";
	    Connection c = null;
	    try {
            c = conectar();
            PreparedStatement stnt = c.prepareStatement(sql);
            stnt.setDouble(1, BarrioNuevo.getSuperficieHectareas());
            stnt.setString(2, barrioAntes.getNombre());
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
