package oo.basic.dogs;

public class DogDataWithoutObject {
	// a method that uses Dog data
	public static void bark(String dogName, String dogBreed, int dogAge) {
		System.out.println(dogName + " is barking.");
	}

	public static void main(String[] args) {
		// my set of Dog data
		String dogName = "Baron";
		String dogBreed = "Husky/Shepherd";
		int dogAge = 2;

		bark(dogName, dogBreed, dogAge);
	}

}
