package entities.people;

import entities.association.PersonWhoTeaches;

public class HelpDeskRep extends PersonWhoTeaches {
	
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
		PersonWhoTeaches mary = new PersonWhoTeaches();
		fred.talk();
		herman.talk();
		mary.talk();
		
		PersonWhoTeaches[] people = {fred, herman, mary};
		// use polymorphism
		for (PersonWhoTeaches person : people) {
			person.talk();
		}
	}
}

class Extra {
	// 2nd class can not be public in the same file
}
