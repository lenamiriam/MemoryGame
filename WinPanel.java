import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class WinPanel extends JPanel {
	
	ImageIcon cardBack = new ImageIcon(this.getClass().getResource("images/shark.jpg"));
	JButton winner = new JButton();
	
	public WinPanel() {
		this.setBorder(new EmptyBorder(0, 0, 0, 0));
		this.setLayout(new GridLayout(0, 1, 0, 0));
		this.setBackground(Color.white);
		
		winner.setIcon(cardBack);
		add(winner);
	}
}
