package entities.association.aggregation;

import java.util.*;

public class Teacher {
	public static Set<Teacher> tutorsWithStudents;
	static {
		tutorsWithStudents = new HashSet<Teacher>();
	}

	private Student student; // optional for teacher - not owned
	
}
