package dataStructures.sets;

import java.util.*;

import entities.sortable.FirstNamePersonComparator;
import entities.sortable.SortablePerson;

public class PersonTreeSets {
	public static void main(String[] args) {
		// create a TreeSet from array
		Set<SortablePerson> peopleSet =
				new TreeSet<SortablePerson>(Arrays.asList(SortablePerson.peopleArray));
		// print showing default sort
			System.out.println(peopleSet);
			
		// create a TreeSet with comparator 
			Set peopleByFirstNames = 
				new TreeSet<SortablePerson>
					(new FirstNamePersonComparator());
			peopleByFirstNames.addAll(peopleSet);
		// print showing new sort
			System.out.println(peopleByFirstNames);
			
			// create a TreeSet with lambda 
			System.out.println("Sort by lambda----------");
			Set peopleByLastNameLength = 
				new TreeSet<SortablePerson>
					((p1, p2)-> p1.getNameLast().length() - 
							p2.getNameLast().length());
			peopleByLastNameLength.addAll(peopleSet);
			System.out.println(peopleByLastNameLength);
	}
}
