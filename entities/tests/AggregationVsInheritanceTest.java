package entities.tests;

import entities.function.TeachingBehavior;
import entities.people.FryCook;
import entities.people.Person;

public class AggregationVsInheritanceTest {
	// show difference between aggregation and inheritance
	
	public static void main(String[] args) {
		Person p = new Person();
		p.talk();
		// we can add a teaching object to Person so they can teach
		p.setTeachingTraining(new TeachingBehavior());
		p.getTeachingTraining().teach();
		p.teach();
		p.setTeachingTraining(null); // forget how to teach
		p.teach();
		
		// test an inherited class from Person for new behavior
		System.out.println("FryCook acting here...");
		FryCook cook = new FryCook();
		cook.talk();
		cook.teach();
		cook.fry();  // can't unteach the fry behavior
	}
	
}
