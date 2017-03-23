package entities.people;

import entities.function.TeachingBehavior;

public class PersonAggregate {
	private String name;
	private TeachingBehavior teachingTraining;  // aggregating behavior
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

	public PersonAggregate() {
		this("Doug Hoff", null);
	}
	
	public PersonAggregate(String name, TeachingBehavior teachingTraining) {
		super();
		this.name = name;
		this.teachingTraining = teachingTraining;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", teachingTraining=" + teachingTraining + "]";
	}
	public void talk(){
		System.out.println("I'm talking...");
	}
	public void teach(){
		if (this.teachingTraining == null){
			System.out.println("I don't know how to teach.");
		} else {
			this.getTeachingTraining().teach();
		}
	}
	//  a factory method
	public PersonAggregate createTeacher(){
		PersonAggregate aTeacher = new PersonAggregate();
		aTeacher.setTeachingTraining(new TeachingBehavior());
		return aTeacher;
	}
}
