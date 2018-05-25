package specialPurpose.regex;

import java.util.regex.*;

public class RegexEvaluator {
	public static String text = "It was the best of times, it was the worst of times,\n"
			+ "it was the age of wisdom, it was the age of foolishness,\n"
			+ "it was the epoch of belief, it was the epoch of incredulity,\n"
			+ "it was the season of Light, it was the season of Darkness,\n"
			+ "it was the spring of hope, it was the winter of despair,\n"
			+ "we had everything before us, we had nothing before us,\n"
			+ "we were all going direct to Heaven, we were all going direct the other way--\n"
			+ "in short, the period was so far like the present period,\n"
			+ "that some of its noisiest authorities insisted on its being received,\n"
			+ "for good or for evil, in the superlative degree of comparison only.";
	
	public static void outputMatches(String _input)  {
		Pattern p = Pattern.compile(_input);
		System.out.println("\nMatches using " + p.pattern() + "\n---------------");
		Matcher m = p.matcher(text);
		while (m.find()) { 
			System.out.println(m.group()); 
			//System.out.println(" " + m.group().length() + " characters");
			}
		}

//	Find these patterns:
//		od
//		.*od
//		o.*d
//		o.{5}d
//		(?i)o.{5}d
//		o.\w*
//		Same as the last one with a space before it
//	----------------------------------
//	Write patterns to find:
//	The line with the letters "it" at the beginning (not a capital I). (4 matches) 
//	And try case insensitive too! (5 matches)
//	words ending in "s“ (20 matches)
//	words with a capital letter (4 matches)

	public static void main(String[] args) throws Exception {
		outputMatches("find this pattern");
	}

}
