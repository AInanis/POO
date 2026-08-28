package Heredados;

public final class Facil extends Recorrido {

	public Facil(int distancia, int puntaje) {
		super(distancia, puntaje);
	}

	public double puntaje() {
		return 1;
		
	}

	@Override
	public double tiempoEstimado() {
		return getDistancia() /25;
	}
}
