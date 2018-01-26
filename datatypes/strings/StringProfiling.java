package datatypes.strings;

public class StringProfiling {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		String aString = "";

		long start = System.currentTimeMillis();
		for (int i = 0; i <= 10000000; i++) { // 10,000,000
			// uses cache to create if needed
			aString = "abc";
			System.out.print((i % 100000 == 0) ? "." : "");
		} // 100,000
		long stop = System.currentTimeMillis();
		
		System.out.println("\nTime for String is: " + (stop - start));

		start = System.currentTimeMillis();
		for (int i = 0; i <= 10000000; i++) {
			// always creates a new object
			aString = new String("abc");
			System.out.print((i % 100000 == 0) ? "." : "");
		}
		stop = System.currentTimeMillis();
		
		System.out.println("\nTime for new String() is: " + (stop - start));

	}
}
