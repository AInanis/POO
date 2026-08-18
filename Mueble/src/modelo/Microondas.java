package modelo;

public final class Microondas extends Cocina {

	public Microondas(String nombre, int posicionX, int posicionY, int posicionZ, int cantidadPersonasActual,
			int gradoSuciedad, String material, Calidad calidad, Estado estado, Zona zona, int tempMaxima,
			int tempMinima, int llama) {
		super(nombre, posicionX, posicionY, posicionZ, cantidadPersonasActual, gradoSuciedad, material, calidad, estado, zona,
				tempMaxima, tempMinima, llama);
	}
	
	public void calentar() {
		System.out.println("estoy recalentado la comida");
	}

}
