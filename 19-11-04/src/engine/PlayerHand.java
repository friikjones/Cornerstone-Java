package engine;

import java.util.ArrayList;
import java.util.Iterator;

public class PlayerHand {
	private ArrayList<Card> hand;
	private Deck gameDeck;
	
	public PlayerHand(Deck gameDeck) {
		hand = new ArrayList<Card>();
		this.gameDeck = gameDeck;
	}
		
	public void drawNewCard(int cards) {
		for (int i = 0; i < cards; i++) {
			hand.add(gameDeck.drawTopCard());	
		}
	}
	
	public int getHandSize() {
		return hand.size();
	}
	
	public Card[] getCardsInHand() {
		Card[] outputCards = new Card[hand.size()];
		for (int i = 0; i < hand.size(); i++) {
			outputCards[i] = hand.get(i);
		}
		return outputCards;
	}
	
	public void clearHand() {
		for (Card card : hand) {
			hand.remove(card);
		}
	}
	
	public void consoleListHand() {
		for (Card card : hand) {
			card.consolePrintOut();
		}
	}
	
	public int currentHandValue() {
		int output = 0;
		for (Card card : hand) {
			output += card.getValue();
		}
		return output;
	}
	
	public int currentHandValueBlackjack() {
		int output = 0;
		int aces = 0;

		for (Card card : hand) {
			if(card.getValue() == 1) {
				aces ++;
				output ++;
				continue;
			}
			if(card.getValue() == 11 || card.getValue() == 12 || card.getValue() == 13) {
				output +=10;
				continue;
			}
			output += card.getValue();
		}
		for (int i = 0; i < aces; i++) {
			if(output < 12) {
				output += 10;
			}else {
				continue;
			}
		}

		return output;
	}

	public void addCard(Card newCard) {
		hand.add(newCard);
	}

}
