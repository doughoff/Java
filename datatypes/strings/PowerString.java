package datatypes.strings;

import java.util.Random;

public class PowerString {
	private String string;
	public PowerString(String s) {
		this.string = s;
	}
	public String reverse() {
		// inheritance would allow access to 'this'
		//access this.string and reverse it
		String result = new StringBuilder(this.string)
				.reverse()
				.toString();
		return result;
	}
// DOUG finish this jumble() method..
	public String jumble() {
		String result = "";
		String clone = this.string;
		Random generator = new Random();
		while(result.length() < this.string.length()) {
			result += 
					clone.charAt(generator.nextInt(clone.length()));
			// remove found character
			
		}
		return result;
	}
	public static void main(String[] args) {
		PowerString ps = new PowerString("abcdef");
		System.out.println(ps.reverse());
		System.out.println(ps.jumble());
	}
}
