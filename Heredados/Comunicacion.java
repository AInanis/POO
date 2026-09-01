package Heredados;

import Modelo.Posicion;
import Modelo.Tipo;

public final class Comunicacion extends Satelite{

	public Comunicacion(String propulsion, int antenas, Posicion p, int capacidadCarga, String panelSolar, int masa,
			Tipo tipo, boolean estaHinbernando, int multiplicadorPanel) {
		super(propulsion, antenas, p, capacidadCarga, panelSolar, masa, tipo, estaHinbernando, multiplicadorPanel);
	}

	@Override
	public float cargarEnergia() {
		return 1000000000 * getMultiplicadorPanel();
	}

	@Override
	public float cantidadCienciaAcumulada() {
		int total = 0;
		total += cargarEnergia();
		return total;
	}
	public boolean esComunicacion() {
		return true;
	}

}
