package Heredados;

import Modelo.Posicion;
import Modelo.Tipo;

public final class Ciencia extends Satelite{
 private long medidorCiencia ;
	public Ciencia(String propulsion, int antenas, Posicion p, int capacidadCarga, String panelSolar, int masa,
			Tipo tipo, boolean estaHinbernando, int multiplicadorPanel) {
		super(propulsion, antenas, p, capacidadCarga, panelSolar, masa, tipo, estaHinbernando, multiplicadorPanel);
	}
	
	public long generarCiencia() {
		return (10 * (getNivelCarga()/3000000000l));
	}
	public boolean estaHaciendoExperimento() {
		if(medidorCiencia >10000000000l && estaEnHinbernacion() ) {
			return true ;
			
		}else return false;
	}
	@Override
	public float cargarEnergia() {
		boolean tieneExperimento = true ;
	    float  carga ;
		long capacidadCarga = 1000000000;
		if(tieneExperimento == true) {
			carga = (capacidadCarga * getMultiplicadorPanel()) * 0.4f;
		}
		else carga = (capacidadCarga * getMultiplicadorPanel()) * 1;
		return carga;
	}
	
	public float cantidadCienciaAcumulada() {
		float total = 0;
		total += cargarEnergia();
		return total;
	}
	
	public boolean esCiencia() {
		return true;
	}
	
	public long getMedidorCiencia() {
		return medidorCiencia;
	}

}
