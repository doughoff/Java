package entities.people;

public class HelpDeskRep extends PersonWithBehavior {
	
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
		PersonWithBehavior mary = new PersonWithBehavior();
		fred.talk();
		herman.talk();
		mary.talk();
		
		PersonWithBehavior[] people = {fred, herman, mary};
		// use polymorphism
		for (PersonWithBehavior person : people) {
			person.talk();
		}
	}
}

class Extra {
	// 2nd class can not be public in the same file
}
