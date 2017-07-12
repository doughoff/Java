package structure.decorator;

import java.util.Arrays;

import oo.interfaces.ITeach;

public abstract class TeachingDecorator implements ITeach {
	protected final ITeach decoratedTeacher;
	private String[] subjects;
	
	public TeachingDecorator(ITeach teacher) {
		this.decoratedTeacher = teacher;
	}
	@Override
	public void teach() {
		System.out.println("I'm teaching " + Arrays.toString(this.subjects));
	}
	@Override
	public void teach(String subject) {
		System.out.println("I'm teaching " + subject);
	}

}
