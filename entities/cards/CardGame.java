package entities.cards;

import java.util.*;

public class CardGame {
	public static void main(String[] args) {
		// set up a new game
			// create a deck of cards
		List<Card> deck = Card.singleDeck;
		
		// deal a hand of 5 cards from a deck and show them
		Card.shuffleSingleDeck();
		Card.shuffleSingleDeck(5);
		System.out.println(deck);
		// count the remaining cards in the deck
		List<Card> hand = new ArrayList<Card>();
		dealCard(deck, hand);
		dealCard(deck, hand);
		dealCard(deck, hand);
		dealCard(deck, hand);
		dealCard(deck, hand);
		System.out.println(hand);
	}

	private static void dealCard(List<Card> deck, List<Card> hand) {
		Card card1 = deck.get(0);
		deck.remove(card1);
		hand.add(card1);
	}
}
