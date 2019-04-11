package procedural.methods;

public class MethodsWithInput {
	//---------------------------------- data structure
	static String pizzaCrust = "a pizza crust";
	
	// --------------------------------- methods
	
	public static String addSauceTo(String crust) {
		return crust + " with tomato sauce";
	}
	public static String blend(String stuff) {
		return "blended " + stuff;
	}
	private static String addPepperoniToPizza(String pizza) {
		return pizza + " and pepperoni";
	}
	//----------------------------------- test
	public static void main(String[] args) {
		System.out.println("I have " + pizzaCrust);
		
		String pizzaWithSauce = addSauceTo(pizzaCrust);
		System.out.println("I have " + pizzaWithSauce);
		
		String blendedPizza = blend(pizzaWithSauce);
		System.out.println(blendedPizza);
		
		String pizzaWithPepperoni = addPepperoniToPizza(pizzaWithSauce);
		System.out.println("I have " + pizzaWithPepperoni);
	}





}
