import java.time.LocalDate;
import java.time.Month;

public class Main {
	public static void main(String[] args) {

		Advogado a1 = new Advogado(901, "Lucas", "71 98888-5555", "lucas@email.com", Genero.MASCULINO, EstadoCivil.SOLTEIRO, LocalDate.of(1998, Month.DECEMBER,15), "555.555.555.55", "2597192540", "555555", 10000, "85555", new Endereco("4111", "Rua Sem Nome", "45","Do lado da casa do carinha", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
		
		

		/*----------------------------------------------------------------------------------------------*/

		System.out.println(a1.toString()); // ADVOGADO
		/*
		System.out.println(c1.toString()); // CLIENTE
		System.out.println(e1.toString()); // ENGENEHEIRO
		System.out.println(m1.toString()); // MEDICO
		System.out.println(pj1.toString()); // PESSSOA JURIDICA
*/
	}
}
