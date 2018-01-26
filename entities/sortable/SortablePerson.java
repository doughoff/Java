package entities.sortable;

import java.util.*;

public class SortablePerson implements Comparable<SortablePerson> {
	private String nameFirst;
	private String nameLast;
	public static SortablePerson[] peopleArray;
	public static List<SortablePerson> peopleList;
	static {
		peopleArray = new SortablePerson[] {
				new SortablePerson("Andrew", "Estes"),
				new SortablePerson("Bryan", "Morby"),
				new SortablePerson("Dale", "Lake"),
				new SortablePerson("Ellen", "Kang"),
				new SortablePerson("Jeremy", "Taylor"),
				new SortablePerson("John", "Fiarkowski"),
				new SortablePerson("Doug", "Hoff")				
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
	public SortablePerson(String nameFirst, String nameLast) {
		super();
		this.setNameFirst(nameFirst);
		this.setNameLast(nameLast);
	}
	@Override
	public String toString() {
		return getNameFirst() + " " + getNameLast().toUpperCase();
	}

	@Override
	public int compareTo(SortablePerson o) {
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

