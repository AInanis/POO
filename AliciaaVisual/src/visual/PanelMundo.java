package visual;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;

import modelo.Personaje;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

public class PanelMundo extends JPanel {

    private static final long serialVersionUID = 1L;

    private ArrayList<Personaje> personajes;
    private DefaultListModel<Personaje> modelo;
    private JList<Personaje> lista;

    public PanelMundo(ArrayList<Personaje> personajes) {

        this.personajes = personajes;

        setBackground(new Color(192, 192, 192));
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(128, 128, 128));
        panel.setBounds(0, 0, 581, 430);
        panel.setLayout(null);
        add(panel);

        JLabel titulo = new JLabel("Bienvenido al mundo");
        titulo.setBounds(109, 15, 300, 35);
        titulo.setFont(new Font("Tahoma", Font.PLAIN, 23));
        panel.add(titulo);

        JLabel lblLista = new JLabel("Personajes creados:");
        lblLista.setBounds(25, 60, 200, 25);
        panel.add(lblLista);

        modelo = new DefaultListModel<>();
        lista = new JList<>(modelo);

        JScrollPane scroll = new JScrollPane(lista);
        scroll.setBounds(25, 90, 420, 150);
        panel.add(scroll);

        JButton btnNormal =
                new JButton("hay algún personaje normal?");
        btnNormal.setBounds(25, 260, 250, 25);
        panel.add(btnNormal);

        JButton btnCantidad =
                new JButton("cuántos personajes hay?");
        btnCantidad.setBounds(25, 300, 250, 25);
        panel.add(btnCantidad);

        JLabel resultado = new JLabel("");
        resultado.setBounds(25, 340, 450, 25);
        panel.add(resultado);

        btnNormal.addActionListener(e -> {
            boolean hayNormal = false;

            for (Personaje p : personajes) {
                if (p.getLocura() == 0) {
                    hayNormal = true;
                    break;
                }
            }

            if (hayNormal) {
                resultado.setText("hay un personaje con locura ");
            } else {
                resultado.setText("no hay personajes normales");
            }
        });

        btnCantidad.addActionListener(e -> {
            resultado.setText(
                    "Cantidad de personajes: " + personajes.size());
        });
    }

    public void agregarPersonaje(Personaje personaje) {
        modelo.addElement(personaje);
    }
}