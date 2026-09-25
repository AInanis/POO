import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;

public class visualJuanito extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					visualJuanito frame = new visualJuanito();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public visualJuanito() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 450, 600, 450);
		 JPanel panel = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		JButton boton1 = new JButton("comer");
		
		
		contentPane.setLayout(null);
		boton1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		boton1.setBounds(20, 65, 168, 40);
		contentPane.add(boton1);
		
		JLabel label = new JLabel("welcome Juanito");
		label.setBackground(new Color(0, 255, 255));
		label.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label.setLabelFor(this);
		label.setBounds(18, 0, 309, 40);
		contentPane.add(label);
		
		JProgressBar barraPorgresiva = new JProgressBar();
		barraPorgresiva.setBounds(20, 40, 231, 14);
		contentPane.add(barraPorgresiva);
		
		JButton boton2 = new JButton("PanzaLlena");
		boton2.setFont(new Font("Tahoma", Font.PLAIN, 20));

		boton2.setBounds(20, 117, 168, 40);
		contentPane.add(boton2);
		
		JButton boton3 = new JButton("digerir");
		boton3.setVisible(true);
		boton3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				boton3.addActionListener(null);
				barraPorgresiva.setValue(0);
			}
		});
		boton3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		boton3.setBounds(20, 177, 168, 44);
		contentPane.add(boton3);
		
		JButton boton4 = new JButton("crecer");
		boton4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				barraPorgresiva.add(boton4);
			}
		});
		boton4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		boton4.setBounds(20, 232, 168, 40);
		contentPane.add(boton4);
		
		JButton boton5 = new JButton("aprender");
	
		boton5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		boton5.setBounds(20, 294, 168, 44);
		contentPane.add(boton5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(279, 78, 30, 22);
		contentPane.add(comboBox);
		panel.add(comboBox);
		panel.add(boton1);
		panel.add(boton4);
		panel.add(barraPorgresiva);
		panel.add(boton5)	;	
		panel.add(label);
		panel.add(boton2);
		panel.add(boton3);
		}
}
