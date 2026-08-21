package Modelo;

import java.util.ArrayList;

public abstract class Vuelo {
	ArrayList<Persona> lasPersonas = new ArrayList<>();
	private int consumoCombustible;
	private int cantidadPersonas;
	
	public int getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	public Persona laMasFuriosa() {
		Persona furioso = lasPersonas.get(0);
		for(Persona p: lasPersonas) {
			if(p.estaFurioso() && p.getMinutosEsperando() > furioso.getMinutosEsperando()) {
				furioso = p;
			}
		}
		return furioso;
	}
	
	public boolean esLowCost() {
		for (Persona p: lasPersonas) {
			if(lasPersonas.size() < 100 && p.estaDemorado()) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Persona> getLasPersonas() {
		return lasPersonas;
	}

	public void setLasPersonas(ArrayList<Persona> lasPersonas) {
		this.lasPersonas = lasPersonas;
	}

	public int getConsumoCombustible() {
		return consumoCombustible;
	}

	public void setConsumoCombustible(int consumoCombustible) {
		this.consumoCombustible = consumoCombustible;
	}

	public Vuelo(ArrayList<Persona> lasPersonas, int consumoCombustible, int cantidadPersonas) {
		super();
		this.lasPersonas = lasPersonas;
		this.consumoCombustible = consumoCombustible;
		this.cantidadPersonas = cantidadPersonas;
	}

	public float recaudacion() {
		// TODO Auto-generated method stub
		return 0;
	}
}
