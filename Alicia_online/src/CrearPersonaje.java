import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import java.awt.CardLayout;

public class CrearPersonaje extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public CrearPersonaje() {
		setBackground(new Color(192, 192, 192));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Crear personaje");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(22, 27, 344, 47);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("asigna locura");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(32, 110, 88, 25);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("asignar secreto");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(32, 176, 138, 19);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("asignar distancia");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(32, 245, 130, 14);
		add(lblNewLabel_3);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(172, 114, 30, 20);
		add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(172, 177, 30, 20);
		add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(172, 242, 30, 25);
		add(spinner_2);
		
		JButton boton = new JButton("agregar personaje");
		boton.setBounds(31, 325, 171, 23);
		add(boton);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 624, 16);
		add(toolBar);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.windowBorder);
		panel.setBounds(0, 0, 634, 466);
		add(panel);
		panel.setLayout(new CardLayout(0, 0));

	}
}
