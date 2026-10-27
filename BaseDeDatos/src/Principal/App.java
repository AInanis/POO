package Principal;

import java.util.ArrayList;

import javax.swing.JFrame;

import DAO.DAO;
import modelo.Persona;
import vista.PanelPrincipal;

public class App {

	public static void main(String[] args) {
	
		JFrame marco = new JFrame();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setBounds(100,100,500,500);
		marco.setContentPane(new PanelPrincipal(marco));
		marco.validate();
		
		
		}
	}


