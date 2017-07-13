package oo.methods;

public class RadiusObject {
	//----------------------------------------------- data
	private double radius;   // defaults to zero
	//----------------------------------------------- getters and setters
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//---------------------------------------------- constructors
	public RadiusObject() {
		// provide a default value
		// this.setRadius(2);
		this(2.0);
		System.out.println("Radius()");
	}
	public RadiusObject(double radius){
		this.setRadius(radius);
		System.out.println("Radius(double)");
	}
	//----------------------------------------------- processes
	@Override
	public String toString() {
		return "Radius [radius=" + radius + "]";
	}
	//	Calculate the area of a circle (pi * r2)
	public double calcAreaOfCircle() {
		return Math.PI * radius * radius;
	}
//	Calculate the volume of a sphere ( 4/3 * pi * r3)
	public double calcVolumeOfSphere() {
		return 4/3.0 * Math.PI * Math.pow(radius, 3);
	}
	// calculate diameter of circle
	public double calculateDiameterOfCircle() {
		System.out.println("Calculating diameter of circle...");
		return 2 * radius;
	}
	//-------------------------------------------------- testing
	public static void main(String[] args) {
		RadiusObject r1 = new RadiusObject();
		// set the radius to 5
		r1.setRadius(5.0);
		RadiusObject r2 = new RadiusObject(10.0);
		
		double result = r1.calcAreaOfCircle();
		System.out.println(result);
		System.out.println(r1.calcVolumeOfSphere());
		System.out.println(r1.calculateDiameterOfCircle());
		
		//System.out.println(r1.toString());
		System.out.println(r1);
	}
}
