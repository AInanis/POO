
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
import java.awt.Color;
import javax.swing.JComboBox;

public class juanito extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	// Esta variable nos dice si Juanito tiene la panza llena
	private boolean panzaLlena = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					juanito frame = new juanito();
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
	public juanito() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 450, 600, 450);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// BOTON 1 - COMER
		JButton boton1 = new JButton("comer");

		boton1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		boton1.setBounds(20, 65, 168, 40);
		contentPane.add(boton1);

		// BARRA PROGRESIVA
		JProgressBar barraPorgresiva = new JProgressBar();
		barraPorgresiva.setBounds(20, 40, 231, 14);
		barraPorgresiva.setMinimum(0);
		barraPorgresiva.setMaximum(100);
		contentPane.add(barraPorgresiva);

		// EVENTO DEL BOTON COMER
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int valorActual = barraPorgresiva.getValue();

				barraPorgresiva.setValue(valorActual + 20);

				if (barraPorgresiva.getValue() >= 100) {
					barraPorgresiva.setValue(100);
					panzaLlena = true;
				}
			}
		});

		// LABEL
		JLabel label = new JLabel("welcome Juanito");
		label.setBackground(new Color(0, 255, 255));
		label.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label.setBounds(18, 0, 309, 40);
		contentPane.add(label);

		// BOTON 2 - PANZA LLENA
		JButton boton2 = new JButton("PanzaLlena");
		boton2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		boton2.setBounds(20, 117, 168, 40);
		contentPane.add(boton2);

		// EVENTO DEL BOTON PANZA LLENA
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (panzaLlena == true) {
					System.out.println("Juanito tiene la panza llena");
				} else {
					System.out.println("Juanito NO tiene la panza llena");
				}
			}
		});

		// BOTON 3 - DIGERIR
		JButton boton3 = new JButton("digerir");

		boton3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		boton3.setBounds(20, 177, 168, 44);
		contentPane.add(boton3);

		// EVENTO DEL BOTON DIGERIR
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				barraPorgresiva.setValue(0);
				panzaLlena = false;
			}
		});

		// BOTON 4 - CRECER
		JButton boton4 = new JButton("crecer");

		boton4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		boton4.setBounds(20, 232, 168, 40);
		contentPane.add(boton4);

		// EVENTO DEL BOTON CRECER
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("Juanito esta creciendo");
			}
		});

		// BOTON 5 - APRENDER
		JButton boton5 = new JButton("aprender");

		boton5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		boton5.setBounds(20, 294, 168, 44);
		contentPane.add(boton5);

		// EVENTO DEL BOTON APRENDER
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (panzaLlena == true) {
					System.out.println("Juanito puede aprender");
				} else {
					System.out.println("Juanito no puede aprender porque tiene hambre");
				}
			}
		});

		// COMBOBOX
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(279, 78, 100, 22);
		contentPane.add(comboBox);
	
	}
}

