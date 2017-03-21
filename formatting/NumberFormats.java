package tuesday;

public class NumberFormats {
	public static void main(String[] args) {
		System.out.println(123456789);
		System.out.println(12345.6789);
		System.out.println(0xABCDEF12);
		System.out.println(012345);
		System.out.println(1.2345e67); // 1.2345 * 10^67
		
		System.out.printf("%,.3f \n%,.3f", 12345.6789, 1.2345e67);
		
	}
}
