package specialPurpose.exceptions;

import java.io.*;

public class CreditCardProcessor {
	public void divertErrorsToFile(String filename) {
		 try {
			System.setOut(new PrintStream(new File(filename)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void validate(String cc) 
			throws CreditCardException {
		// check minimum length
		if (cc.length() != 16) {
			CreditCardException cce = 
					new CreditCardException("Length not 16");
			cce.setCreditCardNumber(cc);
			throw cce;
		}
	}
	
	public static void main(String[] args) {
		// set up
		CreditCardProcessor ccp = new CreditCardProcessor();
		
		// get credit card
		String cc = "1234567890123456";
		String ccBad = "123456789";
		
		// validate it and then process it
		try {
			ccp.validate(ccBad);
			// send to processor
		} catch (CreditCardException e) {
			System.err.println(e);
		}
		System.out.println("Program ends.");
	}


}
