
public abstract class Personaje {
	protected int vida, metros,  energia, danioBase, distanciaGolpe;
	
	public void mover() {
		energia -= 1 ;
		double probabilidad = 0 ;
		if(probabilidad == 0.70f) {
			metros += 1;
			}
		else if(probabilidad == 0.20f) {
			metros += 2;
			}
		else if(probabilidad == 0.08f) {
			metros += 3;
			}
		else if(probabilidad == 0.02f) {
			metros += 0;
			System.out.println("no te podes mover");
			}
			
		}
	
	public void cargarEnergia() {
		energia -= 1 ;
		double probabilidad = 0;
		if(probabilidad == 0.70f) {
			energia += 3;
			}
		else if(probabilidad == 0.20f) {
			energia = 5;
			}
		else if(probabilidad == 0.08f) {
			energia = 7;
			}
		else if(probabilidad == 0.02f) {
			energia += 0;
			System.out.println("no cargás energá");
			}
			
		}

	public Personaje(int vida, int metros, int energia, int danioBase, int distanciaGolpe) {
		super();
		this.vida = vida;
		this.metros = metros;
		this.energia = energia;
		this.danioBase = danioBase;
		this.distanciaGolpe = distanciaGolpe;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMetros() {
		return metros;
	}

	public void setMetros(int metros) {
		this.metros = metros;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public int getDanioBase() {
		return danioBase;
	}

	public void setDanioBase(int danioBase) {
		this.danioBase = danioBase;
	}

	public int getDistanciaGolpe() {
		return distanciaGolpe;
	}

	public void setDistanciaGolpe(int distanciaGolpe) {
		this.distanciaGolpe = distanciaGolpe;
	}
	
		
	}

