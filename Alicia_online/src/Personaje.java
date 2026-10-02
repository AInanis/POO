import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JToolBar;

public class Personaje extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Personaje() {
		setBackground(SystemColor.activeCaptionBorder);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaptionBorder);
		panel.setBounds(0, 0, 630, 436);
		add(panel);
		panel.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 766, 16);
		panel.add(toolBar);

	}

}
