package structure.decorator;

import java.util.Arrays;

import entities.people.Person;
import oo.interfaces.ITeach;

public class SimpleTeacher extends Person implements ITeach {
	private String[] subjects;
	
	@Override
	public void teach() {
		System.out.println("I'm teaching " + Arrays.toString(this.subjects));
	}
	@Override
	public void teach(String subject) {
		System.out.println("I'm teaching " + subject);
	}
	
}
