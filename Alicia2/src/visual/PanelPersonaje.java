package visual;

import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelPersonaje extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelPersonaje(){
		
		setBackground(SystemColor.activeCaptionBorder);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaptionBorder);
		panel.setBounds(0, 0, 630, 436);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido al panel personaje");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(52, 42, 358, 84);
		panel.add(lblNewLabel);

	}

}