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

	public static int timeBetween(LocalDate birthDate) {

		Period age = Period.between(birthDate, LocalDate.now());

		return age.getYears();
	}

	public static String timeBetween(LocalDate dateStart, LocalDate dateFinish) {

		Period period = Period.between(dateStart, dateFinish);
		
		//return period.getDays() + "dias " + "\n" + period.getMonths() + " meses" + "\n" + period.getYears() + " anos";
		
		
		if (period.getDays() <= 30 && period.getMonths() <= 0) {
			
			return period.getDays() + " dias";
			
		} else if (period.getDays() >= 30 && period.getDays() < 365 && period.getYears() < 1) {
			
			return period.getMonths() + " meses";
			
		} else {
			return period.getYears() + " anos e " + period.getMonths() + " meses";
			
		}
	
		

	}

}
