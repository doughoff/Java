package oo.basic;

public class DogWithReferences {
	//---------------------- data definition and initialization
	private String name = "Baron the Dog";
	private String breed = "Husky/Shepherd";
	private int age = 2;
	private Person owner;
	private Person vet;
	
	//---------------------------------------- testing
	public static void main(String[] args) {
		DogWithReferences dog = new DogWithReferences();
		System.out.println(dog.owner);  // our dog does not know an owner yet
		DogWithReferences myDog = dog;
		DogWithReferences aHusky = myDog;  // aHusky points to the OBJECT that myDog points to!
		myDog = null;		// the REFERENCE myDog does not point to the object
		System.out.println(aHusky.name);  // aHusky still points to the OBJECT
	}
}
