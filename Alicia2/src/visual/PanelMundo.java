package visual;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class PanelMundo extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelMundo() {
		setBackground(new Color(192, 192, 192));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(-15, 0, 581, 321);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido al mundo");
		lblNewLabel.setBounds(109, 24, 246, 47);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setBackground(SystemColor.desktop);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ver si hay algun personaje normal");
		btnNewButton.setBounds(10, 109, 194, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("cuantos personajes estan en maravilla");
		btnNewButton_1.setBounds(233, 109, 230, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("encontrar personajes lindos ");
		btnNewButton_2.setBounds(10, 168, 203, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Personaje con mayor locura");
		btnNewButton_3.setBounds(139, 228, 194, 23);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("ver si hay mas lindos que normales");
		btnNewButton_4.setBounds(233, 164, 230, 30);
		panel.add(btnNewButton_4);
		
		JTextField b67 = new JTextField();
		b67.setText("eleji lo q queres hacer ");
		b67.setBounds(150, 65, 120, 20);
		panel.add(b67);
		b67.setColumns(10);

	}
}