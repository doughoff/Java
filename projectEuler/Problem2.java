package projectEuler;

public class Problem2 {
	/*	
	 * // https://projecteuler.net/problem=2
	 * 
	 * Each new term in the Fibonacci sequence is generated 
	 * by adding the previous two terms. By starting with 1 and 2, 
	 * the first 10 terms will be:
	 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	 * By considering the terms in the Fibonacci sequence 
	 * whose values do not exceed four million, 
	 * find the sum of the even-valued terms.
	 */
	
	private long number1;
	private long number2;
	private long maxRange = 4000000;   // sum would be 4613732
	private long sum;
	private long sumOfEvens;
	
	public Problem2(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
		this.sum = number1 + number2;
		if (this.sum % 2 == 0) { this.sumOfEvens = this.sum;}
	}

	public static void main(String[] args) {
		Problem2 p2 = new Problem2(1, 2);
		while (p2.number2 < p2.maxRange) {
			System.out.printf("%d + %d = %d\n", p2.number1, p2.number2, p2.sum);
			p2.number1 = p2.number2;
			p2.number2 = p2.sum;
			p2.sum = p2.number1 + p2.number2;
			if (p2.sum % 2 == 0) { p2.sumOfEvens = p2.sum;}
		}
		System.out.printf("The sum of the evens "
				+ "whose value does not exceed %d was %d\n.", p2.maxRange, p2.sumOfEvens);
	}
}
