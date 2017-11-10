package oo.basic;

public class DogWithToString {
	// ---------------------- data definition and initialization
	private String name = "Baron the Dog";
	private String breed = "Husky/Shepherd";
	private int age = 2;

	@Override
	public String toString() {
		return "DogWithToString: ["
				+ "name = " + this.name  + ", "
				+ "breed = " + this.breed  + ", "
				+ "age = " + this.age 
				+ "]";
	}

	public static void main(String[] args) {
		DogWithToString dog = new DogWithToString();
		// print the dog - implicit call to toString()
		System.out.println(dog);
		// component methods used to create Object's toString()
		System.out.println(dog.getClass());
		System.out.println(dog.hashCode());
		// explicit call to toString()
		System.out.println(dog.toString());
	}
}
