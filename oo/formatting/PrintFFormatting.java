package oo.formatting;

import java.util.Calendar;

public class PrintFFormatting {
	// a varargs (variable argument) method - any number of arguments
	public static void test(String ...stringArray ) {
		for (String item : stringArray) {
			System.out.print(item + ", ");
		}
		System.out.println("End test.");
	}
	
	public static void main(String[] args) {
		// custom varargs method
		test();
		test("a string");
		test("a string", "another string");
		
//		 printf examples
		System.out.printf("A %s with formatting characters", "string");
		System.out.println("next line");
//		 always use a new line after printf
		System.out.printf("A %s with formatting characters\n", "string");
		System.out.println("next line");
		
//		 different datatypes
		System.out.printf("I want a %s with %s and %s.\n", "Corvette", 
				"sun roof", "a new set of tires");
		System.out.printf("My %d %s cost $%,.2f\n", 2016, "computer", 2343.21789);
		Calendar c = Calendar.getInstance( );
		System.out.printf("\n%tr \n%tc \n%tl:%tM" , c, c, c, c);
		
//		reusing arguments
		System.out.printf("My %s cost $%.2f.\nI like my %1$s.", "computer", 2442.32789);

	}
}
