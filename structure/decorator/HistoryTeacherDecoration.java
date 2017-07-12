package structure.decorator;

import oo.interfaces.ITeach;

public class HistoryTeacherDecoration extends TeachingDecorator{

	public HistoryTeacherDecoration(ITeach teacher) {
		super(teacher);
		System.out.println("----------------Added history decoration.");
	}
	
	@Override
	public void teach() {
		// TODO Auto-generated method stub
		super.teach();
		System.out.println("I also teach history.");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.decoratedTeacher.toString();
	}
	
	public static void main(String[] args) {
		ITeach teacher = new SimpleTeacher();
		System.out.println(teacher);
		teacher.teach();
		
		teacher = new HistoryTeacherDecoration(teacher);
		System.out.println(teacher);
		teacher.teach();
	}
}
