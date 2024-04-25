package day3javaprograms;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DatesExamples {

	public static void main(String[] args) {

		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
		System.out.println(sdf.format(date));
		
		LocalDateTime dateTimeObj = LocalDateTime.now();
		System.out.println(dateTimeObj);
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
		
		String formattedDate = dateTimeFormatter.format(dateTimeObj);
		System.out.println("Using LocalDateTime Class: "+formattedDate);
		
		
		LocalDate date1 = LocalDate.of(2019, 01, 01);
		LocalDate date2 = LocalDate.now();
		
		long diff = ChronoUnit.MONTHS.between(date1, date2);
		
		long diffInYears = ChronoUnit.YEARS.between(date1, date2);
		
		System.out.println("DIFFERENCE IN MONTHS: "+diff);
		System.out.println("DIFFERENCE IN YEARS: "+diffInYears);
		
		LocalDate localDateObj = LocalDate.of(2023, 9, 1);
		LocalDate localDateFrom = localDateObj.minusWeeks(52);
		System.out.println("After Subtraction from the given date: "+localDateFrom);
		
		
		
		
		
		
		
		
		
		
	}

}
