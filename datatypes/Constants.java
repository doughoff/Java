package datatypes;

import java.awt.Color;

public class Constants {
	static {
		// or load values of constants here...
		// make a connection object, use connection to pass SQL, parse SQL get value
		// better to load from external source
		// "magic numbers" (literal values) have to be compiled and app relaunched
	}
	// constants
	public static final String HOURS_OF_OPERATION = "M-F 9-5";
	public static final double MINIMUM_WAGE_MO = 7.70;
	public static final double MINIMUM_WAGE_CA = 10.50;
	
	public static void main(String[] args) {
		System.out.println(Constants.MINIMUM_WAGE_MO);
		System.out.println(Math.PI);
		System.out.println(Color.LIGHT_GRAY);
	}
}
