
public final class Alacran extends Personaje {
private int vidaA = 500;
private int dañoBaseA = 7 ;
private int energiaA = 75;
private Ataque ataque;

public void golpear(){
	double probabilidad = 0 ;
	double dañoHecho = 0;
	if(probabilidad == 0.80f) {
		dañoHecho = getDanioBase() * 3;
	}
	if(probabilidad == 0.10f) {
		dañoHecho = getDanioBase() * 4.5;
	}
	if(probabilidad == 0.8f) {
		dañoHecho = getDanioBase() * 6;
	}
	if(probabilidad == 0.2f) {
		dañoHecho = getDanioBase() * 0;
	}
}






{
	
}










































public Alacran(int vida, int metros, int energia, int danioBase, int distanciaGolpe, int VidaA, int dañoBaseA, int energiaA, int vidaA) {
	super(vida, metros, energia, danioBase, distanciaGolpe);
	this.vidaA = vidaA;
	this.dañoBaseA = dañoBaseA;
	this.energiaA = energiaA;
	
}

public int getVidaA() {
	return vidaA;
}

public void setVidaA(int vidaA) {
	this.vidaA = vidaA;
}

public int getDañoBaseA() {
	return dañoBaseA;
}

public void setDañoBaseA(int dañoBaseA) {
	this.dañoBaseA = dañoBaseA;
}

public int getEnergiaA() {
	return energiaA;
}

public void setEnergiaA(int energiaA) {
	this.energiaA = energiaA;
}
}