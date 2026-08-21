package Heredados;

import java.util.ArrayList;

import Modelo.Persona;
import Modelo.Vuelo;

public class VueloComercial extends Vuelo {
	public VueloComercial(ArrayList<Persona> lasPersonas, int consumoCombustible) {
		super(lasPersonas, consumoCombustible, consumoCombustible);
		// TODO Auto-generated constructor stub
	}
	@Override
	public float recaudacion() {
		float ayu = 0;
		for(Persona p: getLasPersonas()) {
			ayu = ayu + p.getPrecioPasaje();
		}
		ayu = ayu * (0.21f) - getConsumoCombustible();
		return ayu;
	}
}
