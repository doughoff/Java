package oo.basic;

public class DogWithStaticFields {
	//---------------------- data definition and initialization
	private String name = "Baron the Dog";
	private String breed = "Husky/Shepherd";
	private int age = 2;
	private Person owner;
	private Person vet;
	
	//---------------- static data (class data - one piece of data for all objects)
	// the same for all dogs but can be modified by any object
	private static boolean hasATail;
	private static String kennelName;
	
	static {
		// run code to access a database here to initialize static variables
		hasATail = true;
		kennelName = "Barking Dog Kennel";
	}
	
	// testing
	public static void main(String[] args) {
		// bad form usage of static field
		DogWithStaticFields dog1 = new DogWithStaticFields();
		System.out.println(dog1.name + (dog1.hasATail ? " has" : " does not have") + " a tail.");
		
		DogWithStaticFields dog2 = new DogWithStaticFields();
		dog2.name = "Rover";
		System.out.println(dog2.name + (dog2.hasATail ? " has" : " does not have") + " a tail.");
		
		DogWithStaticFields dog3 = new DogWithStaticFields();
		dog3.name = "Gillie";
		System.out.println(dog3.name + (dog3.hasATail ? " has" : " does not have") + " a tail.");
		
		// good form
		// don't get to the data through the object!
		// use the Class name for class data
		System.out.println("All dogs" + (DogWithStaticFields.hasATail ? " have" : " do not have") 
				+ " a tail.");
		// shortcut while in the class
		System.out.println("All dogs" + (hasATail ? " have" : " do not have") 
				+ " a tail.");
		
		// data can be modified
		System.out.println("All dogs belong to the " + DogWithStaticFields.kennelName);
		DogWithStaticFields.kennelName = "New Barks for Old Dogs Kennel";
		System.out.println("All dogs now belong to the " + kennelName);
		
	}
}
