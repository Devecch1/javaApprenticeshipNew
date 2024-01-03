package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class calculationDateHour {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

		LocalDate pastWeeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("pastWeeekLocalDate = " + pastWeeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		LocalDateTime pastWeeekLocalDateYear = d05.minusYears(7);
		LocalDateTime nextWeekLocalDateYear = d05.plusYears(7);
		
		System.out.println("pastWeeekLocalDateYear = " + pastWeeekLocalDateYear);
		System.out.println("nextWeekLocalDateYear = " + nextWeekLocalDateYear);
		
		
		Instant pastWeeekLocalDateInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekLocalDateInstant = d06.minus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeeekLocalDateInstant = " + pastWeeekLocalDateInstant);
		System.out.println("nextWeekLocalDateInstant = " + nextWeekLocalDateInstant);
		
		Duration t1 = Duration.between(pastWeeekLocalDateYear, d05);
		
		System.out.println("t1 dias = " + t1.toDays());
		
		
	}

}
