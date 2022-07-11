import java.awt.EventQueue;
import javax.swing.JFrame;

public class MemoryGame extends JFrame {
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable( ) {
			@Override
			public void run() {
				try {
					GameFrame game = new GameFrame();
					game.setVisible(true);
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
	}
	
}
