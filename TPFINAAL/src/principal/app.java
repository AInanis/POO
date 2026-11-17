package principal;

import dao.conexion;
import modelo.Comuna;

public class app {

	public static void main(String[] args) {
		Comuna c1 = new Comuna (4,"sede comunal 3", 67);
		Comuna c = new Comuna(2, "sede comunal 8", 9);
		conexion d = new conexion();
         d.conectar();
         d.actualizarComunaPorParametro(c, c1);
         
	}

}
