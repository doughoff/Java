package entities;

import wednesday.CreditCardException;

public class CreditCard {
	private String number;
	private String brand;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) throws CreditCardException {
			rule_LengthIs16(number);
			rule_StartsWith55(number);
//			ruleLuhnAlgorithm(number);
			this.number = number;
	}

	private void rule_StartsWith55(String number) throws CreditCardException {
		if(!number.startsWith("55")) {
			throw new CreditCardException("Didn't start with 55", this.brand);
		}
	}

	private void rule_LengthIs16(String number) throws CreditCardException {
		if(number.length() != 16) {
			throw new CreditCardException("Length is not 16", this.brand);
		}
	}

	public CreditCard(String number, String brand) throws CreditCardException {
		super();
		this.brand = brand;
		this.setNumber(number);
	}

	public static void main(String[] args) {
		try {
			CreditCard cc = new CreditCard("1234567890123456", "MasterCard");
			System.out.println("Credit card was successfully created.");
		} catch (CreditCardException e) {
			e.printStackTrace();
		}
	}
}
