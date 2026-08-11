package modelo;

public abstract class Cocina extends Mueble  {
	private final int tempMaxima;
	private final int tempMinima;
	private int llama;
	
	
	public Cocina(String nombre, int posicionX, int posicionY, int posicionZ, int cantidadPersonasActual, int gradoSuciedad,
			String material, Calidad calidad, Estado estado, Zona zona, int tempMaxima, int tempMinima, int llama ) {
		super(nombre, posicionX, posicionY, posicionZ, cantidadPersonasActual, gradoSuciedad,
			material, calidad, estado, zona);
		
		this.tempMaxima = tempMaxima;
		this.tempMinima = tempMinima;
		this.llama = llama;
	}
public boolean encender() {
	if(tempMaxima < tempMinima) {
		return true ;
	}
	else return false;
}
	
	public void rompersePorSobrecarga() {
		if(getEstado() == Estado.SANO) {
			System.out.println("Me rompi");
			setEstado(Estado.ROTO);	
		}
	}
	
	public void rompersePorQuemaduraElectrica() {
		if(getEstado() == Estado.SANO) {
			System.out.println("Me rompi");
			setEstado(Estado.ROTO);	
		}
	}
	
	public void cocinar() {
		System.out.println("Estoy cocinando");
	}

	public int getTempMaxima() {
		return tempMaxima;
	}

	public int getTempMinima() {
		return tempMinima;
	}
	public int getLlama() {
		return llama;
	}
	public void setLlama(int llama) {
		this.llama = llama;
	}
	
	
	

}
