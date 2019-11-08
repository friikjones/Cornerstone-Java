package engine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import userInterface.AppWindow;

public class GameManager implements ActionListener{
	
	private Card testCard;
	private Deck deck;
	private PlayerHand player, house;
	private boolean someoneWin;
	private AppWindow window;
	private HouseAI houseAI;
	public boolean gameOver;
	
	public void initialize(AppWindow window) {
		this.window = window;
		deck = new Deck(false);
		deck.initializeDeck();
		deck.shuffleDeck();
		
		house = new PlayerHand(deck);
		player = new PlayerHand(deck);
		house.drawNewCard(2);
		house.getCardsInHand()[0].flipCard();
		player.drawNewCard(2);
		
		houseAI = new HouseAI(this);
		gameOver = false;

	}
	
	public PlayerHand getPlayer() {
		return player;
	}

	public PlayerHand getHouse() {
		return house;
	}

	public Card[] getPlayerCards(PlayerHand target) {
		Card[] output = new Card[target.getHandSize()-1];
		output = target.getCardsInHand();
		return output;
	}

	public void setPlayerCards(PlayerHand target, Card[] inputCards) {
		target.clearHand();
		for (int i = 0; i < inputCards.length; i++) {
			target.addCard(inputCards[i]);
		}
	}
	
	public String checkWinner() {
		String winnerString = "";
		if(house.currentHandValue() > 21 || 
				(player.currentHandValue() > house.currentHandValue() && player.currentHandValue() < 22)) {
			winnerString = "Player";
		}else {
			winnerString = "House";
		}

		return winnerString;
	}
	
	public boolean checkBurst() {
		if(house.currentHandValue() > 21)
			return true;
		if(player.currentHandValue() > 21)
			return true;
		else {
			return false;
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0);
		JButton button = (JButton) arg0.getSource();
		if(button.getText() == "Hit Me!") {
			player.drawNewCard(1);
			player.consoleListHand();
			window.updateLabels();	
		}
		
		if(button.getText() == "I'm OK.") {
			gameOver = true;
			System.out.println("house should buy: "+houseAI.checkIfShouldBuy());
			house.getCardsInHand()[0].flipCard();
			window.updateLabels();
			while(houseAI.checkIfShouldBuy()) {
				house.drawNewCard(1);
				System.out.println("house draw.");
				window.updateLabels();
			}
			System.out.println("Someone burst: "+checkBurst());
			System.out.println("winner: "+checkWinner());
		}
	}
	
}
