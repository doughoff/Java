package oo.basic;

public class DogWithGettersAndSetters {
	// ---------------------- data definition and initialization
	private String name = "Baron the Dog";
	private String breed = "Husky/Shepherd";
	private int age = 2;

	
	// ---------------------- getters and setters - see DogTest
	public String getName() {
		return "The Honorable Canine King " + name;
	}

	public void setName(String candidateName) {
		// initialization
		boolean isValid = true;

		// rule - minimum characters = 1
		isValid = isValid && Rules.checkMinimumCharactersIn(candidateName, 1);
		// rule - maximum characters = 30
		isValid = isValid && Rules.checkMaximumCharactersIn(candidateName, 30);

		if (isValid) {
			this.name = candidateName;
		}
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
