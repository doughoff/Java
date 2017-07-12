package specialPurpose.exceptions;

import jdk.JavadocsExample;

public class ExceptionHandling {
	public static void main(String[] args) {
		int x = 1;
		boolean isXZero = (x == 0);
		
		if(isXZero){
			System.out.println("X was zero");
		} else {
			System.err.println("Problem here!");
			//throw new Exception("X was not zero.");
		}
		
		try { 
			System.out.println(5/0);
		} 
		catch (Exception e) {
			System.err.println(e.getMessage());
			handleAnyException(e);
		}
		
		JavadocsExample p = null;
		try { 
			System.out.println(p.address);
		} 
		catch (Exception e) {
			handleAnyException(e);
		}
		
		// do more stuff
		System.out.println("end of program");
	}

	public static void handleAnyException(Exception e) {
		try {
			throw e;
		} catch (ArithmeticException ae){
			System.err.println(ae + " was caught.");
		} catch (ArrayIndexOutOfBoundsException aioobe){
			System.err.println(aioobe);
		} catch (NullPointerException npe) {
			System.err.println("Null used! Check for initialization.");
		} catch (Exception ex){
			System.err.println("Generic exception");
		}
		
	}
}
