package Heredados;

import Modelo.Posicion;
import Modelo.Tipo;

public abstract class Satelite {
protected String propulsion;
protected int antenas;
protected Posicion p;
protected int capacidadCarga;
protected String panelSolar;
protected int masa;
protected Tipo tipo;
protected boolean estaHinbernando;
protected int multiplicadorPanel ;
private int nivelCarga;
private int altura ;
//metodo abstracto
public abstract float cargarEnergia();

public abstract float cantidadCienciaAcumulada();

public boolean esComunicacion() {
	return false ;
}

public boolean esCiencia() {
	return false ;
}

public boolean estaEnHinbernacion() {
	if(nivelCarga > capacidadCarga * 0.10f  ) {
		return true;
		
	}else return false;
}


public int distanciaSol() {
	return altura + 6738;
}

public int enrutarComunicacion() {
	return nivelCarga/ 1000000000;
}

public Satelite(String propulsion, int antenas, Posicion p, int capacidadCarga, String panelSolar, int masa, Tipo tipo,
		boolean estaHinbernando, int multiplicadorPanel) {
	this.propulsion = propulsion;
	this.antenas = antenas;
	this.p = p;
	this.capacidadCarga = capacidadCarga;
	this.panelSolar = panelSolar;
	this.masa = masa;
	this.tipo = tipo;
	this.estaHinbernando = estaHinbernando;
	this.multiplicadorPanel = multiplicadorPanel;
	
}

public int getNivelCarga() {
	return nivelCarga ;
}
public String getPropulsion() {
	return propulsion;
}
public void setPropulsion(String propulsion) {
	this.propulsion = propulsion;
}
public int getAntenas() {
	return antenas;
}
public void setAntenas(int antenas) {
	this.antenas = antenas;
}
public Posicion getP() {
	return p;
}
public void setP(Posicion p) {
	this.p = p;
}
public int getCapacidadCarga() {
	return capacidadCarga;
}
public void setCapacidadCarga(int capacidadCarga) {
	this.capacidadCarga = capacidadCarga;
}
public String getPanelSolar() {
	return panelSolar;
}
public void setPanelSolar(String panelSolar) {
	this.panelSolar = panelSolar;
}
public int getMasa() {
	return masa;
}
public void setMasa(int masa) {
	this.masa = masa;
}
public Tipo getTipo() {
	return tipo;
}
public void setTipo(Tipo tipo) {
	this.tipo = tipo;
}
public boolean isEstaHinbernando() {
	return estaHinbernando;
}
public void setEstaHinbernando(boolean estaHinbernando) {
	this.estaHinbernando = estaHinbernando;
}
public int getMultiplicadorPanel() {
	return multiplicadorPanel;
}
public void setMultiplicadorPanel(int multiplicadorPanel) {
	this.multiplicadorPanel = multiplicadorPanel;
}

}
