package procedural.methods;

public class MethodsWithReturns {
	
	//------------------------------------ data structure / ingredients
	
	//------------------------------------ methods
	public static String bakeACupcake() {
		MethodNames.fillCupcakeCupWithBatter();
		MethodNames.bakeAllCupcakes();
		return "a cupcake";
	}
	public static String getFrosting() {
		return "chocolate frosting";
	}	
	public static String getSprinkles() {
		return "multicolor sprinkles";
	}
	
	//------------------------------------- test
	public static void main(String[] args) {
		String cupcake = bakeACupcake();
		String frosting = getFrosting();
		cupcake += " with ";
		cupcake += frosting;
		
		String sprinkles = getSprinkles();
		cupcake += " and ";
		cupcake += sprinkles;
		
		System.out.println("I've got " + cupcake);
		
	}  // end of main



} // end of class
