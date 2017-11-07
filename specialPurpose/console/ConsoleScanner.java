package tuesday;

import java.util.Scanner;

public class ConsoleScanner {
	public static void main(String[] args) {
		Scanner inputStream = new Scanner(System.in);
		String inputLine = "";
		System.out.print("Enter your string: ");
		while (true) {
			inputLine = inputStream.nextLine();
			if (inputLine.length() == 0) {break;}
			System.out.println("You said: " + inputLine);
			System.out.print("Keep typing to continue... (<Enter> to quit)");
		}
		inputStream.close();
	}
}