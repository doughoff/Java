package entities.people;

import java.util.*;
import entities.sortable.*;

public class PersonSortable implements Comparable<PersonSortable> {
	private String nameFirst;
	private String nameLast;
	public static PersonSortable[] peopleArray;
	public static List<PersonSortable> peopleList;
	static {
		peopleArray = new PersonSortable[] {
				new PersonSortable("Andrew", "Estes"),
				new PersonSortable("Bryan", "Morby"),
				new PersonSortable("Dale", "Lake"),
				new PersonSortable("Ellen", "Kang"),
				new PersonSortable("Jeremy", "Taylor"),
				new PersonSortable("John", "Fiarkowski"),
				new PersonSortable("Doug", "Hoff")				
		};
		peopleList = Arrays.asList(peopleArray);
	}
	
	public String getNameLast() {
		return nameLast;
	}
	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
	}
	public String getNameFirst() {
		return nameFirst;
	}
	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}	
	public PersonSortable(String nameFirst, String nameLast) {
		super();
		this.setNameFirst(nameFirst);
		this.setNameLast(nameLast);
	}
	@Override
	public String toString() {
		return getNameFirst() + " " + getNameLast().toUpperCase();
	}

	@Override
	public int compareTo(PersonSortable o) {
		// 1st level sort on last name
		int result = this.getNameLast().compareTo(o.getNameLast());
		if (result == 0){
			// 2nd level sort on first name
			result = this.getNameFirst().compareTo(o.getNameFirst());
		}
		// show calls by Arrays.sort()
		System.out.printf("Comparing %s to %s and returning %d\n", this, o, result);
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(peopleArray));
		System.out.println();
		// use the default sort
		Arrays.sort(peopleArray);
		System.out.println("---------------------- after sorting");
		System.out.println(Arrays.toString(peopleArray));
		System.out.println();
		// sort using a comparator
		Arrays.sort(peopleArray, new FirstNamePersonComparator());
		System.out.println("---------------------- after sorting with comparator");
		System.out.println(Arrays.toString(peopleArray));
		
	}
}

