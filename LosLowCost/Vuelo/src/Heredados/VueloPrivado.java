package Heredados;

import java.util.ArrayList;

import Modelo.Persona;
import Modelo.Vuelo;

public class VueloPrivado extends Vuelo{
	private Persona capacidad[] = new Persona[10];
	private boolean tieneVips;
	
	public VueloPrivado(ArrayList<Persona> lasPersonas, int consumoCombustible, int cantidadPersonas, boolean tieneVips) {
		super(lasPersonas, consumoCombustible, cantidadPersonas);
		this.tieneVips = tieneVips;
		
	}
	
	@Override
	public float recaudacion() {
		//setCantidadPersonas(10);
		float ayu = 0;
		if(tieneVips) {
			for(Persona p: capacidad) {
				ayu = ayu + p.getPrecioPasaje();
			}
		}else {
			for(Persona p: capacidad) {
				ayu = ayu + p.getPrecioPasaje();
			}
			ayu = ayu * (0.21f) - getConsumoCombustible();
		}
		return ayu;
		
	}
	
	

}
