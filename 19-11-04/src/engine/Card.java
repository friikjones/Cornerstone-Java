package engine;

public class Card {
	private int value;
	private String faceValue;
	private Suites suite;
	private boolean faceUp;
	
	public static int cardWidth = 64;
	public static int cardHeight = 89;
	
	public Card() {
		value = 1;
		faceValue = convertValue(value);
		suite = Suites.Clubs;
		faceUp = true;
	}
	public Card(String input) {
		faceValue = input;
		value = convertValue(faceValue);
		suite = Suites.Clubs;
		faceUp = true;
	}
	public Card(int input) {
		value = input;
		faceValue = convertValue(value);
		suite = Suites.Clubs;
		faceUp = true;
	}
	public Card(String input, Suites suiteInput) {
		faceValue = input;
		value = convertValue(faceValue);
		suite = suiteInput;
		faceUp = true;
	}
	public Card(int input, Suites suiteInput) {
		value = input;
		faceValue = convertValue(value);
		suite = suiteInput;
		faceUp = true;
	}
	
	public boolean getFaceUp() {
		return faceUp;
	}
	
	public int getValue() {
		return value;
	}
	
	public Suites getSuite(){
		return suite;
	}
	
	public static Card generateRandomCard(boolean Joker) {
		Card newCard = new Card();
		int cardGen = 0;
		if(Joker) {
			cardGen =  (int) Math.floor(Math.random() * 13) + 1;	
		}else {
			cardGen =  (int) Math.floor(Math.random() * 12) + 1;
		}
		newCard.faceValue = newCard.convertValue(cardGen);
		newCard.value = cardGen;
		int suiteGen =  (int) Math.floor(Math.random() * 4) + 1;
		switch (suiteGen) {
		case 1:
			newCard.suite = Suites.Clubs;
			break;
		case 2:
			newCard.suite = Suites.Hearts;
			break;
		case 3:
			newCard.suite = Suites.Spades;
			break;
		case 4:
			newCard.suite = Suites.Diamonds;
			break;
		}
		return newCard;
	}
	
	public void flipCard() {
		faceUp = !faceUp;
	}
	
	public String cardPrintOut() {
		String outputString = "";
		outputString = (faceValue+" of "+suite+"("+faceUp+")");
		return outputString;
	}
	
	public void consolePrintOut() {
		System.out.println(faceValue+" of "+suite+"("+faceUp+")");
	}
	
	private String convertValue(int input) {
		switch (input) {
		case 0:
			return " ";
		case 1:
			return "A";
		case 2:
			return "2";
		case 3:
			return "3";
		case 4:
			return "4";
		case 5:
			return "5";
		case 6:
			return "6";
		case 7:
			return "7";
		case 8:
			return "8";
		case 9:
			return "9";
		case 10:
			return "10";
		case 11:
			return "J";
		case 12:
			return "Q";
		case 13:
			return "K";
		case 14:
			return "R";

		}
		return "error";
	}
	private int convertValue(String input) {
		switch (input) {
		case " ":
			return 0;
		case "A":
			return 1;
		case "2":
			return 2;
		case "3":
			return 3;
		case "4":
			return 4;
		case "5":
			return 5;
		case "6":
			return 6;
		case "7":
			return 7;
		case "8":
			return 8;
		case "9":
			return 9;
		case "10":
			return 10;
		case "J":
			return 11;
		case "Q":
			return 12;
		case "K":
			return 13;
		case "R":
			return 14;

		}
		return 0;
	}
	
}
