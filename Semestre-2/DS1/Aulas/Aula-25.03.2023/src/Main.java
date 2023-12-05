import java.time.LocalDate;
import java.time.Month;

public class Main {
	public static void main(String[] args) {

	/*	Medico m1 = new Medico(1, "Hugo", LocalDate.of(1979, 05, 2), 25, Genero.MASCULINO, "124564", "542", "442", "45",
				5000, Setor.SAUDE, new Endereco("45", "Rua", "45", "55", "Salvador", UnidadeFederativa.BAHIA));*/
		
		Medico m1 = new Medico(01, "Lucas", LocalDate.of(1979, Month.FEBRUARY, 15), 35, Genero.MASCULINO, "07444444", "45454545", "5454454", 8000, "45454", new Endereco("4111", "Rua Sem Nome", "45", "Do lado da casa do carinha", "Salvador", UnidadeFederativa.ACRE));

		System.out.println(m1.toString());

	}

}
