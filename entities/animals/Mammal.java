package entities.animals;

public abstract class Mammal {
	//------------------------------ data structure
	private String hairType;
	//------------------------------ abstract methods
	public abstract void eat();
	//------------------------------ constructors
	public Mammal() {
		this("white fuzzy");
	}
	
	public Mammal(String hairType) {
		super();
		this.hairType = hairType;
	}
	//------------------------------ concrete methods
	@Override
	public String toString() {
		return "Mammal [hairType=" + hairType + "]";
	}	
	public String getHairType() {
		return hairType;
	}
	public void setHairType(String hairType) {
		this.hairType = hairType;
	}
	public void sleep(){
		System.out.println("I'm sleeping...");
	}
	
	public static void main(String[] args) {
		Mammal specialMammal = new Mammal() {		
			@Override
			public void eat() {
				System.out.println("I'm eating like a special mammal.");
			}
		};
		specialMammal.eat();
	}
}
