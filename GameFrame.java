import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	private GamePanel gp;
	
	public GameFrame() {
		
		this.setTitle("Memory");
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 200, 1200, 600);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(GameFrame.class.getResource("")));
		gp = new GamePanel();
		this.setContentPane(gp);
	}
}
