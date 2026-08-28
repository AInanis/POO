package Heredados;
import java.util.ArrayList;

import Modelo.Ciclista;
public class Carrera {

	private ArrayList<Ciclista> ciclistas = new ArrayList<>();
	
	public ArrayList<Ciclista> ciclistasConMasTreintaPuntos(){
		ArrayList<Ciclista> ciclistasConMasTreintaPuntos = new ArrayList<>();
		for(Ciclista c : ciclistas) {
			if(c.ciclistaConMasTreintaPuntos()) {
				ciclistasConMasTreintaPuntos.add(c);
			}
		}
		return ciclistasConMasTreintaPuntos;
	}
	
	
	
	
}
