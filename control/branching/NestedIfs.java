package control.branching;

public class NestedIfs {
	public static void main(String[] args) {
		// i can be 1, 2, or 3
		int i = 1;

		// nested version
		if (i == 1) {
			System.out.println("1");
		} else if (i == 2) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}
		
		// non-nested version
		if (i == 1) {
			System.out.println("1");
		}
		if (i == 2) {
			System.out.println("2");
		}
		if (i == 3) {
			System.out.println("3");
		}
	}
}
