package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class convertDateHourGlobal {

	public static void main(String[] args) {
		

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDateTime r1 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		
		System.out.println("r1 da Minha Máquina = " + r1);
		System.out.println("r2 de Portugal = " + r2);
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d05 ano = " + d05.getYear());
		
		// PRA PEGAR TODAS AS ZONE ID
		//for (String s : ZoneId.getAvailableZoneIds()) {
		//	System.out.println(s);
		//}
		
		//System.out.println(ZoneId.getAvailableZoneIds());
	}

}
