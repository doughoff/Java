package design;

import design.nested.*;

public class AccessModifierTest  extends UseWithInheritance{
	public static void main(String[] args) {
		UseWithoutInheritance uwi = new UseWithoutInheritance();
		String s;
		// s = uwi.privateString;
		// s = uwi.packageString;
		// s = uwi.protectedString;
		s = uwi.publicString;
		
		AccessModifierTest amt = new AccessModifierTest();
		// s = amt.privateString;
		// s = amt.packageString;
		s = amt.protectedString;
		s = amt.publicString;
	}

}
