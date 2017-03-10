package enums;

public enum DaysOfWeek {
	SUN, MON, TUE, WED, THU, FRI, SAT ;
	
	static int totalDaysOfWeek = 7;
	private DaysOfWeek() {
		
	}
	public void print(){
		System.out.println("I'm printing...");
	}
	
}

enum NameOfMonth {
	JAN, FEB, MAR, APR;
}