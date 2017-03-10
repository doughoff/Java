package regex;

import java.util.regex.*;

public class Meerkat {
	public static void main(String[] args) throws Exception {
		// Pattern p = Pattern.compile("(?i)\\bcat(?=[s\\W])");
		   Pattern p = Pattern.compile("(?i)\\bcat(?=[s\\W]?\\b)");
		// change to replace cat, Cat, and cats by dog or dogs

		String input = "one cat, two cats lying in the yard \n";
		input += "one cat, two cats in the catalog \n";
		input += "one cat, two cats located my Russian Blue \n";
		input += "one Meercat, and two big Cats in the city zoo";

		Matcher m = p.matcher(input);
		StringBuffer sb = new StringBuffer();
		boolean result = m.find();

		// Loop through and add replacements to the results StringBuffer
		while (result) {
		m.appendReplacement(sb, "dog");
		result = m.find();
		}
		// Add the last segment of input to the results StringBuffer
		m.appendTail(sb);
		System.out.println(sb.toString());
		}
}
