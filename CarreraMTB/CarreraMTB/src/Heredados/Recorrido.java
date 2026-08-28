package Heredados;

public abstract class Recorrido {
protected int distancia ;
protected int puntaje ;

public abstract double tiempoEstimado();

public abstract double puntaje();

public int getDistancia() {
	return distancia ;
	
}

public Recorrido(int distancia, int puntaje) {
	super();
	this.distancia = distancia;
	this.puntaje = puntaje;
}

}
