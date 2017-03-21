package wednesday;

public class Person {
	
	//-------------------------------- data definition
	private String name;
	private int age;
	private boolean isFemale;
	
	//-------------------------------- processes 
	public void setInfo(String name, int age, boolean isFemale) {
		// OO methods have implicit argument of the object before the call
		this.name = name;
		this.age = age;
		this.isFemale = isFemale;		
	}	
	public void printInfo() {
		System.out.printf("A %s person whose name is %s and is %d years old\n",
				this.isFemale ? "female" : "male" , this.name, this.age);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", isFemale=" + isFemale + "]";
	}
	//-------------------------------- testing
	public static void main(String[] args) {
		Person aPerson = new Person();
		// direct assignment of data - not recommended
		aPerson.name = "Doug";
		aPerson.age = 22;
		aPerson.isFemale = false;
		
		System.out.println(aPerson.name);
		
		Person two = new Person();
		two.setInfo("Doug", 22, false);
		two.printInfo();
	}

}
