package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;

public class DateAndTimeDemo {

	public static void main(String[] args) {

		// java.time.LocalDate
		System.out.println("**********Using LocalDate********");
		LocalDate date = LocalDate.now();
		System.out.println(date);
		int dd = date.getDayOfMonth();
		System.out.println("Day of Month : " + dd);
		int mm = date.getMonthValue();
		System.out.println(mm);
		int yy = date.getYear();
		System.out.println(dd + "...." + mm + "..." + yy);
		System.out.printf("\n%d-%d-%d\n", dd, mm, yy);

		// java.time.LocalTime
		System.out.println();
		System.out.println("*********Using LocalTime**********");
		LocalTime time = LocalTime.now();
		System.out.println("Current time : " + time);
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		System.out.printf("\n%d:%d:%d\n", h, m, s, n);

		// java.time.LocalDateTime
		LocalDateTime dt1 = LocalDateTime.now();
		System.out.println(dt1);
		LocalDateTime dt2 = LocalDateTime.of(1995, Month.APRIL, 28, 12, 45);
		System.out.println(dt2);
		System.out.println("Date and time after six months : " + dt2.plusMonths(6));
		System.out.println("Date and time before six months : " + dt2.minusMonths(6));

		// java.time.Period-Repesents the quality of time
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(2002, 02, 15);
		Period p = Period.between(birthday, today);
		System.out.printf("\nAge is %d years and %d months %d days\n", p.getYears(), p.getMonths(), p.getDays());

		// java.time.year
		int year = 1992;

		// boolean result = Year.isLeap(1992);

		//Year y = Year.of(year);

		if (Year.isLeap(1992)) {

			System.out.printf("\n%d is a Leap year \n", year);
		} else {
			System.out.printf("\n%d is not a leap year \n", year);
		}

	}

}
