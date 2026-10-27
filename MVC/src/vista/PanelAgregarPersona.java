package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;

import modelo.Estudiante;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAgregarPersona extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldNombre;
	private JTextField textFieldDni;

	/**
	 * Create the panel.
	 */
	public PanelAgregarPersona(JFrame marco) {
		setBackground(new Color(128, 128, 128));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("nombre");
		lblNewLabel.setBounds(44, 43, 46, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("estudios");
		lblNewLabel_2.setBounds(44, 158, 46, 14);
		add(lblNewLabel_2);
		
		JCheckBox checkBoxHijos = new JCheckBox("Hij@s");
		checkBoxHijos.setBounds(134, 221, 97, 23);
		add(checkBoxHijos);
		
		JButton btnGuardar = new JButton("guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(185, 290, 89, 23);
		add(btnGuardar);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(121, 40, 86, 20);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JComboBox comboBoxEstudios = new JComboBox();
		comboBoxEstudios.setBounds(118, 154, 89, 22);
		add(comboBoxEstudios);
		
		textFieldDni = new JTextField();
		textFieldDni.setBounds(121, 101, 86, 23);
		add(textFieldDni);
		textFieldDni.setColumns(10);
		
		JLabel lblDni = new JLabel("dni");
		lblDni.setBounds(44, 105, 46, 14);
		add(lblDni);

	}
	
	public Estudiante capturarDatos() {
		String nombre = textFieldNombre.getText();
		String dni = textFieldDni.getText();
		//boolean hijos = checkBoxHijos.get
		//String estudios = comboBoxEstudios.getText();
		Estudiante e = new Estudiante(dni, dni, null, autoscrolls);
	}
}
