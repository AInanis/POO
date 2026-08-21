package Modelo;

public class Persona {
	private int minutosEsperando;
	private boolean tieneCompromiso;
	private int precioPasaje;
	
	public boolean estaFurioso() {
		return tieneCompromiso;
	}
	
	public boolean estaDemorado() {
		return minutosEsperando > 60;
	}
	
	public int getMinutosEsperando() {
		return minutosEsperando;
	}

	public boolean isTieneCompromiso() {
		return tieneCompromiso;
	}

	public void setTieneCompromiso(boolean tieneCompromiso) {
		this.tieneCompromiso = tieneCompromiso;
	}

	public int getPrecioPasaje() {
		return precioPasaje;
	}

	public void setPrecioPasaje(int precioPasaje) {
		this.precioPasaje = precioPasaje;
	}

	public void setMinutosEsperando(int minutosEsperando) {
		this.minutosEsperando = minutosEsperando;
	}
}
