package entities.tests;

import java.util.*;

import entities.PersonSimple;

public class PersonTest {
	public static void main(String[] args) {
		Set<PersonSimple> persons = new HashSet<PersonSimple>();
		PersonSimple john = new PersonSimple("John", "Sasser");
		PersonSimple bobby = new PersonSimple("Bobby", "Sasser");
		System.out.println(bobby.equals(john));
		
		persons.add(john);
		System.out.println(persons);
		persons.add(bobby);
		System.out.println(persons);
		persons.add(john);
		System.out.println(persons);
	
	}
}
