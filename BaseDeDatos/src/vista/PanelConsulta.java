package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.DAO;
import modelo.Persona;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelConsulta extends JPanel {

	
	private JTable table = new JTable();;
	DAO c = new DAO();
	DefaultTableModel modelo;
	Object[] columnas = new Object[] { "Nombre", "Locura", "Secretos", "Ubicacion" };
	
	public PanelConsulta(JFrame marco) {
		setLayout(null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(71, 57, 243, 172);
		add(scrollPane);
		

		llenarTabla();
		
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Eliminar registro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int filaSeleccionada = table.getSelectedRow()+1;
			c.eliminarPorParametro(filaSeleccionada);
				
			}
		});
		btnNewButton.setBounds(351, 106, 89, 23);
		add(btnNewButton);

	}

	public void llenarTabla() {
	
		modelo = new DefaultTableModel(columnas, 0);
		table.setModel(modelo); //asignamos el modelo a la tabla
		for (Persona p : c.consultar()) { //recorrer el array resultante de mi consulta SQL
		modelo.addRow(new Object[] {p.getNombre(),p.getLocura(),p.getSecretos(),p.getUbicacion()});
		} //agregar las filas con los datos correspondientes

	}
	public void vaciarTabla() {
	modelo.setRowCount(0); 
	}
	
}
