package thursday;

import java.util.Arrays;

public class Egg {
	// ----------------------------- data definition
	private String color;
	private String size;
	private boolean isBad;

	// ---------------------------- getters and setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public boolean isBad() {
		return isBad;
	}

	public void setBad(boolean isBad) {
		this.isBad = isBad;
	}
	// ----------------------------- processes

	// ----------------------------- testing
	public static void main(String[] args) {
		// make an array of eggs
		Egg[] carton = new Egg[12];
		carton[2] = new Egg();
		// a bunch of cartons
		Egg[][] crate = new Egg[30][];
		crate[0] = carton;
		// a unit for crates
		Egg[][][] truck = new Egg[96][][];
		truck[0] = crate;

		System.out.println(truck[0][0][2]);
		truck[0][0][2].color = "white";
		truck[0][0][2].size = "Large";
		System.out.println(truck.length);
		System.out.println(truck[truck.length - 1]); // last place on truck
		System.out.println(truck);

		// print out contents of truck
		for (Egg[][] eachCrate : truck) {
			System.out.println(eachCrate);
		}

		// print out the array - one dim
		System.out.println(Arrays.toString(truck));
		// print out the array - all levels deep
		System.out.println(Arrays.deepToString(truck));
	}
}
