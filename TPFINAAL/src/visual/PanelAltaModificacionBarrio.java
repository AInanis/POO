package visual;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAltaModificacionBarrio extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public PanelAltaModificacionBarrio() {
		setBackground(new Color(128, 128, 128));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create Barrio");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setBounds(23, 11, 208, 21);
		add(lblNewLabel);
		
		JLabel nombreB = new JLabel("nombre :");
		nombreB.setBounds(33, 43, 46, 14);
		add(nombreB);
		
		textField = new JTextField();
		textField.setBounds(105, 43, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(105, 87, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel hectariaB = new JLabel("hectarea");
		hectariaB.setBounds(33, 90, 46, 14);
		add(hectariaB);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(105, 141, 86, 22);
		add(comboBox);
		
		JComboBox tipoBarrioB = new JComboBox();
		tipoBarrioB.setBounds(105, 191, 86, 22);
		add(tipoBarrioB);
		
		JLabel ComunaB = new JLabel("comuna que va a pertenecer");
		ComunaB.setBounds(37, 133, 58, 39);
		add(ComunaB);
		
		JLabel lblNewLabel_4 = new JLabel("tipo Barrio");
		lblNewLabel_4.setBounds(37, 195, 58, 14);
		add(lblNewLabel_4);
		
		JButton botonGuardar = new JButton("guardar");
		
		botonGuardar.setBounds(135, 229, 89, 23);
		add(botonGuardar);
		
		JButton botonVolver = new JButton("volver");
		botonVolver.setBounds(10, 266, 89, 23);
		add(botonVolver);

	}

}
