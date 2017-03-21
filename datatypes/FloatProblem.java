package datatypes;

import java.math.BigDecimal;
import java.text.*;

public class FloatProblem {
	public static void main(String[] args) {
		float a = 8250325.12f;
		float b = 4321456.31f;
		float c = a + b;
		System.out.println(NumberFormat.getCurrencyInstance().format(c));
		System.out.println("Float's max is " 
				+ NumberFormat.getIntegerInstance().format(Float.MAX_VALUE));

		BigDecimal a1 = new BigDecimal("8250325.12"); 
		BigDecimal b1 = new BigDecimal("4321456.31"); 
		BigDecimal c1 = a1.add(b1);
		System.out.println(NumberFormat.getCurrencyInstance().format(c1));
	}
}
