package oo;

public class PersonEq {
	String firstname; // check equals
	String lastname;  // check equals
	String address;
	String city;
	String state;
	String zip;
	String SSN;       // check equals
	
	public PersonEq(String firstname, String lastname, String address, String city, String state, String zip,
			String sSN) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		SSN = sSN;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((SSN == null) ? 0 : SSN.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof PersonEq))
			return false;
		PersonEq other = (PersonEq) obj;
		if (SSN == null) {
			if (other.SSN != null)
				return false;
		} else if (!SSN.equals(other.SSN))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}

	public static void main(String[] args) {
		PersonEq p1 = new PersonEq("Doug", "Hoff", "123 Main", "Kansas City", "MO", "64152", "123-45-6789");
		PersonEq p2 = new PersonEq("Doug", "Hoff", "456 Main", "Kansas City", "MO", "64152", "123-45-6789");
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.getClass() == p2.getClass());
	}
	
}
