package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class PanelPrincipal extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PanelPrincipal(JFrame marco) {
		setBackground(new Color(128, 128, 128));
		setForeground(new Color(0, 0, 0));
		setLayout(null);
		
		JButton btnNuevo = new JButton("nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane( new PanelAgregarPersona(marco));
				marco.validate();
			}
		});
		btnNuevo.setBounds(357, 76, 89, 23);
		add(btnNuevo);
		
		JButton btnEliminar = new JButton("eliminar");
		btnEliminar.setBounds(357, 149, 89, 23);
		add(btnEliminar);
		
		JButton btnModificar = new JButton("modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new PanelAgregarPersona(marco));
			}
		});
		btnModificar.setBounds(357, 223, 89, 23);
		add(btnModificar);
		
		table = new JTable();
		table.setBounds(95, 121, 156, 156);
		add(table);
		
	
		
		

	}
}
