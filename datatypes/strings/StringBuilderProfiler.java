package datatypes.strings;

public class StringBuilderProfiler {
	public static void main(String[] args) {
		String aString = "abc";
		String bString = "def";
		StringBuilder sb = new StringBuilder("abc");
		
		long start = System.currentTimeMillis();
		for (int i = 0; i <= 100000; i++) {
			aString = aString + bString;
			System.out.print((i % 10000 == 0) ? "." : "");
		}
		long stop = System.currentTimeMillis();
		
		System.out.println("\nTime for String+String is: " + (stop - start));
		
		start = System.currentTimeMillis();
		for (int i = 0; i <= 100000; i++) {
			sb.append("def");
			System.out.print((i % 10000 == 0) ? "." : "");
		}
		stop = System.currentTimeMillis();
		
		System.out.println("\nTime for StringBuilder is: " + (stop - start));

	}
}
