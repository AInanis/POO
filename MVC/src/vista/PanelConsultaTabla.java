package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.conexion;

public class PanelConsultaTabla extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	private JTable table = new JTable();;
	conexion c = new conexion();
	DefaultTableModel modelo;
	Object[] columnas = new Object[] { "Nombre","dni", "NivelEstudio", "Hijos" };
	
	
	public PanelConsultaTabla(JFrame marco) {
       setLayout(null);
       conexion c = new conexion();
       
	}
	
	

}
