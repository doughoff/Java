package specialPurpose.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MealFile {
	public static void main(String[] args) {
		String myMeal = " a salad, steak soup, steak, a vegetable, and a dessert";
		// replace is an OO method to use with Strings only
		String veggieMeal = myMeal.replace("steak", "tofu");
		System.out.println("I'm eating " + myMeal);
		System.out.println("My veggie friend is eating " + veggieMeal);
		
		String happyMeal = myMeal.replace(" ", ":-)");
		System.out.println(happyMeal);
		
		try (PrintWriter writer = new PrintWriter("happy-meal.txt")) {	
			writer.println(happyMeal);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
