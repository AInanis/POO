package modelo;
import java.util.Scanner;
public class Menu {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int opcion = 0 ;
		System.out.println("Menu principal");
		System.out.println("1. Ir a Cocina");
		System.out.println("2. Ir a cuarto a dormir");
		opcion = s.nextInt();
		
		do {
			switch(opcion){
			case 1 :	
				int opcion1 ;
		 System.out.println(" bienvenido a la cocina");
	     System.out.println("1. usar hornalla");
	     System.out.println("2. usar heladera ");
	    	   opcion1 = s.nextInt();
	     if(opcion1 == 1) {
	    	 Hornalla h = null ;
	    	System.out.println(h.encender());
	     }
	     if(opcion1 == 2) {
	    	 Heladera he = null;
	       System.out.println(he.sacarComida());
	     }
	     
	        case 2: 
	   
			}
			
		}
		while (opcion <= 2);
		
		
		

	}

}
