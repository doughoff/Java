package design.nested;

public class UseWithoutInheritance {
	public String publicString;
	protected String protectedString;
	String packageString;
	private String privateString;
	
	public static void main(String[] args) {
		UseWithoutInheritance uwi = new UseWithoutInheritance();
		String s;
		s = uwi.privateString;
		s = uwi.packageString;
		s = uwi.protectedString;
		s = uwi.publicString;
	}
}
