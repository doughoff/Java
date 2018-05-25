package specialPurpose.formatting;

import java.time.*;
import java.time.format.*;

public class JavaTime {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		//
		DateTimeFormatter formatter 
			= DateTimeFormatter.ofPattern("d MMMM, yyyy");
		String localDateFormatted = ld.format(formatter);
		LocalDate parsedDate = LocalDate.parse(localDateFormatted, formatter);
		LocalDate todayPlusTen = parsedDate.plusDays(10);
		System.out.println(todayPlusTen);
	}
}
