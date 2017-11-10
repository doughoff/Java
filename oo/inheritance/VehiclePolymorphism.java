package oo.inheritance;

public class VehiclePolymorphism {
	
	// polymorphic method - one message to different objects, different behavior
	public static void accelerateArrayToMph(WheeledVehicleInheritance[] 
			vehicles, int desiredMph) {
		// will the snowplow accelerate to 70?
		for (WheeledVehicleInheritance vehicle : vehicles) {
			vehicle.accelerateToMph(desiredMph); // polymorphism call
		}
	}
	
	public static void main(String[] args) {
		Object o = new WheeledVehicleInheritance();
		
		WheeledVehicleInheritance car = new WheeledVehicleInheritance();
		WheeledTowingVehicle truck = new WheeledTowingVehicle(3500);
		WheeledPlowVehicle snowplow = new WheeledPlowVehicle();
		
		WheeledVehicleInheritance[] vehicles = {car, truck, snowplow};
		
		accelerateArrayToMph(vehicles, 70);
	}

}
