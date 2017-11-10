package oo.inheritance;

public class WheeledVehicleInheritance {
	private int velocityMph;
	private int bearingDegrees;
	
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
	public static void main(String[] args) {
		WheeledVehicleInheritance car = new WheeledVehicleInheritance();
		car.accelerateToMph(60);
		car.turnInDegrees(45);
		car.brakeToMph(0);
	}
}
