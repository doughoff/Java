package oo.basic;

public class Rules {

	public static boolean checkMinimumCharactersIn(String string, int minChars) {
		if (string == null) { return false; }
		if (string.length() < minChars) {
			System.err.println("checkMinimumCharactersIn Dog name = " 
					+ string + " for " + minChars + " characters failed.");
			return false;
		}
		return true;
	}

	public static boolean checkMaximumCharactersIn(String string, int maxChars) {
		if (string == null) { return false; }
		if (string.length() > maxChars) {
			System.err.println("checkMaximumCharactersIn Dog name = " 
					+ string + " for " + maxChars + " characters failed.");
			return false;
		}
		return true;
	}

}
