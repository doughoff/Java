package datatypes.strings;

public class StringEqualsTest {
	private String name;
	private int number;
	
	@Override
	public int hashCode() {
		final int prime = 41;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringEqualsTest other = (StringEqualsTest) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		StringEqualsTest ct1 = new StringEqualsTest();
		ct1.name = "name";
		ct1.number = 1;
		
		StringEqualsTest ct2 = new StringEqualsTest();
		ct2.name = "name";
		ct2.number = 1;
		
		System.out.println(ct1.hashCode());
		System.out.println(ct2.hashCode());
		
		System.out.println(ct1 == ct2);
		System.out.println(ct1.equals(ct2));
		
		// Strings created with constructor
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		// Strings not created with constructor
		String s3 = "abc";
		String s4 = "abc";				// uses the cached s3 object
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));		
	}
	
}
