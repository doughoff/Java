package oo.basic;

public class NumberPair {
	// data definition - two double fields firstNumber, secondNumber
	private double firstNumber;
	private double secondNumber;
	
	// instance methods - calcSum():double, calcDifference(): double
	@Override
	public String toString() {
		return "NumberPair [firstNumber=" + this.getFirstNumber()
			+ ", secondNumber=" + this.getSecondNumber()
			+ "]";
	}
	
	public double calcDifference() {
		double result = this.getFirstNumber() - this.getSecondNumber();
		return result;
	}
	public double calcSum() {
		return this.getFirstNumber() + this.getSecondNumber();
	}	
	// common members - toString(), getters/setters, constructors - no-arg, all-arg
	//-------------------------------------- constructors
	public NumberPair() {
		this(0.0, 0.0);
	}
	public NumberPair(double first, double second) {
		super();
		this.setFirstNumber(first);
		this.setSecondNumber(second);
	}
	//-------------------------------------- getters/setters
	public double getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	public double getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	// test with main()
	public static void main(String[] args) {
		NumberPair np1 = new NumberPair();
		System.out.println(np1);
		NumberPair np2 = new NumberPair(2.3, 4.5);
		System.out.println(np2);
		
		// test instance methods
		double result = np2.calcSum();
		System.out.printf("The sum of the values in np2 was %f\n", result);
		System.out.printf("The difference of the values in np2 was %,f\n", np2.calcDifference());
		
		result = np1.calcSum();
		System.out.printf("The sum of the values in np1 was %f\n", result);
		System.out.printf("The difference of the values in np1 was %,f\n", np1.calcDifference());
	}
}
