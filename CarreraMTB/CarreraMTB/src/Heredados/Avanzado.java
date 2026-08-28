package Heredados;

public final class Avanzado extends Recorrido {

	public Avanzado(int distancia, int puntaje) {
		super(distancia, puntaje);
	}

	@Override
	public double tiempoEstimado() {
		int obstaculos = 0;
		return getDistancia() /20 * obstaculos ;
	}

	@Override
	public double puntaje() {
		return 0.5 * getDistancia();
	}
	

}
