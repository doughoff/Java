package entities.animals;

public class HuntingDog extends DogMammal {
	private String huntsFor;
	//------------------------------------------ constructors
	public HuntingDog() {
		this("long golden", "Rover",2, "Lab", true, "ducks");
	}
	public HuntingDog(String hairType, String name, int age, String breed, boolean isMale, String huntsFor) {
		super(hairType, name, age, breed, isMale);
		this.huntsFor = huntsFor;
	}	
	//------------------------------------------getters and setters
	public String getHuntsFor() {
		return huntsFor;
	}

	public void setHuntsFor(String huntsFor) {
		this.huntsFor = huntsFor;
	}
	//----------------------------------------- instance methods
	public void hunt() {
		System.out.println("I'm hunting for " + this.getHuntsFor());
	}

	@Override
	public String toString() {
		return "HuntingDog [huntsFor=" + huntsFor + ", toString()=" + super.toString() + "]";
	}
	//-------------------------------------------testing
	public static void main(String[] args) {
		HuntingDog hd = new HuntingDog();
		System.out.println(hd);
		hd.setHuntsFor("ducks");
		hd.bark();
		hd.hunt();
	}


}
