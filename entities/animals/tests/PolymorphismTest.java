package entities.animals.tests;

import entities.animals.DogMammal;
import entities.animals.HuntingDog;
import entities.animals.Mammal;

public class PolymorphismTest {
	
	// a polymorphic method
	public static void printAll(Object[] objects) {
		for (Object object : objects) {
			System.out.println(object);
		}
	}
	
	public static void main(String[] args) {
		Object o = new Object();
		Mammal m = new DogMammal();
		DogMammal d = new DogMammal();
		HuntingDog hd = new HuntingDog();
		
		Object[] objects = {o, m, d, hd};
		printAll(objects);
	}

}