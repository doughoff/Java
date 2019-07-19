package structure.nested;

public class Hand {
	private Finger[] fingers = new Finger[5];
	
	class Finger{} // inner class
	
	public static void main(String[] args) {
		Hand rightHand = new Hand();
		Hand.Finger thumb = rightHand.new Finger();
		Hand.Finger finger2 = new Hand().new Finger();
	}
}

