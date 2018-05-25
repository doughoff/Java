package specialPurpose.regex;

import java.util.regex.*;

public class Meerkat {
	public static void main(String[] args) throws Exception {
		// change to replace cat, Cat, and cats by dog or dogs
		// e.g. Pattern p = Pattern.compile("cat");
		Pattern p = Pattern.compile("your regex here");
		String input = "one cat, two cats playing in catsup \n";
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



























// answer 1
// Pattern p = Pattern.compile("(?i)\\bcat(?=[s\\W])");
// answer 2
// Pattern p = Pattern.compile("(?i)\\bcat(?=[s\\W]?\\b)");
//test alternative answer from Austin
// Pattern p = Pattern.compile("(?i)\\bcat(?=[s]?\\b)");