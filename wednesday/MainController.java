package wednesday;

public class MainController {
	public static void main(String[] args) {
		basics.HelloWorld.main(null);
		basics.HelloWorld.main(null);
		
		printIntermissionMessage();
		wednesday.MainController.printIntermissionMessage();
		
		String message = "It's time for a break.";
		printIntermissionMessage(message);
		
		basics.HelloWorld.main(null);
		basics.HelloWorld.main(null);
	
	}


	public static void printIntermissionMessage(String message) {
		System.out.println(message);
	}


	public static void printIntermissionMessage() {
		System.out.println("It's intermission time....");
		
	}
}
