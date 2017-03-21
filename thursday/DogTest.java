package thursday;

public class DogTest {
	public static void main(String[] args) {
		Dog spot = new Dog();
		spot.setName("Spot the dog");
		spot.jump();
		spot.setSound("yip");
		spot.bark(5);
		spot.setBreed("Chihuahua");
		System.out.println(spot.getBreed());
	}
}
