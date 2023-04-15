package statics;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Util {

	public static String formatDate(LocalDate date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		return formatter.format(date);
	}

	public static String formatBrl(double value) {

		NumberFormat formatter = NumberFormat.getCurrencyInstance();

		return formatter.format(value);
	}
	
	
	public static int timeBetween (LocalDate birthDate) {
		
		Period age = Period.between(birthDate, LocalDate.now());
		
		return age.getYears();
	}
	
	public static int timeBetween (LocalDate dateStart, LocalDate dateFinish) {
		
		Period days = Period.between(dateStart, dateFinish);
		
		return days.getDays();
	}

}
