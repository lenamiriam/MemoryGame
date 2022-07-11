import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Card extends JButton {
	// fields
	ImageIcon cardBack = new ImageIcon("images/backpattern.jpg");
	ImageIcon[] cards;
	String[] pictures = {"images/cherry.jpg", "images/ghost.png", 
						"images/heart.jpg", "images/icecube.png",
						"images/mario.jpg", "images/mouse.jpg",
						"images/pacman.png", "images/spaceinvader.jpg"};
	
	//constructor
	public Card() {
		
	}

	public Card(ImageIcon cardBack, ImageIcon[] cards, String[] pictures) {
		super();
		this.cardBack = cardBack;
		this.cards = cards;
		this.pictures = pictures;
	}

	public ImageIcon getCardBack() {
		return cardBack;
	}

	public void setCardBack(ImageIcon cardBack) {
		this.cardBack = cardBack;
	}

	public ImageIcon[] getCards() {
		return cards;
	}

	public void setCards(ImageIcon[] cards) {
		this.cards = cards;
	}

	@Override
	public String toString() {
		return "Card [cardBack=" + cardBack + ", cards=" + Arrays.toString(cards) + ", pictures="
				+ Arrays.toString(pictures) + "]";
	}
	
	
}
