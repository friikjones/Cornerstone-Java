package engine;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private int size;
	private ArrayList<Card> deckList;
	private boolean withJoker;
	
	public Deck(boolean Joker) {
		deckList = new ArrayList<Card>();
		withJoker = Joker;
		if(withJoker) {
			size = 52;
		}
		else {
			size = 48;
		}
	}
	
	public Deck() {
		this(true);
	}
	
	public void initializeDeck() {
		Suites array[] = Suites.values();
		int amountOfCards = (withJoker) ? 13 : 12;
		for (int i = 0; i < size; i++) {
			Card newCard = new Card((i%amountOfCards)+1,array[i/amountOfCards]);
			deckList.add(newCard);
		}
	}
	
	public void addCard(Card newCard) {
		deckList.add(newCard);
	}
	
	public Card drawTopCard() {
		Card outputCard = new Card();
		outputCard = deckList.get(deckList.size()-1);
		deckList.remove(deckList.size()-1);
		return outputCard;
	}
	
	public Card drawBottomCard() {
		Card outputCard = new Card();
		outputCard = deckList.get(0);
		deckList.remove(0);
		return outputCard;
	}
	
	public void shuffleDeck() {
		Collections.shuffle(deckList);
	}
	
	public void printOutDeck() {
		for (int i = 0; i < deckList.size(); i++) {
			deckList.get(i).consolePrintOut();
		}
	}
	
}
