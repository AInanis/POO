package visual;

import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.Persona;

import javax.swing.JLabel;
import javax.swing.JButton;

public class agregarPersonaje extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldNombre;
	private JTextField textFieldLocura;
	private JTextField textFieldUbicacion;
	private JTextField textFieldSecretos;

	/**
	 * Create the panel.
	 */
	public agregarPersonaje() {
		setLayout(null);
		
		textFieldSecretos = new JTextField();
		textFieldSecretos.setBounds(161, 181, 86, 20);
		add(textFieldSecretos);
		textFieldSecretos.setColumns(10);
		
		textFieldUbicacion = new JTextField();
		textFieldUbicacion.setBounds(161, 128, 86, 20);
		add(textFieldUbicacion);
		textFieldUbicacion.setColumns(10);
		
		textFieldLocura = new JTextField();
		textFieldLocura.setBounds(161, 80, 86, 20);
		add(textFieldLocura);
		textFieldLocura.setColumns(10);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(161, 32, 86, 20);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("nombre");
		lblNewLabel.setBounds(46, 35, 46, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("locura ");
		lblNewLabel_1.setBounds(57, 83, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ubicacion");
		lblNewLabel_2.setBounds(57, 131, 46, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("secretos");
		lblNewLabel_3.setBounds(46, 184, 46, 14);
		add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("crear");
		btnNewButton.setBounds(161, 231, 89, 23);
		add(btnNewButton);

	}
	
	public Persona capturarDatos() {
		String nombre = textFieldNombre.getText();
		float 
	}

	public JTextField getTextFieldNombre() {
		return textFieldNombre;
	}

	public void setTextFieldNombre(JTextField textFieldNombre) {
		this.textFieldNombre = textFieldNombre;
	}

	public JTextField getTextFieldLocura() {
		return textFieldLocura;
	}

	public void setTextFieldLocura(JTextField textFieldLocura) {
		this.textFieldLocura = textFieldLocura;
	}

	public JTextField getTextFieldUbicacion() {
		return textFieldUbicacion;
	}

	public void setTextFieldUbicacion(JTextField textFieldUbicacion) {
		this.textFieldUbicacion = textFieldUbicacion;
	}

	public JTextField getTextFieldSecretos() {
		return textFieldSecretos;
	}

	public void setTextFieldSecretos(JTextField textFieldSecretos) {
		this.textFieldSecretos = textFieldSecretos;
	}

}
