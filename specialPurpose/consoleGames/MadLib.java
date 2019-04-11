package specialPurpose.consoleGames;

import java.util.Scanner;

public class MadLib {
	public static void main(String[] args) {
		// Control-space after unknown class to import it
		Scanner scanner = new Scanner(System.in);
		
		String inputLine = "";
		System.out.print("Enter your string: ");   // this is a PRINT
		
		inputLine = scanner.nextLine();
		System.out.println("You said " + inputLine);
		
		// initialize MadLib
		String madlib = "A vacation is when you take a trip to some %s place with your %s family. "
				+ "Usually you go to some place near a/an %s or up on a/an %s.";
		String promptAdjective = "Enter an adjective: ";
		String promptNoun = "Enter a noun: ";
		String prompt5Choices = "Enter a number: \n1 - duck\n2 - building\n3 - tractor\n4 - bird\n5 - computer: ";
		String input1, input2, input3, input4, input5;
		
		// collect the data
		System.out.print(promptAdjective);
		input1 = scanner.nextLine();
		System.out.print(promptAdjective);
		input2 = scanner.nextLine();
		System.out.print(promptNoun);
		input3 = scanner.nextLine();
		System.out.print(promptNoun);
		input4 = scanner.nextLine();
		
		System.out.println(prompt5Choices);
		input5 = scanner.nextLine();
		// test the input
		switch (input5) {
		case "1":
			break;
		case "2":
			break;

		default:
			break;
		}
		
		// print out the result
		System.out.printf(madlib, input1, input2, input3, input4);
				

	}
}
