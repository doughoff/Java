package entities.association;

import entities.function.TeachingBehavior;

public class PersonWhoTeaches {
	private String name;
	private TeachingBehavior teachingTraining;  // associated behavior
	
	//---------------------------------------------- getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TeachingBehavior getTeachingTraining() {
		return teachingTraining;
	}
	public void setTeachingTraining(TeachingBehavior teachingTraining) {
		this.teachingTraining = teachingTraining;
	}
	//---------------------------------------------- constructors
	public PersonWhoTeaches() {
		this("Doug Hoff", null);
	}
	public PersonWhoTeaches(String name, TeachingBehavior teachingTraining) {
		super();
		this.name = name;
		this.teachingTraining = teachingTraining;
	}
	//---------------------------------------------- instance methods
	@Override
	public String toString() {
		return "Person [name=" + name + ", teachingTraining=" + teachingTraining + "]";
	}
	public void talk(){
		System.out.println("I'm talking...");
	}
	// delegate to instance
	public void teach(){
		if (this.teachingTraining == null){
			System.out.println("I don't know how to teach.");
		} else {
			this.getTeachingTraining().teach();
		}
	}
	//  a factory method
	public PersonWhoTeaches createTeacher(){
		PersonWhoTeaches aTeacher = new PersonWhoTeaches();
		aTeacher.setTeachingTraining(new TeachingBehavior());
		return aTeacher;
	}
}
