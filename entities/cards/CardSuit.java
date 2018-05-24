package entities.cards;

public enum CardSuit {
	CLUBS,
	HEARTS,
	DIAMONDS,
	SPADES;
	
	@Override
	public String toString() {
		// Proper casing
		return this.name().substring(0,1) 
				+ this.name().substring(1).toLowerCase();
	}
}
