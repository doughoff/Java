package specialPurpose.regex;

import java.util.regex.*;

public class EmailValidator {
	public static Pattern emailPattern1 
		= Pattern.compile("(?i)[A-Z0-9._-]+@[A-Z0-9.-]+\\.[A-Z0-9.-]+");
	public static Pattern emailPattern2
		= Pattern.compile("[a-z0-9]+([-+._][a-z0-9]+){0,2}"
				+ "@"
				+ ".*?"
				+ "((?im)\\.("
				+ "a(?:[cdefgilmnoqrstuwxz]|ero|(?:rp|si)a)|"
				+ "b(?:[abdefghijmnorstvwyz]iz)|"
				+ "c(?:[acdfghiklmnoruvxyz]|at|o(?:m|op))|"
				+ "d[ejkmoz]|"
				+ "e(?:[ceghrstu]|du)|"
				+ "f[ijkmor]|"
				+ "g(?:[abdefghilmnpqrstuwy]|ov)|"
				+ "h[kmnrtu]|"
				+ "i(?:[delmnoqrst]|n(?:fo|t))|"
				+ "j(?:[emop]|obs)|"
				+ "k[eghimnprwyz]|"
				+ "l[abcikrstuvy]|"
				+ "m(?:[acdeghklmnopqrstuvwxyz]|il|obi|useum)|"
				+ "n(?:[acefgilopruz]|ame|et)|"
				+ "o(?:m|rg)|"
				+ "p(?:[aefghklmnrstwy]|ro)|"
				+ "qa|"
				+ "r[eosuw]|"
				+ "s[abcdeghijklmnortuvyz]|"
				+ "t(?:[cdfghjklmnoprtvwz]|(?:rav)?el)|"
				+ "u[agkmsyz]|"
				+ "v[aceginu]|"
				+ "w[fs]|"
				+ "y[etu]|"
				+ "z[amw])\b){1,2}");
	public static Pattern space = Pattern.compile("e");
	
	public static void main(String[] args) {
		String textToCheck = "My email address is email@doughoff.com.";
		Matcher m = emailPattern2.matcher(textToCheck);
		while (m.find()) {
		 	System.out.println(m.group());
		 }
	}
}
