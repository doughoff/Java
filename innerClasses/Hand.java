package innerClasses;

public class Hand {
	private String belongsToPerson;
	private Hand.Finger[] fingers;
	
	public Hand() {
		
	}
	private class Finger{
		private int number;
	}
	
	
	public static void main(String[] args) {
		Hand myHand = new Hand();
		Hand.Finger myFingerOnMyHand = myHand.new Finger();
		Hand.Finger aNewFingerOnNewHand = new Hand().new Finger();
	}
}
