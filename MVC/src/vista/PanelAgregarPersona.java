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
import javax.swing.JList;

public class PanelAgregarPersona extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldNombre;
	private JTextField textFieldDni;
	private JComboBox<String> comboBoxEstudios ;
	private JCheckBox checkBoxHijos;
	private JTextField textField;
	private JTextField textfieldañoNacimiento;
	private JTextField textField_1;
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
		
		checkBoxHijos = new JCheckBox("Hij@s");
		checkBoxHijos.setBounds(143, 239, 97, 23);
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
		
		comboBoxEstudios = new JComboBox<String>();
		comboBoxEstudios.setBounds(118, 154, 89, 22);
		add(comboBoxEstudios);
		
		textFieldDni = new JTextField();
		textFieldDni.setBounds(121, 101, 86, 23);
		add(textFieldDni);
		textFieldDni.setColumns(10);
		
		JLabel lblDni = new JLabel("dni");
		lblDni.setBounds(44, 105, 46, 14);
		add(lblDni);
		
		JLabel lblNewLabel_1 = new JLabel("año nacimiento");
		lblNewLabel_1.setBounds(44, 208, 72, 23);
		add(lblNewLabel_1);
		
		textfieldañoNacimiento = new JTextField();
		textField.setBounds(138, 209, 86, 20);
		add(textField);
		
		JList list = new JList();
		list.setBounds(333, 261, 1, 1);
		add(list);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 209, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		textfieldañoNacimiento.setColumns(10);
		
	}	
	
	public Estudiante capturarDatos() {
		String nombre = textFieldNombre.getText();
		String dni = textFieldDni.getText();
		boolean hijos = checkBoxHijos.isSelected();
		String estudios = comboBoxEstudios.getSelectedItem().toString();
		Estudiante e = new Estudiante(nombre,dni,estudios,hijos);
		return e;
	}
}