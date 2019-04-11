package procedural.methods;

public class OverloadedMethods {
	//---------------------------- data structure
	static String crust = "thin crust";
	static String sauce = "red sauce";
	static String pepperoni	 = "Louie's pepperoni";
	static String cheese	= "mozzarella cheese";
	static String sausage	= "spicy Italian sausage";
	static boolean isToGo	= false;
	
	//---------------------------- methods
	public static String createPizza() {
		return crust + " pizza with " + sauce;
	}	
	public static String createPizza(boolean toGo) {
		return createPizza() + (toGo ? " in a box" : " for here") ;
	}
	public static String createPizza(boolean toGo, String add1, String add2, String add3) {
		return createPizza() + " with " + add1 + " and " + add2 + " and " + add3 + 
			(toGo ? " in a box" : " for here");
	}
	//---------------------------- test
	public static void main(String[] args) {
		String pizza = createPizza();
		System.out.println(pizza);
		String toGoPizza = createPizza(true);
		System.out.println(toGoPizza);
		
		pizza = createPizza(isToGo, pepperoni, cheese, sausage);
		System.out.println(pizza);
	}



}
