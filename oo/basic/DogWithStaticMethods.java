package oo.basic;

public class DogWithStaticMethods {
	//---------------------- data definition and initialization
	private String name = "Baron the Dog";
	private String breed = "Husky/Shepherd";
	private int age = 2;
	
	
	// a static method that uses Dog data
	public static void bark(DogWithStaticMethods dogData) {
		System.out.println(dogData.name + " is barking.");
	}
	public static void barkAtCat(DogWithStaticMethods dog, Cat cat) {
		System.out.println(dog.name + " is barking at a cat.");
	}
	private static void barkAtAnotherDog(DogWithStaticMethods dog, DogWithStaticMethods dog2) {
		System.out.println(dog.name + " is barking at " + dog2.name);
	}
	
	// testing
	public static void main(String[] args) {
		new DogWithStaticMethods();  // Dog has no reference, a lost dog
		DogWithStaticMethods aDog = new DogWithStaticMethods();
		bark(aDog);
		Cat aCat = new Cat();
		barkAtCat(aDog, aCat);
		DogWithStaticMethods dog2 = new DogWithStaticMethods();
		dog2.name = "Gillie";
		barkAtAnotherDog(aDog, dog2);
	}




}
