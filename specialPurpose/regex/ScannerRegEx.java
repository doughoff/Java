package specialPurpose.regex;

import java.util.Scanner;

public class ScannerRegEx {
	public static void main(String[] args) {

		String input = ""; 
		Scanner s = new Scanner(System.in).useDelimiter("\\s*fish\\s*"); 
		
		// use input of:
		// 1 fish 2 fish red fish blue fish
		// in console to see results.
		System.out.println(s.nextInt()); 
		System.out.println(s.nextInt()); 
		System.out.println(s.next()); 
		System.out.println(s.next()); 
		s.close(); 

	}
}
