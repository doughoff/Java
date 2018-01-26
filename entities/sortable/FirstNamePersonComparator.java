package entities.sortable;

import java.util.Comparator;

import entities.people.PersonSortable;

public class FirstNamePersonComparator implements Comparator<PersonSortable> {

		@Override
		public int compare(PersonSortable p0, PersonSortable p1) {
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
