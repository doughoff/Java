package oo.datatypes.enums;

public enum DaysOfWeek {
	SUN("Sunday"), MON("Monday"), TUE("Tuesday"), WED("Wednesday"), THU("Thursday"), FRI("Friday"), SAT("Saturday") ;
	//-------------------------------- data structure
	private String englishFullName;
	static int totalDaysOfWeek = 7;
	//-------------------------------- constructors
	private DaysOfWeek(String englishFullName) {
		this.englishFullName = englishFullName;
	}
	//-------------------------------- methods
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.englishFullName;
	}
	public void print(){
		System.out.println("I'm printing " + this.englishFullName);
	}
}