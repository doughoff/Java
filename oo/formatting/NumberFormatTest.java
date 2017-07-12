package oo.formatting;

import java.text.*;
import java.util.Locale;

public class NumberFormatTest {
	public static void main(String[] args) {
		NumberFormat cf = NumberFormat.getCurrencyInstance(Locale.CANADA);
		NumberFormat pf = NumberFormat.getPercentInstance();
		NumberFormat nf = NumberFormat.getNumberInstance();

		System.out.println("The amount is " + cf.format(15.99));
		System.out.println("Your chance is " + pf.format(.25));
		System.out.println("The number is " + nf.format(2424));

	}
}
