package entities.animals;

import entities.people.Person;

public class DogAggregate {
	//--------------------------------- data definition
	private String breed;
	private String name;
	private Person owner;
	
	//--------------------------------- processes
	public void printInfo() {
		System.out.printf("I'm a %s dog named %s owned by...",
				this.breed, this.name);	
		this.owner.printInfo();
	}	
	//--------------------------------- testing
	public static void main(String[] args) {
		DogAggregate rover = new DogAggregate();
		rover.breed = "Pug";
		rover.name = "Rover";
		rover.owner = new Person();
		// rover.owner.name = "Doug";
		rover.owner.setInfo("Doug", 22, false);
		rover.owner.printInfo();
		
		rover.printInfo();
	}

}
