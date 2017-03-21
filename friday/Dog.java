package friday;
import entities.Person;

public class Dog {
	//----------------------------------- data structure
	private String name;
	private int age;
	private boolean isMale;
	private String breed;
	private Person owner;
	//----------------------------------- getters and setters
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
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	//----------------------------------- constructors
	public Dog() {
		this("Matt", 1, true, "Mutt", new Person());
		// should use new Person("Doug", 22, false) if available
		this.getOwner().setInfo("Doug", 22, false);
	}
	public Dog(String name, int age, boolean isMale, String breed, 
			Person owner) {
		super();                // creates the Object core
		this.name = name;
		this.age = age;
		this.isMale = isMale;
		this.breed = breed;
		this.owner = owner;
	}
	//----------------------------------- instance methods
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", isMale=" + isMale + ", breed=" + breed + ", owner=" + owner
				+ "]";
	}
	//----------------------------------- testing
	public static void main(String[] args) {
		Dog mutt = new Dog();
		System.out.println(mutt);
		Dog fido = new Dog("Fido", 23, true, "Golden Retriever", 
				new Person());
		System.out.println(fido);
	}
}
