package entities;

public class PersonSimple {
	private String firstName;
	private String lastName;
	private int age;
	private boolean isMale;
	
	//------------------------------------------------------- constructors
	public PersonSimple() {
		this("First name", "Last name", 10, true);
	}	
	public PersonSimple(String firstName, String lastName) {
		this(firstName, lastName, 10, true);
	}
	
	public PersonSimple(String firstName, String lastName, int age, boolean isMale) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.isMale = isMale;
	}
	//------------------------------------------------------- getters and setters
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonSimple other = (PersonSimple) obj;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
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
