package oo.enums;
import static oo.enums.DaysOfWeek.*;

public class EnumTest {
	public static void main(String[] args) {
		System.out.println(SUN);
		DaysOfWeek sunday = SUN;
		System.out.println(sunday);
		System.out.println(DaysOfWeek.valueOf("SUN"));
		System.out.println(sunday.ordinal());
		System.out.println("Total days in a week is " + DaysOfWeek.totalDaysOfWeek);
		sunday.print();
		for (DaysOfWeek day : DaysOfWeek.values()) {
			System.out.printf("%d=%-10s", day.ordinal(), day);
		}
		
	}
}
