package procedural.methods;

public class MethodNames {
	// ingredients
	
	// ------------------------------------------------ instructions / methods
	public static void stirBatter() {
		System.out.println("Stirring batter...");
	}
	public static void fillCupcakeCupWithBatter() {
		System.out.println("Filling a foil with cupcake batter...");
	}
	public static void bakeAllCupcakes() {
		System.out.println("I'm baking all the cupcakes....");
	}
	public static void fill12CupcakeCupsWithBatter() {
		for (int i = 0; i < 12; i++) {
			System.out.print(i + ": ");
			fillCupcakeCupWithBatter();
		}
	}	
	//----------------------------------------------------- test
	public static void main(String[] args) {
		// call my methods
//		wednesday.MethodNames.stirBatter();
		stirBatter();
		fill12CupcakeCupsWithBatter();
		bakeAllCupcakes();
		
	}  // end of main

} // end of class
