package procedural.methods;

public class BagelMaker {
	//------------------------------- data structure
	static String nyBagel 		= "a New York style bagel";
	static String creamCheese  	= "Philadelphia whipped cream cheese";
	static String topping1		= "pineapple";
	static String topping2		= "strawberry preserves";
	
	//------------------------------- methods
	public static String createBagel() {
		return nyBagel;
	}
	public static void print(String somethingToPrint) {
		System.out.println(somethingToPrint);
	}	
	
	public static String addCreamCheeseTo(String bagel) {
		return bagel + " with " + creamCheese;
	}	
	
	public static String addTo(String aBagel, String add1, String add2) {
		return aBagel + " and " + add1 + " and " + add2;
	}
	//------------------------------- test
	public static void main(String[] args) {
		String bagel = createBagel();
		print(bagel);
		String myBagel = addCreamCheeseTo(bagel);
		print(myBagel);
		myBagel = addTo(myBagel, topping1, topping2);
		print(myBagel);
	}






}
