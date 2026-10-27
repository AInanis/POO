package vista;

import javax.swing.JPanel;
import javax.swing.JTextField;

import DAO.DAO;
import modelo.Persona;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAgregarPersona extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldNombre;
	private JTextField textFieldLocura;
	private JTextField textFieldSecretos;
	private JTextField textFieldUbicacion;

	/**
	 * Create the panel.
	 */
	public PanelAgregarPersona(JFrame marco) {
		setLayout(null);

		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(98, 50, 86, 20);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(22, 53, 46, 14);
		add(lblNewLabel);
		
		JLabel lblLocura = new JLabel("Locura");
		lblLocura.setBounds(22, 98, 46, 14);
		add(lblLocura);
		
		JLabel lblSecretos = new JLabel("Secretos");
		lblSecretos.setBounds(22, 129, 46, 14);
		add(lblSecretos);
		
		JLabel lblUbicacion = new JLabel("Ubicacion");
		lblUbicacion.setBounds(22, 160, 46, 14);
		add(lblUbicacion);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Persona p1 = capturarDatos();
				DAO c = new DAO();
				c.agregarPersonaPorParametro(p1);
				System.out.println("Se agregó con exito");
			}
		});
		btnNewButton.setBounds(264, 94, 120, 93);
		add(btnNewButton);
		
		textFieldLocura = new JTextField();
		textFieldLocura.setColumns(10);
		textFieldLocura.setBounds(98, 95, 86, 20);
		add(textFieldLocura);
		
		textFieldSecretos = new JTextField();
		textFieldSecretos.setColumns(10);
		textFieldSecretos.setBounds(98, 126, 86, 20);
		add(textFieldSecretos);
		
		textFieldUbicacion = new JTextField();
		textFieldUbicacion.setColumns(10);
		textFieldUbicacion.setBounds(98, 157, 86, 20);
		add(textFieldUbicacion);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			marco.setContentPane(new PanelPrincipal(marco));
			marco.validate();
			
			}
		});
		btnVolver.setBounds(10, 254, 89, 23);
		add(btnVolver);

	}
	public Persona capturarDatos() {
		String nombre = textFieldNombre.getText();
		float locura = Float.valueOf(textFieldLocura.getText());
		float ubicacion=Float.valueOf(textFieldUbicacion.getText());
		float secretos=Float.valueOf(textFieldSecretos.getText());
		Persona p = new Persona(nombre, locura, secretos, ubicacion);
		return p;
		}
}
