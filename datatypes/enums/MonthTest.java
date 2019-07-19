package datatypes.enums;

enum Month {
	// ------------------------------------------------- enum values + constructor calls	
	JAN(10, 50), FEB(30, 60), MAR(40, 70), APR(45, 75), MAY(50, 80);  
	//-------------------------------------------------- associated data structure
	private int averageTemp;
	private int highTemp;
	//-------------------------------------------------- gets and sets
	public int getHighTemp() {
		return highTemp;
	}
	public void setHighTemp(int highTemp) {
		this.highTemp = highTemp;
	}
	public int getAverageTemp() {
		return averageTemp;
	}
	public void setAverageTemp(int averageTemp) {
		this.averageTemp = averageTemp;
	}
	//--------------------------------------------------- constructors
	Month(int averageTemp, int highTemperature){
		this.averageTemp = averageTemp;
	}
	//--------------------------------------------------- instance methods
	@Override
	public String toString() {
		switch (this) {
		case JAN:
			return "January: " + this.getAverageTemp() + " is the average temperature.";
		default:
			return "Unimplemented month.";
		}
	}
}

public class MonthTest{
	public static void isThisTheMonthOf(Month month) {
		if(month == Month.JAN) {
			System.out.println("It IS January!");
		}
	}
	public static void main(String[] args) {
		System.out.println(Month.JAN);
		System.out.println(Month.JAN.getAverageTemp());
		isThisTheMonthOf(Month.JAN);
		for (Month month : Month.values()) {
			System.out.print(month.ordinal() + ": ");
			System.out.println(month);
			System.out.println(month.name());
		}
	}
	
}