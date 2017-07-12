package control.branching;

public class MainController {
	public static void main(String[] args) {
		procedural.HelloWorld.main(null);
		procedural.HelloWorld.main(null);
		
		printIntermissionMessage();
		control.branching.MainController.printIntermissionMessage();
		
		String message = "It's time for a break.";
		printIntermissionMessage(message);
		
		procedural.HelloWorld.main(null);
		procedural.HelloWorld.main(null);
	
	}


	public static void printIntermissionMessage(String message) {
		System.out.println(message);
	}


	public static void printIntermissionMessage() {
		System.out.println("It's intermission time....");
		
	}
}
