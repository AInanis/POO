import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

public class PanelMundo extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelMundo() {
		setBackground(new Color(192, 192, 192));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 571, 418);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido al mundo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setBackground(SystemColor.desktop);
		lblNewLabel.setBounds(135, 45, 246, 47);
		panel.add(lblNewLabel);

	}
}