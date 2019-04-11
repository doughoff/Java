package oo.basic.dogs;

public class DogTest {
	public static void main(String[] args) {
		// test DogWithGettersAndSetters
		DogWithGettersAndSetters dog = new DogWithGettersAndSetters();
		System.out.println(dog.getName());
		dog.setName("Big Dog");
		System.out.println(dog.getName());
	}
}
