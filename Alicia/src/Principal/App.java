package Principal;

import DAO.DAO;

public class App {

	public static void main(String[] args) {
		DAO miPrimerDAO = new DAO();
		DAO dao2 = new DAO();
		dao2.agregar();
		miPrimerDAO.eliminar(0);
		

	}

}
