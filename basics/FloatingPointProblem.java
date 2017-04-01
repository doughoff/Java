package basics;

public class FloatingPointProblem {
	public static void main(String[] args) {
		float a = Integer.MAX_VALUE;
		float b = Long.MAX_VALUE;
		float f = a + b;
		System.out.println(f == Long.MAX_VALUE);
		System.out.printf("Because the Long's max value has %d significant digits.\n", ("" + Long.MAX_VALUE).length());
		System.out.printf("The max integer float is %f when converted from %d\n", a, Integer.MAX_VALUE);
		System.out.printf("The max long float is %f when converted from %d\n", b, Long.MAX_VALUE);
		System.out.printf("Floats can only approximate about 7 sigificant digits of accuracy, so you get %f for the sum.\n" , f);
		
		System.out.println();
		System.out.println("Float, 4 bytes: ");
		System.out.println("23 bit mantissa, 8 bit exponent ");
		System.out.println("Precision: ~7.2 digits");
		System.out.println("Range: 1.17549e-38, 3.40282e+38");
		System.out.println();
		System.out.println("Double, 8 bytes:");
		System.out.println("52 bit mantissa, 11 bit exponent ");
		System.out.println("Precision: ~15.9 digits ");
		System.out.println("Range: 2.22507e-308, 1.79769e+308");
	}
}
