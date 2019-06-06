package projectEuler;

public class Problem1 {
	// https://projecteuler.net/problem=1
	
	/* If we list all the natural numbers below 10 
	 * that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
	 * The sum of these multiples is 23. 
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	*/
	private int sum;
	private int candidate;
	
	public static int maxExclusiveRange = 1000;
	
	public boolean candidateIsMultipleOf3Or5() {
		boolean isMultipleOf3 = this.candidate % 3 == 0;
		boolean isMultipleOf5 = this.candidate % 5 == 0;
		boolean result = isMultipleOf3 || isMultipleOf5;
		return result;
	}
	
	public  void printSum() {
		System.out.printf("The sum of all multiples of 3 or 5 "
				+ "below %d is %,d.\n", maxExclusiveRange, this.sum);
	} 
	
	public static void main(String[] args) {
		Problem1 p1 = new Problem1();
		
		// calculate sum
		for (p1.candidate = 0; p1.candidate < maxExclusiveRange; p1.candidate++) {
			if (p1.candidateIsMultipleOf3Or5()) {
				p1.sum += p1.candidate;
			}
		}
		p1.printSum();
	}


}
