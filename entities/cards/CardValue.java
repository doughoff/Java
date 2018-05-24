package entities.cards;

public enum CardValue {
	ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), 
	EIGHT(8), NINE(9), TEN(10), JACK(11), 
	QUEEN(12), KING(13);

	private int value;

	CardValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		// Proper casing on named cards, digits on others
		switch (this.name()) {
			case "ACE":
			case "JACK":
			case "QUEEN":
			case "KING":
				return this.name().substring(0, 1) 
						+ this.name().substring(1).toLowerCase();
			default:
				return "" + this.value;
		}
	}

	public static void main(String[] args) {
		for (CardValue cv : CardValue.values()) {
			System.out.printf("%s %s = %d%n", cv.name(), cv, cv.ordinal());
		}
	}
}
