package modelo;

import java.util.ArrayList;

public class Comuna {
	private int numeroComuna;
	private String sedeComunal;
	private int cantidadBarrios;
	
	ArrayList <Barrio>barrios=new ArrayList<>();
	
	public Comuna (int numeroComuna, String sedeComunal, int cantidadBarrios ) 
	{
		this.numeroComuna = numeroComuna ;
		this.sedeComunal = sedeComunal;
		this.cantidadBarrios = cantidadBarrios ;
		
	}
	
	public void agregarBarrios(Barrio b) 
	{
		barrios.add(b);
	}
	public int cantidadDeBarrios() 
	{
	return barrios.size();	
	}
	
	public boolean esAtencionPrioritaria() 
	{
		int barriosCriticos = 0;
		double porcentaje = 0;
		for(Barrio b : barrios) {
			if(b.tieneCriticidadHabitacional()) {
				barriosCriticos++;
				 porcentaje =  barriosCriticos / barrios.size() * 100;

			}

		}
		if(porcentaje >= 50) {
			return true;
		}else return false;
		}

	public int getNumeroComuna() {
		return numeroComuna;
	}

	public void setNumeroComuna(int numeroComuna) {
		this.numeroComuna = numeroComuna;
	}

	public String getSedeComunal() {
		return sedeComunal;
	}

	public void setSedeComunal(String sedeComunal) {
		this.sedeComunal = sedeComunal;
	}

	public int getCantidadBarrios() {
		return cantidadBarrios;
	}

	public void setCantidadBarrios(int cantidadBarrios) {
		this.cantidadBarrios = cantidadBarrios;
	}
}
