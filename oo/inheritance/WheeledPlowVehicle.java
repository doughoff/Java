package oo.inheritance;

public class WheeledPlowVehicle extends WheeledVehicleInheritance {
	private boolean isBladeUp = true;
	
	public boolean isBladeUp() {
		return isBladeUp;
	}
	public void setBladeUp(boolean isBladeUp) {
		this.isBladeUp = isBladeUp;
		System.out.println("Blade is " + (isBladeUp? "up": "down"));
	}
	public void setBladeDown() {
		this.setBladeUp(false);
	}
	
	@Override
	public void accelerateToMph(int mphToAccelerateTo) {
		int topSpeed = (isBladeUp) ? 60 : 30;
		
		if (mphToAccelerateTo < topSpeed) {
			super.accelerateToMph(mphToAccelerateTo);
		} else {
			System.err.println("Can't accelerate past " + topSpeed + " mph");
			super.accelerateToMph(topSpeed);
		}
	}

	public static void main(String[] args) {
		WheeledPlowVehicle snowplow = new WheeledPlowVehicle();
		snowplow.setBladeUp(true);
//		snowplow.setBladeUp(false);
		snowplow.setBladeDown();
		snowplow.accelerateToMph(125);
	}
}
