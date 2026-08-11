package modelo;

public final class Heladera extends Cocina{
	protected Comida comida ;
	
	public Heladera(String nombre, int posicionX, int posicionY, int posicionZ, int cantidadPersonasActual,
			int gradoSuciedad, String material, Calidad calidad, Estado estado, Zona zona, int tempMaxima,
			int tempMinima, int llama) {
		super(nombre, posicionX, posicionY, posicionZ, cantidadPersonasActual, gradoSuciedad, material, calidad, estado, zona,
				tempMaxima, tempMinima, llama);
	}

	public Comida sacarComida() {
		Comida comidaElegida = null ;
		switch(comida) {
		case CARNE:
			comidaElegida = Comida.CARNE;
			break;
		case POLLO:
			comidaElegida = Comida.POLLO;
			break;
		case FRUTAS:
			comidaElegida = Comida.FRUTAS;
			break;
		case LECHE:
			comidaElegida = Comida.LECHE;
			break;
		case YOGURT:
			comidaElegida = Comida.YOGURT;
		}
		return comidaElegida;

	}

	public Comida getComida() {
		return comida;
	}

	public void setComida(Comida comida) {
		this.comida = comida;
	}
	

}
