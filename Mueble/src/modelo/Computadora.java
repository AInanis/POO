package modelo;

public final class Computadora extends Mueble{
	private boolean daño ;
	
	public Computadora(String nombre, int posicionX, int posicionY, int posicionZ, int cantidadPersonasActual,
			int gradoSuciedad, String material, Calidad calidad, Estado estado, Zona zona, boolean daño) {
		super(nombre, posicionX, posicionY, posicionZ, cantidadPersonasActual, gradoSuciedad, material, calidad, estado, zona);
		this.daño = daño;
			
}
 public boolean encender() {
	 if(daño == false ) {
		 System.out.println("encendiendo..");
		 return true;
		 
	 }
	 else return false;
	 
	 }
 
public void jugarMinecraft() {
	Juego Minecraft = Juego.MINECRAFT;
	if(encender()) {
		
	}
	
}
public Juego jugarFornite() {
Juego Fornite = Juego.FORNITE;	
	if(encender()) {
	 System.out.println("jugando fornite");
	}
return Fornite;	
}
public Juego jugarLol() {
	Juego Lol = Juego.LOL;
	if(encender()) {
		System.out.println("juega tranq");
		}
	return Lol;
}

public Juego jugarValorant(){
	Juego Valorant = Juego.VALORANT;
if(encender()) {
	System.out.println("jugandoo");
}
return Valorant;
}
 public void escojerJuego(Juego j) {
	 switch(j) {
	 case MINECRAFT:
		 jugarMinecraft();
		 break;
	 case FORNITE:
		 jugarFornite();
		 break;
	 case LOL:
	     jugarLol();
	 }
	 
	 
}
	 
	
	
	
	
}
