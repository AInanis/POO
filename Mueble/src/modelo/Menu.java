package modelo;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int opcion = 0 ;
		System.out.println("Menu principal");
		System.out.println("1. Ir a Cocina");
		System.out.println("2. Ir a cuarto a dormir");
		System.out.println("3. escojer juego y jugar ");
		opcion =  s.nextInt();
		
		do {
			switch(opcion){
			case 1 :	
				int opcion1 ;
		 System.out.println(" bienvenido a la cocina");
	     System.out.println("1. usar hornalla");
	     System.out.println("2. usar heladera ");
	    	   opcion1 = s.nextInt();
	     if(opcion1 == 1) {
	    	 Hornalla h1 = new Hornalla("Kevin",2,30,2,1,10,"Cuero",Calidad.BUENA,Estado.SANO,Zona.COCINA,20,20, 1);
	    	h1.encender();
	     }
	     if(opcion1 == 2) {
	    	 Heladera he = new Heladera("Agus",1,2,3,5,7,"Metal", Calidad.MEDIA,Estado.ROTO,Zona.COCINA,21,21,3);
             he.sacarComida();
	     }
	     break;
	         case 2: 
	   System.out.println("buen descanso");
	   Cama c = new Cama("Marcos", 10,9,8,2,23, "Plumas", Calidad.MALA,Estado.SANO,Zona.HABITACION,100,2,1) ;
	   c.usar();
	   break;
	         case 3:
	        	 //public Jugador(int felicidad, int hambre, int energia) {
	        	 Jugador j1 = new Jugador(12,9,23);
	        	 Jugador j2 = new Jugador(10,8,12);
	        	 Computadora c1 = new Computadora("Marcos", 10,9,8,2,23, "Plumas", Calidad.MALA,Estado.SANO,Zona.HABITACION, false ) ;
	        	 if(c1.encender()) {
	        		 System.out.println("Felicidad ");
	        	 }
	        	 
			}
		}
		while (opcion <= 4);
		
		
		

	}

}
