package visual;

import java.awt.EventQueue;
import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

import modelo.Personaje;

import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.util.ArrayList;

public class Principal extends JFrame {

    private static final long serialVersionUID = 1L;

    private CardLayout layoutPrincipal;

    private PanelMundo panelMundo;
    private PanelPersonaje panelPersonaje;
    private PanelCrearPersonaje panelCrearPersonaje;

    private JButton btnMundo;
    private JButton btnAgregarPersonaje;
    private JButton btnCrearPersonaje;

    private ArrayList<Personaje> personajes;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Principal frame = new Principal();
            frame.setVisible(true);
        });
    }

    public Principal() {

        setTitle("Mi mundo de personajes");
        setMinimumSize(new Dimension(600, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 650, 500);

        personajes = new ArrayList<>();

        layoutPrincipal = new CardLayout();
        getContentPane().setLayout(layoutPrincipal);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        btnMundo = new JButton("Mundo");
        menuBar.add(btnMundo);

        btnAgregarPersonaje = new JButton("Personaje");
        menuBar.add(btnAgregarPersonaje);

        btnCrearPersonaje = new JButton("Crear personaje");
        menuBar.add(btnCrearPersonaje);

        crearPaneles();
        agregarEventos();

        layoutPrincipal.show(
                getContentPane(), "panelMundo");

        setLocationRelativeTo(null);
    }

    private void crearPaneles() {

        panelMundo = new PanelMundo(personajes);

        panelPersonaje = new PanelPersonaje();

        panelCrearPersonaje =
                new PanelCrearPersonaje(personajes, panelMundo);

        getContentPane().add(panelMundo, "panelMundo");
        getContentPane().add(panelPersonaje, "panelPersonaje");
        getContentPane().add(
                panelCrearPersonaje, "panelCrearPersonaje");
    }

    private void agregarEventos() {

        btnMundo.addActionListener(e -> {
            layoutPrincipal.show(
                    getContentPane(), "panelMundo");
        });

        btnAgregarPersonaje.addActionListener(e -> {
            layoutPrincipal.show(
                    getContentPane(), "panelPersonaje");
        });

        btnCrearPersonaje.addActionListener(e -> {
            layoutPrincipal.show(
                    getContentPane(), "panelCrearPersonaje");
        });
    }
}