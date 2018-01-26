package entities.sortable;

import java.util.Arrays;
import java.util.Random;
import entities.people.*;

public class PersonSortableLamdas {
	public static void main(String[] args) {
		PersonSortable[] people = {
				new PersonSortable("Andrew", "Smith"),
				new PersonSortable("Bryan", "Smith"),
				new PersonSortable("Dale", "Smith"),
				new PersonSortable("Ellen", "Smith"),
				new PersonSortable("Jeremy", "Smith"),
				new PersonSortable("John", "Smith"),
				new PersonSortable("Doug", "Smith")
			};
		Arrays.sort(people);
		System.out.println(Arrays.toString(people));
		
		// sorting with a lambda asc
		System.out.println("Lambda first name ASC");
		Arrays.sort(people, 
			(p1, p2)-> p1.getNameFirst()
				.compareTo(p2.getNameFirst())
		);
		System.out.println(Arrays.toString(people));
		
		System.out.println("Lambda first name DESC");
		Arrays.sort(people, 
			(p1, p2)-> p2.getNameFirst()
				.compareTo(p1.getNameFirst())
		);
		System.out.println(Arrays.toString(people));

		System.out.println("Lambda first name length ASC");
		Arrays.sort(people, 
			(p1, p2)-> sortFirstNameLength(p1, p2)
		);
		System.out.println(Arrays.toString(people));
		
		// uses lambdas with braces around code block and a return
		System.out.println("Lambda first/last name ASC");
		Arrays.sort(people, 
			(p1, p2)-> {int result =  p1.getNameLast()
			.compareTo(p2.getNameLast());
			if (result == 0) {result =  p1.getNameFirst()
			.compareTo(p2.getNameFirst());}
			return result;
			}
		);
		System.out.println(Arrays.toString(people));
		
		
		Person[] people2 = {
				new Person("Andrew", "Estes"),
				new Person("Bryan", "Morby"),
				new Person("Dale", "Lake"),
				new Person("Ellen", "Kang"),
				new Person("Jeremy", "Taylor"),
				new Person("John", "Fiarkowski"),
				new Person("Doug", "Hoff")
			};
		// sort ANY array with a lambda
		System.out.println("Lambda first/last name ASC");
		Arrays.sort(people2, 
			(p1, p2)-> {int result =  p1.getNameLast()
			.compareTo(p2.getNameLast());
			if (result == 0) {result =  p1.getNameFirst()
			.compareTo(p2.getNameFirst());}
			return result;
			}
		);
		System.out.println(Arrays.toString(people2));	
		System.out.println("Lambda randomize");
		Arrays.sort(people2, 
			(p1, p2)-> randomize());
		System.out.println(Arrays.toString(people2));	
	}
	public static int sortFirstNameLength(PersonSortable p1, PersonSortable p2) {
		return p1.getNameFirst().length() 
			- p2.getNameFirst().length();
	}
	public static int randomize() {
		Random generator = new Random();
		int result = generator.nextInt(3)-1;
		return result;
	}
	
}
