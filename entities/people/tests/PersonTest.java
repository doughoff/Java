package entities.people.tests;

import java.util.*;

import entities.people.Person;

public class PersonTest {
	public static void main(String[] args) {
		Set<Person> persons = new HashSet<Person>();
		Person john = new Person("John", "Sasser");
		Person bobby = new Person("Bobby", "Sasser");
		System.out.println(bobby.equals(john));
		
		persons.add(john);
		System.out.println(persons);
		persons.add(bobby);
		System.out.println(persons);
		persons.add(john);
		System.out.println(persons);
	
	}
}
