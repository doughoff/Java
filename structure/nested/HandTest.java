package structure.nested;

public class HandTest {
	public static void main(String[] args) {
		Hand rightHand = new Hand();
		Hand.Finger thumb = rightHand.new Finger();
		Hand.Finger finger2 = new Hand().new Finger();
	}
}
