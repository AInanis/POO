package Heredados;
public final class Intermedio extends Recorrido{
	private boolean pendiente ;
public Intermedio(int distancia, int puntaje) {
		super(distancia, puntaje);
	}

public double tiempoEstimado() {
	double  tiempoEstimado = 0;
	if (pendiente == true ) {
		tiempoEstimado = getDistancia() /25 *1.5;
	}
	else if (pendiente == false ) {
		tiempoEstimado = getDistancia() / 25 * 0.5;
	}
	return tiempoEstimado;
}

public double puntaje() {
	double puntos = 0;
	if(pendiente == true) {
		puntos = 1 + 1.5;
	}
	else puntos = 1 + 0.5 ;
	return puntos;
	
} 

}
