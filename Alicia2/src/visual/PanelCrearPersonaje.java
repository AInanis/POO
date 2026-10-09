package visual;

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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class PanelCrearPersonaje extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PanelCrearPersonaje() {
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
		
		JSpinner s1 = new JSpinner();
		s1.setBounds(172, 114, 30, 20);
		add(s1);
		
		JSpinner s2 = new JSpinner();
		s2.setBounds(172, 177, 30, 20);
		add(s2);
		
		JSpinner s3 = new JSpinner();
		s3.setBounds(172, 242, 30, 25);
		add(s3);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.windowBorder);
		panel.setBounds(0, 0, 800, 800);
		add(panel);
		panel.setLayout(null);
		JTextField t1 = new JTextField();
		t1.setVisible(false);
		textField.setBounds(262, 194, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		JButton crear = new JButton("crear");
		crear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t1.setVisible(true);
				t1.setText("creaste Personaje exitoso");
				s1.setValue(0);
				s2.setValue(0);
				s1.setValue(0);
			}
		});
		crear.setBounds(259, 234, 89, 23);
		panel.add(crear);
		
		

	}
}