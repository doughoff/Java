package oo.basic.dogs;

public class DogWithConstructors {
	// ---------------------- data definition
	private String name;
	private String breed;
	private int age;
	
	@Override
	public String toString() {
		return "DogWithToString: ["
				+ "name = " + this.name  + ", "
				+ "breed = " + this.breed  + ", "
				+ "age = " + this.age 
				+ "]";
	}	
	
	//------------------------ constructors
	// no-arg / all default data
	public DogWithConstructors() {
		// "this()" refers to a constructor in this class
		this("Baron the Dog","Husky/Shepherd", 2);
		System.out.println("DogWithConstructors no-args");
	}
	
	public DogWithConstructors(String name, String breed, int age) {
		super();
		// "this" refers to object being created
		this.name = name;
		this.breed = breed;
		this.age = age;
		System.out.println("DogWithConstructors 3-args");
	}

	public static void main(String[] args) {
		// creating Dog with all default data
		DogWithConstructors dog = new DogWithConstructors();
		System.out.println(dog);
		
		// creating Dog with all my data
		DogWithConstructors myDog = new DogWithConstructors("Rover", "Beagle", 5);
		System.out.println(myDog);
	}
}
