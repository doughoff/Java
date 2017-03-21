package friday;

public class HelpDeskRep extends Person {
	
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
		Person mary = new Person();
		fred.talk();
		herman.talk();
		mary.talk();
		
		Person[] people = {fred, herman, mary};
		// use polymorphism
		for (Person person : people) {
			person.talk();
		}
	}
}

class Extra {
	// 2nd class can not be public in the same file
}
