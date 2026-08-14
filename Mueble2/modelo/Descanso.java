package modelo;

public abstract   class Descanso extends Mueble {

	private int comodidad;
	private final int cargaMaxima;
	private int proteccionContraFrio;
	private int cargaActual;
	
	public Descanso(String nombre, int posicionX, int posicionY, int posicionZ, int cantidadPersonasActual, int gradoSuciedad,
			String material, Calidad calidad, Estado estado, Zona zona, int cargaMaxima, int comodidad, int proteccionContraFrio) 
	{
		
		super(nombre, posicionX, posicionY, posicionZ, cantidadPersonasActual, gradoSuciedad,
			material, calidad, estado, zona);
		
		this.cargaMaxima = cargaMaxima;
		this.proteccionContraFrio = proteccionContraFrio;
		this.comodidad = comodidad;
	}
	
	public void rompersePorCarga() {
		if(getCapacidadPersonasActual() > cargaMaxima) {
			setEstado(Estado.ROTO);
		}
	}

	public int getComodidad() {
		return comodidad;
	}

	public void setComodidad(int comodidad) {
		this.comodidad = comodidad;
	}

	public int getProteccionContraFrio() {
		return proteccionContraFrio;
	}

	public void setProteccionContraFrio(int proteccionContraFrio) {
		this.proteccionContraFrio = proteccionContraFrio;
	}

	public int getCargaActual() {
		return cargaActual;
	}

	public void setCargaActual(int cargaActual) {
		this.cargaActual = cargaActual;
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}
	
	

}
