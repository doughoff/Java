package control;

public class FizzBuzz {
	public static void main(String[] args) {
//		Write a program that prints the numbers from 1 to 100. 
		boolean doNotPrintNumber = false;
		boolean mod3, mod5;
		for (int i = 1; i <= 100; i++) {
			mod3 = (i%3 == 0); 
			mod5 = (i%5 == 0);
//			But for multiples of three print “Fizz” 
			// instead of the number and 
//			for the multiples of five print “Buzz”. 
//			For numbers which are multiples of both three and five 
			// print “FizzBuzz”.
			System.out.print(mod3 ? "Fizz" : "");
			System.out.print(mod5 ? "Buzz" : "");
			System.out.println((mod3 || mod5) ? "" : i);
		}
	}
}
