package oo.inheritance;

public class TowCapability {
	// data definition
	private int capacityInLbs;
	private String pulledThing;
	
	
	// no no-arg constructor
	
	public TowCapability(int capacityInLbs) {
		this.capacityInLbs = capacityInLbs;
	}

	public void hookUp(String pulledThing) {
		this.pulledThing = pulledThing;
		System.out.printf("Hitched a %s\n", pulledThing);
	}
	
	public static void main(String[] args) {
		TowCapability towing = new TowCapability(3500);
		towing.hookUp("popup trailer");
	}

}
