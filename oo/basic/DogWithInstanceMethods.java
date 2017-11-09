package oo.basic;

import wednesday.Cat;

public class DogWithInstanceMethods {
	//---------------------- data definition and initialization
	private String name = "Baron the Dog";
	private String breed = "Husky/Shepherd";
	private int age = 2;
	
	// -------------------- instance methods
	public void bark() {
		System.out.println(this.name + " is barking.");
	}

	public void barkAtCat(Cat cat) {
		System.out.println(this.name + " is barking at a cat.");
	}	
	
	public void barkAtAnotherDog(DogWithInstanceMethods dog2) {
		System.out.println(this.name + " is barking at " + dog2.name);
	}
	
	public void bark(int numberOfTimes) {
		for (int i = 0; i < numberOfTimes; i++) {
			this.bark();  // delegate barking to other method
		}
	}
	
	// testing
	public static void main(String[] args) {
		new DogWithInstanceMethods();  // Dog has no reference, a lost dog
		DogWithInstanceMethods aDog = new DogWithInstanceMethods();
		aDog.bark();
		Cat aCat = new Cat();
		aDog.barkAtCat(aCat);
		DogWithInstanceMethods dog2 = new DogWithInstanceMethods();
		dog2.name = "Gillie";
		aDog.barkAtAnotherDog(dog2);
		
		// extra method
		aDog.bark(3);
	}
}
