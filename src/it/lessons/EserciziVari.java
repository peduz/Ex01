package it.lessons;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Iterator;
import java.util.Locale;

public class EserciziVari {

	public static void main(String[] args) {
//		extracted();
//		formattazione();
		
		LocalDate localDate = LocalDate.now(ZoneId.of("Asia/Jerusalem"));
		
		System.out.println(localDate.toString());
		
		LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Jerusalem"));
		
		System.out.println(localDateTime.toString());
		
		Month month = localDate.getMonth();
		System.out.println(month);
		
		int dayOfMonth = localDate.getDayOfMonth();
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		int dayOfYear = localDate.getDayOfYear();
		
		System.out.println("DayOfMonth " + dayOfMonth +
				" dayOfWeek " + dayOfWeek.getValue() + 
				" dayOfYear " + dayOfYear);
		
		LocalDateTime impostata = 
				LocalDateTime.of(2023, 3, 12, 22, 43, 12, 32423); 
		
		if(impostata.isBefore(localDateTime)) {
			System.out.println("Viene prima");
			System.out.println("Ora: " + impostata.getHour() + ":" +
			impostata.getMinute() + ":" + impostata.getSecond());
		} else {
			System.out.println("Viene dopo");
		}
		
		System.out.println(impostata.format(DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss")));
	}

	private static void formattazione() {
		int a = 2;
		int b = 3;
		System.out.println("Il numero a vale " + a);
		System.out.println(String.format("Il numero a vale %d e il numero b vale %d", a, b));
		
		double x = 2.297235243;
		System.out.printf("%.2f", x);
	}

	private static void extracted() {
		int a = 10;//coi tipi primitivi non c'è il modo diretto
		Integer a2 = a;
		String aS = a2.toString();
		String aPrimS = a + "";
		
		String aN = Integer.valueOf(a).toString();
		System.out.println(aS);
		Double d = 10.2;
		String dS = d.toString();
		System.out.println(dS);
		
		
		String numDue = "2";
		Integer due = Integer.valueOf(numDue);
		System.out.println(due);
	}
}
