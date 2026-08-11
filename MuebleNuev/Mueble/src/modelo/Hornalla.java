package modelo;

public final class Hornalla extends Cocina  {

	public Hornalla(String nombre, int posicionX, int posicionY, int posicionZ, int cantidadPersonasActual,
			int gradoSuciedad, String material, Calidad calidad, Estado estado, Zona zona, int tempMaxima,
			int tempMinima, int llamaFuego) {
		super(nombre, posicionX, posicionY, posicionZ, cantidadPersonasActual, gradoSuciedad, material, calidad, estado, zona,
				tempMaxima, tempMinima, llamaFuego);
	}
	public boolean encender() {
		if(getTempMaxima() < getTempMinima()) {
			System.out.println("Se prendio con exito");
			return true;
		}
		else 
			System.out.println("no se pudo prender");
			return false;
	}

}
