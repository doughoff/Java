package specialPurpose.exceptions;

public class ExceptionTest {
	public static void main(String[] args) {
		doExceptionTest(args);
		System.out.println("Program ends.");
	}

	public static void doExceptionTest(String[] args) {
		try {
			createException(args);
		} catch (ArithmeticException e) {
			System.err.println("Bad math.");
		} catch (NoSuchMethodError e) {
			System.err.println("Method doesn't exist.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array not big enough.");
			System.err.println(e.getMessage());
			System.err.println(e.getClass().toString());
			System.err.println("Cause = " + e.getCause());
			System.err.println(e);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static void createException(String[] args) {
		System.out.println("0 = " + args[0]);
		System.out.println("1 = " + args[1]);
	}
}
