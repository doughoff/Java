package enums;

public class EnumTest {
	public static void main(String[] args) {
		DaysOfWeek mon = DaysOfWeek.MON;
		System.out.println(mon);
		System.out.println(DaysOfWeek.valueOf("MON"));;
		System.out.println(mon.ordinal());;
		mon.print();
	}
}
