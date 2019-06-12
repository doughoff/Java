package io.console;

import java.util.Scanner;

public class ScannerMenu {
	public static void main(String[] args) {
		Scanner inputStreamScanner = new Scanner(System.in);
		String inputLine = "";
		System.out.print("Enter your string: ");
		while (true) {
			inputLine = inputStreamScanner.nextLine();
			if (inputLine.length() == 0) {
				break;
			}
			System.out.println("You said: " + inputLine);
			System.out.print("Keep typing to continue... (<Enter> to quit)");
		}
		inputStreamScanner.close();
	}
}