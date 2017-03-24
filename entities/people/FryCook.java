package entities.people;

import entities.function.TeachingBehavior;

public class FryCook extends PersonWithBehavior {
	private String restaurant;
	public FryCook() {
		this("Doug the cook", null, "Good Food Cafe");
	}
	public FryCook(String name, TeachingBehavior teachingTraining, String restaurant) {
		super(name, teachingTraining);  // passing Person data to superclass
		this.restaurant = restaurant;   // using FryCook data here
	}
	
	@Override
	public String toString() {
		return "FryCook [restaurant=" + restaurant + 
				", toString()=" + super.toString() + "]";
	}
	public void fry(){
		System.out.println("I'm making fries...");
	}

	public static void main(String[] args) {
		FryCook cook = new FryCook();
		cook.talk();
		cook.teach();
		cook.fry();
	}
}
