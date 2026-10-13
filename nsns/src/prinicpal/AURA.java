package prinicpal;

import dao.DAO;

public class AURA {

	public static void main(String[] args) {
		DAO miPrimerDAO = new DAO();
        miPrimerDAO.conectar();
        DAO miSegundoDAO = new DAO();
        miSegundoDAO.agregar();
	}

}
