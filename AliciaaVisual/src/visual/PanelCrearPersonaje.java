package visual;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import modelo.Personaje;

import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;

public class PanelCrearPersonaje extends JPanel {

    private static final long serialVersionUID = 1L;

    private JSpinner s1;
    private JSpinner s2;
    private JSpinner s3;
    private JTextField textField;

    private ArrayList<Personaje> personajes;
    private PanelMundo panelMundo;

    public PanelCrearPersonaje(
            ArrayList<Personaje> personajes,
            PanelMundo panelMundo) {

        this.personajes = personajes;
        this.panelMundo = panelMundo;

        setBackground(new Color(192, 192, 192));
        setLayout(null);

        JLabel titulo = new JLabel("Crear personaje");
        titulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
        titulo.setBounds(22, 27, 344, 47);
        add(titulo);

        JLabel lblLocura = new JLabel("Asignar locura");
        lblLocura.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblLocura.setBounds(32, 110, 130, 25);
        add(lblLocura);

        JLabel lblSecreto = new JLabel("Asignar secreto");
        lblSecreto.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblSecreto.setBounds(32, 176, 138, 25);
        add(lblSecreto);

        JLabel lblDistancia = new JLabel("Asignar distancia");
        lblDistancia.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblDistancia.setBounds(32, 245, 140, 25);
        add(lblDistancia);

        s1 = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        s1.setBounds(172, 114, 60, 25);
        add(s1);

        s2 = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        s2.setBounds(172, 177, 60, 25);
        add(s2);

        s3 = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        s3.setBounds(172, 242, 60, 25);
        add(s3);

        textField = new JTextField();
        textField.setEditable(false);
        textField.setBounds(32, 310, 320, 25);
        add(textField);

        JButton crear = new JButton("Crear");
        crear.setBounds(259, 234, 89, 30);
        add(crear);

        crear.addActionListener(e -> {
            int locura = (Integer) s1.getValue();
            int secreto = (Integer) s2.getValue();
            int distancia = (Integer) s3.getValue();

            Personaje nuevo = new Personaje(
                    locura, secreto, distancia);

            personajes.add(nuevo);
            panelMundo.agregarPersonaje(nuevo);

            textField.setText("Personaje creado exito");

            s1.setValue(0);
            s2.setValue(0);
            s3.setValue(0);
        });
    }

	public PanelCrearPersonaje(PanelPersonaje panelPersonaje, PanelMundo panelMundo2) {
		// TODO Auto-generated constructor stub
	}
}