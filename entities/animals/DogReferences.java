package entities.animals;

public class DogReferences {
	// polymorphic method
	public static void print(Dog[] dogs) {
		for (Dog dog : dogs) {
			// overridden methods WILL be accessed
			System.out.println(dog);
			dog.doWhatYoureTrainedToDo();
			if (dog instanceof HuntingDog) {
				HuntingDog hd = (HuntingDog)dog;
				hd.hunt();            
			}
		}
	}
	
	public static void main(String[] args) {
		HuntingDog yeller = new HuntingDog();
//		Dog rover = new Dog("Rover");
		Dog rover = new HuntingDog("Rover",null,"");
		Object o = new Object();
		
		Dog[] dogs = {yeller, rover};
		print(dogs);
		
		o = yeller;
		// return HuntingDog object back to HD type
		HuntingDog hd = (HuntingDog)o;
	}


}
