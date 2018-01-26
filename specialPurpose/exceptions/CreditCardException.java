package specialPurpose.exceptions;

import java.util.Date;
/**
 * These are Javadocs comments
 * @author Doug Hoff
 */
public class CreditCardException extends Exception {
	private String creditCardNumber;	
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	/**
	 * Message formatted for logging output.
	 */
	@Override
	public String toString() {
		return String.format(
			"Message: %s\n" +
			"Class:   %s\n" +
			"Date:    %tD\n" +
			"Time:    %<tT\n" +   // < means use last value again
			"Credit card: %s\n" 
			, this.getMessage()
			, this.getClass().toString()
			, new Date()
			, this.getCreditCardNumber()
			);
	}

	public CreditCardException(String message) {
		super(message);
	}

}
