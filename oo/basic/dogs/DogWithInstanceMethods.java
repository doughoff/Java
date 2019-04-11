package oo.basic.dogs;

import oo.basic.Cat;

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
	
	public void goOutside() {
		System.out.println(this.name + " is going outside.");	
	}	
	
	public void printFields() {
		System.out.printf("DogWithInstanceMethods: %s (%s) is %d year%s old\n",
				this.name, this.breed, this.age, (this.age==1 ? "" : "s") );
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
		
		// extra methods
		aDog.bark(3);
		dog2.goOutside();
		// dog2.age = 1; // to test printFields singular/plural
		dog2.printFields();
	}




}
