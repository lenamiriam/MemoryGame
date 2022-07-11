import java.awt.BorderLayout;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	GridPanel gridPane;
	ScorePanel scorePane;
	WinPanel winPane;
	
	GamePanel() {
		this.setLayout(new BorderLayout(0, 0));
		gridPane = new GridPanel();
		this.add(gridPane, BorderLayout.CENTER);
		
		winPane = new WinPanel();
		this.add(winPane, BorderLayout.NORTH);
		winPane.setVisible(false);
		
		scorePane = new ScorePanel();
		this.add(scorePane, BorderLayout.EAST);
	}

}
