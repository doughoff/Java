package control.iteration;

public class PowerTests {
	public static void main(String[] args) {
//		Use a loop to print the powers of 2 from 0 to 50.
//			2 ^ 0 = 1
//			2 ^ 1 = 2
//			2 ^ 2 = 4
//			2 ^ 3 = 8
		
		// initialization
		int power = 0;
//		int result = 1;  // dies at 2 ^ 31
//		long result = 1;  // dies at 2 ^ 63
		double result = 1;  // accuracy of ~16 places
		
//		loop
		while (power <= 64) {
			// print
			System.out.println("2 ^ " + power + " = " + result);
			// calculate next
			result = result * 2;
			// step
			power = power + 1;
		}
		
		//cleanup
	}
}
