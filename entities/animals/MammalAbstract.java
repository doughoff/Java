package entities.animals;

public abstract class MammalAbstract {
	//------------------------------ data structure
	private String hairType;
	//------------------------------ abstract methods
	public abstract void eat();
	//------------------------------ constructors
	public MammalAbstract() {
		this("white fuzzy");
	}
	
	public MammalAbstract(String hairType) {
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
		MammalAbstract specialMammal = new MammalAbstract() {		
			@Override
			public void eat() {
				System.out.println("I'm eating like a special mammal.");
			}
		};
		specialMammal.eat();
	}
}
