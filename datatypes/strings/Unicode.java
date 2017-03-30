package datatypes.strings;

public class Unicode {
	public static void main(String[] args) {
		System.out.println("encylop\u00E6dia");
		// look up symbols in http://ampwhat.com
		// or unicode.org
		System.out.println("\u20AC1000.00"); // euro
		String euro = "\u20AC";
		System.out.println(euro + "1000.00");
		String yen   = "\u0045";
		System.out.println(yen + "1000.00");
		String pound = "\u00A3";
		System.out.println(pound + "1000.00");
		String cents = "\u00A2";
		System.out.println("50" + cents);
		System.out.println(50 + cents);
		System.out.println("He said \"Yes\"");
	}
}
