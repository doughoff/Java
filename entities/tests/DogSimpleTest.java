package entities.tests;

import entities.DogSimple;

public class DogSimpleTest {
	public static void main(String[] args) {
		DogSimple spot = new DogSimple();
		spot.setName("Spot the dog");
		spot.jump();
		spot.setSound("yip");
		spot.bark(5);
		spot.setBreed("Chihuahua");
		System.out.println(spot.getBreed());
	}
}
