package visual;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;

import modelo.Comuna;
import modelo.Persona;

import javax.swing.JPasswordField;
import javax.swing.JButton;

public class PanelAltaModificacionPersona extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField DNIp;
	private JTextField nombrep;
	private JTextField apellido;
	JComboBox comboBoxSL;

	/**
	 * Create the panel.
	 */
	public PanelAltaModificacionPersona() {
		setBackground(new Color(128, 128, 128));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Crear Persona");
		lblNewLabel.setBounds(37, 11, 141, 28);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		add(lblNewLabel);
		
		DNIp = new JTextField();
		DNIp.setBounds(123, 50, 86, 20);
		add(DNIp);
		DNIp.setColumns(10);
		
		nombrep = new JTextField();
		nombrep.setBounds(123, 81, 86, 20);
		add(nombrep);
		nombrep.setColumns(10);
		
		comboBoxSL = new JComboBox();
		comboBoxSL.setBounds(123, 147, 86, 22);
		add(comboBoxSL);
		
		JLabel dniP = new JLabel("dni :");
		dniP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		dniP.setBounds(36, 50, 46, 14);
		add(dniP);
		
		apellido = new JTextField();
		apellido.setBounds(123, 116, 86, 20);
		add(apellido);
		apellido.setColumns(10);
		
		JLabel nombreP = new JLabel("nombre:");
		nombreP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		nombreP.setBounds(37, 84, 46, 14);
		add(nombreP);
		
		JLabel apellidoP = new JLabel("apellido");
		apellidoP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		apellidoP.setBounds(36, 119, 46, 14);
		add(apellidoP);
		
		JComboBox comboBoxTipoBarrio = new JComboBox();
		comboBoxTipoBarrio.setBounds(123, 180, 88, 22);
		add(comboBoxTipoBarrio);
		
		JLabel situacionLaboralP = new JLabel("situacion Laboral");
		situacionLaboralP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		situacionLaboralP.setBounds(37, 155, 46, 14);
		add(situacionLaboralP);
		
		JLabel tipoBarrioP = new JLabel("tipo de barrio");
		tipoBarrioP.setBounds(36, 184, 64, 14);
		add(tipoBarrioP);
		
		JButton botonGuardar = new JButton("guardar");
		botonGuardar.setBounds(151, 213, 89, 23);
		add(botonGuardar);
		
		JButton volverP = new JButton("volver");
		volverP.setBounds(27, 251, 89, 23);
		add(volverP);

	}
	
	public void capturarDatos() {
		String dni = DNIp.getText();
		String nombre = nombrep.getText();
		
		
		//float secretos=Float.valueOf(textFieldSecretos.getText());
		//Persona p = new Persona();
	
		}
	
	
	
	
	
	
	
}
