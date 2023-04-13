package sobrecarga;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Sobrecarga sobrecarga = new Sobrecarga();
		
		System.out.println(sobrecarga.saveFile("Receita", "doc"));
		System.out.println(sobrecarga.saveFile("Receita", LocalDate.now(), "doc"));
	}
}
