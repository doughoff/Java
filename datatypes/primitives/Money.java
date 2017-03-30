package datatypes.primitives;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
// or
// import java.math.*;

public class Money {
	public static void main(String[] args) {
		
		runMoney();
	}

	public static void runMoney() {
		// doubles lose accuracy after 16 places
		double amount1 = 12345.678901234567890;
		System.out.println(amount1);
		System.out.println(amount1 * 2);
		
		// BigDecimals keep almost infinite accuracy
		BigDecimal bd1 = new BigDecimal("12345.6789012345678901");
		System.out.println(bd1);
		System.out.println(bd1.add(bd1));
		// need another BigDecimal to do math with
		BigDecimal bdTwo = new BigDecimal(2);
		System.out.println(bd1.multiply(bdTwo));
		
		// set the significant digits
		MathContext eighteenPlaces = new MathContext(18);
		BigDecimal bd3 = new BigDecimal("56789012345.678901567890", eighteenPlaces);
		System.out.println(bd3);
		// keep only six places to right of decimal place
		bd3 = bd3.setScale(6, RoundingMode.HALF_EVEN);
		System.out.println(bd3);
		// show formatted version of number with commas
		System.out.printf("$%,f", bd3);
	}
}
