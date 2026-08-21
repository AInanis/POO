package Modelo;

import java.util.ArrayList;

public class Aeropuerto {
	ArrayList<Vuelo> losVuelos = new ArrayList<>();
	
	public ArrayList<Vuelo> losLowCost(){
		ArrayList<Vuelo> losVuelosLowCost = new ArrayList<>();
		for(Vuelo v: losVuelos) {
			if(v.esLowCost()) {
				losVuelosLowCost.add(v);
			}
		}
		return losVuelosLowCost;
	}
	
	public float recaudacionTotal() {
		float ayu = 0;
		for(Vuelo v: losVuelos) {
			ayu = ayu + v.recaudacion();
		}
		return ayu;
	}
	
	public Persona laMasFuriosa() {
		Vuelo vo = losVuelos.get(0);
		for(Vuelo v: losVuelos) {
			if(v.laMasFuriosa().getMinutosEsperando() > vo.laMasFuriosa().getMinutosEsperando()) {
				vo = v;
			}
		}
		return vo.laMasFuriosa();
	}
}
