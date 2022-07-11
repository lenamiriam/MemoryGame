import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ScorePanel extends JPanel {
	JPanel labelScore;
	JPanel buttonPnl;
	
	JLabel label;
	static JLabel number;
	JButton playAgain;
	
	GridPanel gridPane = new GridPanel();
	
	public ScorePanel() {
		this.setBorder(new EmptyBorder(0, 0, 0, 0));
		this.setLayout(new GridLayout(4, 0, 0, 0));
		this.setBackground(Color.white);
		this.setVisible(true);
		
		label = new JLabel("Number of matches");
		number = new JLabel(" " + gridPane.getScore());
		playAgain = new JButton("play again");
		
		this.add(label);
		this.add(number);
		this.add(playAgain);
	}
}
