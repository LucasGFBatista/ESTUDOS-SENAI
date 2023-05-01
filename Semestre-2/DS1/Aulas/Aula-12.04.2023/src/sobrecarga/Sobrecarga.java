package sobrecarga;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sobrecarga {
	
	/*METHOD WITHOUT DATE*/
	public String saveFile(String nameFile, String extensionType) {
		
		return nameFile + "." + extensionType;
	}
	
	/*METHOD WITH DATE*/
	public String saveFile(String nameFile, LocalDate date, String extensionType) {
		
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("-dd-MM-yyyy");
		
		return nameFile + date.format(formatDate) + "." + extensionType;
	}
	
	
}
