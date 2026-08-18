package modelo;

public final class Cama extends Descanso{

	public Cama(String nombre, int posicionX, int posicionY, int posicionZ, int cantidadPersonasActual,
			int gradoSuciedad, String material, Calidad calidad, Estado estado, Zona zona, int cargaMaxima,
			int comodidad, int proteccionContraFrio) {
		super(nombre, posicionX, posicionY, posicionZ, cantidadPersonasActual, gradoSuciedad, material, calidad, estado, zona,
				cargaMaxima, comodidad, proteccionContraFrio);

	}
	@Override
	public void usar() {
		setGradoSuciedad(getGradoSuciedad() + 5);
		System.out.println("zzzz");
	}

}
