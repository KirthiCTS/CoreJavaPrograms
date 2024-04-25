package day3javaprograms;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneConversion {

	public static void main(String[] args) {

		
		 
		 Date localTime = new Date();
		 SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy" + " "+ " HH:mm:ss");
		 dateFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		 
		 System.out.println(dateFormat.format(localTime));

	}

}
