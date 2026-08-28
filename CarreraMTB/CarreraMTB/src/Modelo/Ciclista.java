package Modelo;
import java.util.ArrayList;

import Heredados.Recorrido;
public abstract class Ciclista {
private int rendimiento ;
private int recorrido ;

private ArrayList<Recorrido> recorridos = new ArrayList<>();

public double sumarPuntaje() {
	double puntos = 0;
	for(Recorrido r : recorridos) {
		puntos += r.puntaje();
		}
	return puntos ;
	
}

public int getRendimiento() {
	return rendimiento;
}

public void setRendimiento(int rendimiento) {
	this.rendimiento = rendimiento;
}

public int getRecorrido() {
	return recorrido;
}

public void setRecorrido(int recorrido) {
	this.recorrido = recorrido;
}

public ArrayList<Recorrido> getRecorridos() {
	return recorridos;
}

public void setRecorridos(ArrayList<Recorrido> recorridos) {
	this.recorridos = recorridos;
}

public boolean ciclistaConMasTreintaPuntos() {
	return sumarPuntaje() > 30;

}

}
