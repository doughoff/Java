package friday;

public class NumberPair {

	//-------------------------------- data structure
	private double firstNumber;
	private double secondNumber;
	//-------------------------------- getters and setters
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
	//--------------------------------------------------- constructors
	public NumberPair() {
		this(5.6, 7.8);
	}
	public NumberPair(double firstNumber, double secondNumber) {
		super();
		this.setFirstNumber(firstNumber);
		this.setSecondNumber(secondNumber);
	}
	//--------------------------------------------------- instance methods
	@Override
	public String toString()  {
		return "NumberPair [firstNumber=" + getFirstNumber() + ", secondNumber=" + getSecondNumber() + "]";
	}	
	public double calcDifference() {
		return this.getFirstNumber() - this.getSecondNumber();
	}
	public double calcSum() {
		return this.getFirstNumber() + this.getSecondNumber();
	}	
	//--------------------------------------------------------- testing
	public static void main(String[] args) {
		NumberPair np1 = new NumberPair();
		NumberPair np2 = new NumberPair(1.2, 3.4);
		System.out.println(np1);
		System.out.println(np2);
		double result = np1.calcSum();
		System.out.println("The sum was " + result);
		System.out.printf("The rounded sum was %.2f\n", result);
		result = np1.calcDifference();
		System.out.println("The difference was " + result);
	}
}
