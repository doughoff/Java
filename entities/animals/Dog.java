package entities.animals;

import entities.people.PersonSimple;

public class Dog {
	//--------------------------------- data definition
	private String breed;
	private String name;
	private PersonSimple owner;
	
	//--------------------------------- processes
	public void printInfo() {
		System.out.printf("I'm a %s dog named %s owned by...",
				this.breed, this.name);	
		this.owner.printInfo();
	}	
	//--------------------------------- testing
	public static void main(String[] args) {
		Dog rover = new Dog();
		rover.breed = "Pug";
		rover.name = "Rover";
		rover.owner = new PersonSimple();
		// rover.owner.name = "Doug";
		rover.owner.setInfo("Doug", 22, false);
		rover.owner.printInfo();
		
		rover.printInfo();
	}

}
