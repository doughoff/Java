package entities.animals.tests;

import entities.animals.*;

public class DogTest {
	public static void main(String[] args) {
		Dog rover = new Dog();
		HuntingDog yeller = new HuntingDog();
		
		//polymorphic calls
		System.out.println(rover);
		System.out.println(yeller);
		
		rover.doWhatYoureTrainedToDo();
		yeller.doWhatYoureTrainedToDo();
		
		// advanced version
		Dog y = yeller;
		y.doWhatYoureTrainedToDo();
	}
}
