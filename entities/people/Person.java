package entities.people;

public class Person {
	
	//---------------------------------------------- data structure
	private String nameFirst;
	private String nameLast;
	private int age;
	private boolean isMale;
	
	//------------------------------------------------------- constructors
	public Person() {
		this("First name", "Last name", 10, true);
	}	
	public Person(String firstName, String lastName) {
		this(firstName, lastName, 10, true);
	}
	public Person(String firstName, String lastName, int age, boolean isMale) {
		super();
		this.nameFirst = firstName;
		this.nameLast = lastName;
		this.age = age;
		this.isMale = isMale;
	}
	//------------------------------------------------------- getters and setters
	public String getNameFirst() {
		return nameFirst;
	}
	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}
	public String getNameLast() {
		return nameLast;
	}
	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
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
	//-------------------------------------------------------- instance methods
	@Override
	public int hashCode() {
		final int prime = 37;
		int result = 1;
		result = prime * result + ((nameFirst == null) ? 0 : nameFirst.hashCode());
		result = prime * result + ((nameLast == null) ? 0 : nameLast.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + nameFirst + ", lastName=" + nameLast + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (nameLast == null) {
			if (other.nameLast != null)
				return false;
		} else if (!nameLast.equals(other.nameLast))
			return false;
		return true;
	}
	public void printInfo() {
		System.out.println(this);
	}
	public void setInfo(String string, int i, boolean b) {
		// TODO Auto-generated method stub
	}

}
