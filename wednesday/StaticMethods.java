package wednesday;

public class StaticMethods {
	//------------------------------------ data
	
	//------------------------------------ process
	
	public static void calculateAndPrintAreaOfCircle() {
		calculateAndPrintAreaOfCircle(5.0);
	}
	public static double calculateAndPrintAreaOfCircle(double radius) {
		double result = RadiusMathTests.calcAreaOfCircle(radius);
		System.out.printf("The area of circle with radius %f is %f.\n", 
				radius, result);
		return result;
	}
	
	//------------------------------------ test
	public static void main(String[] args) {
		calculateAndPrintAreaOfCircle(5.0);
		calculateAndPrintAreaOfCircle(6.0);
		calculateAndPrintAreaOfCircle();
		
		System.out.println(calculateAndPrintAreaOfCircle(6.0));
	}




}
