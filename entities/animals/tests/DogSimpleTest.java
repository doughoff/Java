package entities.animals.tests;

import entities.animals.DogWithStaticAndGetSets;

public class DogSimpleTest {
	public static void main(String[] args) {
		DogWithStaticAndGetSets spot = new DogWithStaticAndGetSets();
		spot.setName("Spot the dog");
		spot.jump();
		spot.setSound("yip");
		spot.bark(5);
		spot.setBreed("Chihuahua");
		System.out.println(spot.getBreed());
	}
}
