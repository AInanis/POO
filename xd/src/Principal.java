import java.awt.EventQueue;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel panelPrincipal;
	private CardLayout layoutPrincipal;

	private PanelMundo panelMundo;
	private PanelPersonaje panelPersonaje;
	private PanelCrearPersonaje panelCrearPersonaje;

	private JButton btnMundo;
	private JButton btnAgregarPersonaje;
	private JButton btnCrearPersonaje;
	private JLabel lblNewLabel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {

		setMinimumSize(new Dimension(400, 450));


		layoutPrincipal = new CardLayout();

		getContentPane().setLayout(layoutPrincipal);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		btnMundo = new JButton("Mundo");
		menuBar.add(btnMundo);

		btnAgregarPersonaje = new JButton("Personaje");
		menuBar.add(btnAgregarPersonaje);
		
		btnCrearPersonaje = new JButton("crearPersonaje");
		menuBar.add(btnCrearPersonaje);

		configurarAspectoVentana();
		crearPaneles();
		agregarEventos();
	}

	private void crearPaneles() {
		panelMundo = new PanelMundo();
		panelPersonaje = new PanelPersonaje();
		panelCrearPersonaje = new PanelCrearPersonaje();

		getContentPane().add(panelMundo, "panelMundo");
		panelMundo.setLayout(null);
		
		lblNewLabel = new JLabel("clikea lo q queres hacer");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(112, 186, 145, 14);
		panelMundo.add(lblNewLabel);
		getContentPane().add(panelPersonaje, "panelPersonaje");
		getContentPane().add(panelCrearPersonaje, "panelCrearPersonaje");

	}

	private void agregarEventos() {

		btnMundo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				layoutPrincipal.show(getContentPane(), "panelMundo");
			}
		});

		btnAgregarPersonaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				layoutPrincipal.show(getContentPane(), "panelPersonaje");
			}
		});
		
		btnCrearPersonaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				layoutPrincipal.show(getContentPane(), "panelCrearPersonaje");
			}
		});
	}

	private void configurarAspectoVentana() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
	}
}