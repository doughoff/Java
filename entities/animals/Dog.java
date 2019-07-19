package entities.animals;
import entities.people.*;
import static entities.validators.Validators.*;

import entities.function.TrickTraining;

public class Dog {
	private String name;
	private int age;
	private boolean isHungry;
	private double milesRunToday;
	private Person owner;
	private TrickTraining training;
	
	public Dog() {
		this("No name", 1, true, 0, new Person());
		System.out.println("Dog() - no args");
	}
	public Dog(String name, TrickTraining training) {
		this(name, 1, false, 0, new Person(), null);
	}
	public Dog(String name, int age, boolean isHungry, 
			double milesRunToday, Person owner) {
		this(name, age, isHungry, milesRunToday, owner, null);
		System.out.println("Dog()-5 args" );
	}
	public Dog(String name, int age, boolean isHungry, 
			double milesRunToday, Person owner, TrickTraining training) {
		this.name = name;
		this.setAge(age);
		this.isHungry = isHungry;
		this.milesRunToday = milesRunToday;
		this.owner = owner;
		this.training = training;
		System.out.println("Dog()- 6 args" );		
	}

	@Override
	public String toString() {
		return String.format("Dog: name:%s, age:%d", this.getName(), this.getAge());
	}
	//----------------------------------- getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (hasMinimumCharacters(name, 2)) {
			this.name = name;
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int newAge) {
		if (greaterThan(newAge, 0) && lessThan(newAge, 20)){
			this.age  = newAge;
		}
	}
	public boolean isHungry() {
		return isHungry;
	}
	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}
	public double getMilesRunToday() {
		return milesRunToday;
	}
	public void setMilesRunToday(double milesRunToday) {
		this.milesRunToday = milesRunToday;
	}
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	public void doWhatYoureTrainedToDo() {
		this.bark();
	}
	public void bark() {
		System.out.println("Bark.");
	}
	public void makeSound() {
		this.bark();
	}
	public static void main(String[] args) {
		Dog d2 = new Dog();
		Dog d = new Dog( "Fred", -1, false, 140, new Person() );
		//d.setName("Fred");
		//d.setAge(5);
		System.out.println(d);
		d.setName("Al");
		System.out.println(d);
	}
}
