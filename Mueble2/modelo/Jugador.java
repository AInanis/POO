package modelo;

public class Jugador {
 private int felicidad ;
 private int hambre;
 private int energia;
 private int sueño;
 private Juego juego;
 
public void jugar() {
	switch(juego) {
	case MINECRAFT:
		felicidad++;
		
	
	
	
	
	
	}
}
 
 
 
public Jugador(int felicidad, int hambre, int energia) {
	this.felicidad = felicidad;
	this.hambre = hambre;
	this.energia = energia;
}
public int getSueño() {
	return sueño;
}
public int getFelicidad() {
	return felicidad;
}
public void setFelicidad(int felicidad) {
	this.felicidad = felicidad;
}
public int getHambre() {
	return hambre;
}
public void setHambre(int hambre) {
	this.hambre = hambre;
}
public int getEnergia() {
	return energia;
}
public void setEnergia(int energia) {
	this.energia = energia;
}
 
 
 
}
