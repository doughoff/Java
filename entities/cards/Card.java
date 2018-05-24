package entities.cards;

import java.util.*;

public class Card {
	private CardSuit suit;
	private CardValue value;
	public static List<Card> singleDeck = new ArrayList<Card>();
	static {
		initializeSingleDeck();
	}

	public Card(CardSuit suit, CardValue value) {
		super();
		this.suit = suit;
		this.value = value;
	}
	public static void initializeSingleDeck() {
		singleDeck.clear();
		for (CardSuit cs: CardSuit.values()) {
			for (CardValue cv: CardValue.values()) {
				singleDeck.add(new Card(cs, cv));
			}
		}
	}
	
	@Override
	public String toString() {
		return value  + " of " + suit ;
	}
	public static void main(String[] args) {
		System.out.println(singleDeck);
		System.out.println();
		Collections.shuffle(singleDeck);
		System.out.println(singleDeck);
	}
}
