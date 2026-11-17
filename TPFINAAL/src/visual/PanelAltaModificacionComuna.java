package visual;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAltaModificacionComuna extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public PanelAltaModificacionComuna() {
		setBackground(new Color(128, 128, 128));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Crear Comuna");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setBounds(25, 11, 188, 46);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(144, 68, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel numeroComuna = new JLabel("numero comuna:");
		numeroComuna.setFont(new Font("Tahoma", Font.PLAIN, 13));
		numeroComuna.setBounds(35, 68, 86, 14);
		add(numeroComuna);
		
		textField_1 = new JTextField();
		textField_1.setBounds(144, 102, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("sede Comunal:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(34, 104, 87, 14);
		add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_2.setBounds(144, 149, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("cantidadBarrios");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(35, 152, 86, 14);
		add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("guardar");
		btnNewButton.setBounds(141, 219, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(32, 263, 89, 23);
		add(btnNewButton_1);

	}
	
	
	
	
	
}
