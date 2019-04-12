package dataStructures.arrays;

import java.util.Arrays;

public class Egg {
	//------------------------------- data structure
	// stuff it knows about, its qualities
	private String size; // S, L, XL
	
	//------------------------------- methods
	// what the egg does when you talk to it
	
	@Override
	public String toString() {
		return "Egg [size=" + size + "]";
	}

	//------------------------------- test
	public static void main(String[] args) {
		Egg egg = new Egg();
		egg.size = "L";
		System.out.println(egg);
		
		// make a carton - 1-dim array
		// holds refs to Egg objects
		Egg[] carton = new Egg[12];
		// put the egg in the carton
		carton[0] = egg;
		// print the carton
//		System.out.println(carton);
		System.out.println(Arrays.deepToString(carton));
		
		// make a crate - 2-dim array
		// holds refs to 1-dim arrays (cartons)
		Egg[][] crate = new Egg[24][];
		// put the carton in the crate
		crate[0] = carton;
		System.out.println(Arrays.deepToString(crate));
		
		// make a egg truck - 3-dim array
		// hold refs to 2-dim arrays (crates)
		Egg[][][] truck = new Egg[3][][];
		// load the truck
		truck[0] = crate;
		System.out.println(Arrays.deepToString(truck));
	}
}
