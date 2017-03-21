package tuesday;

import java.util.Scanner;

public class ConsoleScanner {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {  // autoclose
			int selection = 0;
			boolean stillUsingMenu = true;

			while (stillUsingMenu) {
				System.out.println("Menu Options\n--------------");
				System.out.println("(1) - enter sentence");
				System.out.println("(2) - quit");
				System.out.print("Please enter your selection: ");

				selection = 0;
				String lineInput = scanner.nextLine();
				try {
					selection = Integer.parseInt(lineInput.trim());
				} catch (Exception e) {
					System.err.println("Had a hard time figuring out what you meant.");
				} 
				switch (selection) {
				case 1: {
					System.out.print("Enter a sentence: ");
					String sentence = scanner.nextLine();
					System.out.println("\nYour sentence: " + sentence);
					break;
				}
				case 2: {
					stillUsingMenu = false;
					System.out.println("Exiting menu system...");
					break;
				}
				default: {
					System.err.println("Try again");
					break;
				}
				}
			}
		}
	}
}
