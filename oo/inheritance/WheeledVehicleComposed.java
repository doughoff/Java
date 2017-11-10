package oo.inheritance;

public class WheeledVehicleComposed {
	// class should describe a set of behavior first!
	// then the data should follow
	private int velocityMph;
	private int bearingDegrees;
	
	// compose/add an object - parent/child relationship
	private TowCapability towCapability; // our optional hitch
	private ClimateControl climateControl;

	public void accelerateToMph(int mphToAccelerateTo) {
		this.velocityMph = mphToAccelerateTo;
		System.out.printf("Accelerated to %d mph.\n", mphToAccelerateTo);
	}

	public void brakeToMph(int mphToBrakeTo) {
		this.velocityMph = mphToBrakeTo;
		System.out.printf("Braked to %d mph.\n", mphToBrakeTo);
	}

	public void turnInDegrees(int degrees) {
		degrees = degrees % 360;
		this.bearingDegrees = this.bearingDegrees + degrees;
		System.out.printf("Turned to %d degrees.\n", degrees);
	}

	public void addTowCapability(int capacityInLbs) {
		TowCapability towing = new TowCapability(capacityInLbs);
		this.towCapability = towing;
		System.out.printf("Towing capacity set to %d lbs.\n", capacityInLbs);
	}
	
	public void hookUp(String thingToHookUp) {
		if (this.towCapability != null) {
			// delegate to composed object of TowCapability
			this.towCapability.hookUp(thingToHookUp);
		} else { 
			System.err.println("You don't have towing capability.");
		}
	}
	
	public void addClimateControl(double temp) {
		ClimateControl temperatureControl = new ClimateControl(temp);
		this.climateControl = temperatureControl;
	}
	
	public static void main(String[] args) {
		// a car is a set of behavior
		WheeledVehicleComposed car = new WheeledVehicleComposed();

		// what do you want the car to do?
		car.accelerateToMph(65);
		car.turnInDegrees(90);
		car.brakeToMph(0);

		// extend the behavior of the car to tow things
		car.addTowCapability(3500);
		// tell the car to tow my trailer
		car.hookUp("trailer");
		car.addClimateControl(72);
	}

}
