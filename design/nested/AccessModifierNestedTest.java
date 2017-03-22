package design.nested;

public class AccessModifierNestedTest {
	public static void main(String[] args) {
		UseWithoutInheritance uwi = new UseWithoutInheritance();
		String s;
		// s = uwi.privateString;
		s = uwi.packageString;
		s = uwi.protectedString;
		s = uwi.publicString;
	}
}
