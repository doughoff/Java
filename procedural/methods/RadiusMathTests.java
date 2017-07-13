package procedural.methods;

public class RadiusMathTests {
	
//	Calculate the area of a circle (pi * r2)
	public static double calcAreaOfCircle(double radius) {
		System.out.println("Calculating area of circle...");
		return Math.PI * radius * radius;
	}
	
//	Calculate the volume of a sphere ( 4/3 * pi * r3)
	public static double calcVolumeOfSphere(double radius) {
		System.out.println("Calculating volume of sphere...");
		// remember that 4/3 = 1 in whole number math
		return 4/3.0 * Math.PI * Math.pow(radius, 3);
	}
	
	// calculate diameter of circle
	public static double calculateDiameterOfCircle(double radius) {
		System.out.println("Calculating diameter of circle...");
		return 2 * radius;
	}
	
	public static void main(String[] args) {
//		initialize / setup
		double radius = 5.0;
		System.out.println("Using radius of " + radius);
		
//		call method
		double result = calcAreaOfCircle(radius);
//		print result
		System.out.println("Area: " + result);
		
//		call and print
		result = calcVolumeOfSphere(radius);
		System.out.println("Volume: " + result);
		
		result = calculateDiameterOfCircle(radius);
		System.out.println("Diameter: " + result);
	}






}
