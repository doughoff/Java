package methods;

public class RadiusMathTests {
	
	// methods to create
//	Calculate the area of a circle (pi * r2)
	public static double calcAreaOfCircle(double radius) {
		return Math.PI * radius * radius;
	}
	
//	Calculate the volume of a sphere ( 4/3 * pi * r3)
	public static double calcVolumeOfSphere(double radius) {
		return 4/3.0 * Math.PI * Math.pow(radius, 3);
	}
	
	// calculate diameter of circle
	public static double calculateDiameterOfCircle(double radius) {
		System.out.println("Calculating diameter of circle...");
		return 2 * radius;
	}
	
	public static void main(String[] args) {
		
//		initialize variables
		double radius = 5.0;
//		call methods
		double result = calcAreaOfCircle(radius);
//		// print
		System.out.println(result);
		result = calcVolumeOfSphere(radius);
//		// print
		System.out.println(result);
		
		result = calculateDiameterOfCircle(radius);
		System.out.println(result);
	}






}
