package entities.people;

public class HelpDeskRep extends PersonAggregate {
	
	public void answerPhone(){
		System.out.println("Hello, what is your problem?");
	}
	@Override
	public void talk() {
		super.talk();  // execute the Person's class talk() method
		this.answerPhone();
	}
	public static void main(String[] args) {
		HelpDeskRep fred = new HelpDeskRep();
		FryCook herman = new FryCook();
		PersonAggregate mary = new PersonAggregate();
		fred.talk();
		herman.talk();
		mary.talk();
		
		PersonAggregate[] people = {fred, herman, mary};
		// use polymorphism
		for (PersonAggregate person : people) {
			person.talk();
		}
	}
}

class Extra {
	// 2nd class can not be public in the same file
}
