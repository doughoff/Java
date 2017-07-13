package entities.tests;

import entities.association.PersonWhoTeaches;
import entities.functional.TeachingBehavior;
import entities.people.FryCook;

public class AggregationVsInheritanceTest {
	// show difference between aggregation and inheritance
	
	public static void main(String[] args) {
		PersonWhoTeaches p = new PersonWhoTeaches();
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
