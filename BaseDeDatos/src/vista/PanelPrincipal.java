package vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelPrincipal extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelPrincipal(JFrame marco) {
		setLayout(null);
		
		JButton btnAgregarPersona = new JButton("Agregar Persona");
		btnAgregarPersona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new PanelAgregarPersona(marco));
				marco.validate();
				
			}
		});
		btnAgregarPersona.setBounds(170, 74, 133, 23);
		add(btnAgregarPersona);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new PanelConsulta(marco));
				marco.validate();
				
			}
		});
		btnConsultar.setBounds(168, 162, 121, 23);
		add(btnConsultar);

	}
}
