package specialPurpose.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortablePerson implements Comparable<SortablePerson> {
	private String nameFirst;
	private String nameLast;
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
		SortablePerson[] people = {
				new SortablePerson("Joan", "Fontaine"),
				new SortablePerson("Errol", "Flynn"),
				new SortablePerson("Geena", "Davis"),
				new SortablePerson("Bette", "Davis"),
				new SortablePerson("Olivia", "de Havilland")
		};
		System.out.println(Arrays.toString(people));
		System.out.println();
		// use the default sort
		Arrays.sort(people);
		System.out.println("---------------------- after sorting");
		System.out.println(Arrays.toString(people));
		System.out.println();
		// sort using a comparator
		Arrays.sort(people, new PersonIgnoreCaseComparator());
		System.out.println("---------------------- after sorting with comparator");
		System.out.println(Arrays.toString(people));
		
	}
}

class PersonIgnoreCaseComparator implements Comparator<SortablePerson> {

	@Override
	public int compare(SortablePerson p0, SortablePerson p1) {
		// 1st level sort on last name
		int result = p0.getNameLast().compareToIgnoreCase(p1.getNameLast());
		if (result == 0){
			// 2nd level sort on first name
			result = p0.getNameFirst().compareToIgnoreCase(p1.getNameFirst());
		}
		// show calls by Arrays.sort()
		System.out.printf("Comparing %s to %s and returning %d\n", p0, p1, result);
		return result;
	}

}

