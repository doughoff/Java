package monday;

public class CountingLoops {
	public static void main(String[] args) {  // main
//		Print from 1 to 25
		for (int i = 1; i <= 25; i++) {
			System.out.println("i = " + i);  // sysout
		}
		System.out.println();
		
//		Print from 25 to 1
		for (int i = 25; i >= 1; i--) {
			System.out.println("i = " + i);
		}
		System.out.println();		
//		Print from 1 to 50 by 2's
		for (int i = 1; i <= 50; i=i+2) {
			System.out.println("i = " + i);
		}
		System.out.println();		
//		Print from 1 to 10 by .5
		for (double i = 1; i <= 10; i=i+.5) {
			System.out.println("i = " + i);
		}
		System.out.println();		

	}
}
