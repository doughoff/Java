package datatypes;

public class PrimitiveSampler {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte b;
		short s;
		int i;
		long g;
		char c;
		boolean boo;
		float f;
		double d;
		
		g = 128;
		i = (int) g;
		System.out.println(Integer.MAX_VALUE);
		b = (byte) 128;
		System.out.println(b);
		System.out.println(Byte.MAX_VALUE);
		
		f = (float) 100.0;
		f = 100.0f;
		System.out.println(f);
		d = 1234567890.123456789;
		System.out.println(d);
		
	}
}
