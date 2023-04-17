package Atividade01;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {

	// FORMATADOR DE DATA PARA O PADRÃO BRASILEIRO
	public static String formatDate(LocalDate date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		return formatter.format(date);
	}

	// FORMATADOR DE VALOR FINANCEIRO PARA PADRAO BRASILEIRO
	public static String formatBrl(double value) {

		NumberFormat formatter = NumberFormat.getCurrencyInstance();

		return formatter.format(value);
	}
}
