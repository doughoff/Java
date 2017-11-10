package oo.inheritance;

public class WheeledTowingVehicle extends WheeledVehicleInheritance {
	// data definition
	private int capacityInLbs;
	private String pulledThing;
	
	public WheeledTowingVehicle(int capacityInLbs) {
		this.capacityInLbs = capacityInLbs;
	}

	public void hookUp(String pulledThing) {
		this.pulledThing = pulledThing;
		System.out.printf("Hitched a %s\n", pulledThing);
	}
	
	public static void main(String[] args) {
		WheeledTowingVehicle truck = new WheeledTowingVehicle(3500);
		// access to all superclass (parent) methods
		truck.accelerateToMph(75);
		truck.turnInDegrees(90);
		truck.brakeToMph(0);
		
		// test specific Towing methods
		truck.hookUp("trailer");
	}
}
