package entities.association.aggregation;

import java.util.*;
import static entities.association.aggregation.Teacher.*;

public class Student {
	private Teacher privateTutor;   // can not belong to to multiple Students, owned 1-way (not 0wn3d)

	public Teacher getPrivateTutor() {
		return privateTutor;
	}

	public void setPrivateTutor(Teacher privateTutor) throws AggregationException {
		// see if Teacher is already associated with a student
		// aggregation says no teacher can have more than one student
		if (!Teacher.tutorsWithStudents.contains(privateTutor)){
			this.privateTutor = privateTutor;
		} else {
			throw new AggregationException();
		}

	}
}
class AggregationException extends Exception {
	@Override
	public String getMessage() {
		return "Entity already has a child.";
	}
}