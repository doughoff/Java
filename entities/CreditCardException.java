package entities;

public class CreditCardException extends Exception {
	private String brand;
	
	public CreditCardException(String message, String brand) {
		super(message);
		System.err.println(brand + " credit card creation failed.");
	}
}
