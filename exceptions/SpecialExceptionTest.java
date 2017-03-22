package exceptions;

import java.util.Date;

public class SpecialExceptionTest {
	public static void doSomething() throws SpecialException {
		System.out.println("I'm doing something");
		boolean testIsTrue = (true);
		if (testIsTrue) {
			SpecialException se = 
					new SpecialException("An error message on " + new Date());
			se.info = "test info = " + testIsTrue;
			throw se;
		}
	}

	public static void main(String[] args) {
		System.out.println("Starting...");
		try {
			doSomething();
		} catch (SpecialException e) {
			e.log();
			System.err.println("Special Exception " + e);
			System.out.println("Special info was: " + e.info);
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
