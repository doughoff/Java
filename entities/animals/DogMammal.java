package entities.animals;

public class DogMammal extends MammalAbstract {
	//--------------------------- data structure
	private String name;
	private int age;
	private String breed;
	private boolean isMale;	
	//---------------------------getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	//----------------------------- constructors
	public DogMammal() {
		this("short black/brown/white", "Fido", 1, "German Shepherd", true);
	}
	public DogMammal(String hairType, String name, int age, String breed, boolean isMale) {
		super(hairType);
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.isMale = isMale;
	}
	//---------------------------------- instance methods

	public void bark() {
		System.out.println("bark");
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", breed=" + breed + ", isMale=" + isMale + ", toString()="
				+ super.toString() + "]";
	}
	@Override
	public void eat() {
		System.out.println("I'm eating like a dog.");
	}
	//---------------------------------- testing
	public static void main(String[] args) {
		DogMammal fido = new DogMammal();
		System.out.println(fido);
		fido.bark();
		fido.eat();
	}

}
