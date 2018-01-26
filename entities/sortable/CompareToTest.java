package entities.sortable;

public class CompareToTest {
	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		String a2 = "A";
		
		System.out.println(a.compareTo(b) + " comparing a to b");
		System.out.println(b.compareTo(a) + " comparing b to a");
		System.out.println(a.compareTo(a) + " comparing a to a");
		System.out.println(a.compareTo(a2) + " comparing a to A");
		System.out.println(a.compareToIgnoreCase(a2) + " comparing a to A ignoring case");
	}
}
