import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GridPanel extends JPanel {
	
	int numButtons;
	
	static String pictures[]= {"images/cherry.jpg", "images/ghost.png", 
			"images/heart.jpg", "images/icecube.png",
			"images/mario.jpg", "images/mouse.jpg",
			"images/pacman.png", "images/spaceinvader.jpg"};
	
	static JButton[] buttons;
	ImageIcon cardBack = new ImageIcon(this.getClass().getResource("images/backpattern.png"));
	ImageIcon[] icons;
	private ImageIcon temp;
	static int score = 0;
	private boolean gameOver;
	
	Timer myTimer;
	int openImages;
	public int currentIndex;
	public int oddClickIndex;
	public int numClicks;
	
	public GridPanel() {
		this.setBorder(new EmptyBorder(0, 0, 0, 0));
		this.setLayout(new GridLayout(0, 4, 0, 0));
		this.setBackground(Color.white);
		this.setVisible(true);
		this.addButtons();
	}
	
	public void addButtons() {
		numButtons = pictures.length * 2; // to match up we need an array of pictures * 2
		buttons = new JButton[numButtons];
		icons = new ImageIcon[numButtons];
		
		for (int i = 0, j = 0; i < pictures.length; i++) {
			icons[j] = new ImageIcon(this.getClass().getResource(pictures[i]));
			j = makeButtons(j);
			
			icons[j] = icons[j - 1];
			j = makeButtons(j);
		}	
			
		Random rnd = new Random();
		for (int i = 0; i < numButtons; i++) {
			int j = rnd.nextInt(numButtons);
			temp = icons[i];
			icons[i] = icons[j];
			icons[j] = temp;
		}
		
		myTimer = new Timer(1000, new TimerListener());
	}

	private int makeButtons(int j) {
		buttons[j] = new JButton("");
		buttons[j].addActionListener(new GridPanel.ImageButtonListener());
		buttons[j].setIcon(cardBack);
		buttons[j].setBackground(Color.white);
		add(buttons[j++]);
		return j;
	}
	
	private class TimerListener extends Object implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			buttons[currentIndex].setIcon(cardBack);
			buttons[oddClickIndex].setIcon(cardBack);
			myTimer.stop();
		}
	}
	
	private class ImageButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(myTimer.isRunning()) {
				return;
			}
			
			openImages++;
			System.out.print(openImages);
			
			for (int i = 0; i < numButtons; i++) {
				if (e.getSource() == buttons[i]) {
					buttons[i].setIcon(icons[i]);
					currentIndex = i;
				}
			}
			
			if (openImages % 2 == 0) {
				if (currentIndex == oddClickIndex) {
					numClicks--;
					return;
				}
				
				if(icons[currentIndex] != icons[oddClickIndex]) {
					myTimer.start();
				} else {
					score++;
					System.out.print("Score: " + score);
					if (score == 0) {
						setGameOver(true);
						//setVisible(false;)
					}
				}
			} else {
				oddClickIndex = currentIndex;
			}
		}
	}
	
	public static void setScore(int score) {
		GridPanel.score = score;
	}

	public int getScore() {
		return score;
	}
	
	public boolean isGameOver() {
		return gameOver;
	}
	
	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}
}
