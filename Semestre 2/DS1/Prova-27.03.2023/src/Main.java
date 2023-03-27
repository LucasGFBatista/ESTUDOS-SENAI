
public class Main {
	public static void main(String[] args) {

		Advogado a1 = new Advogado(35, "Saul", "79 5555-5555", "lucas@email.com", 24, Genero.MASCULINO, "15155151",
				"1515151", "58585", 10000, "4598", new Endereco("4111", "Rua Sem Nome", "45",
						"Do lado da casa do carinha", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));

		Cliente c1 = new Cliente(777, "Friedrich Nietzsche", "4002-8922", "eternoretorno@loucura.com", 55,
				Genero.MASCULINO, 1844, new Endereco("4111", "Rua Zaratrusta", "7", "Proximo a Rotatoria infinita",
						"Pato Branco", UnidadeFederativa.PARANA));

		Engenheiro e1 = new Engenheiro(901, "Lucas Goncalves", "71 98715-3214", "lucas@email.com", 24, Genero.MASCULINO,
				"15155151", "1515151", "58585", 10000, "4598", new Endereco("4111", "Rua Sem Nome", "45",
						"Do lado da casa do carinha", "Salvador", UnidadeFederativa.ACRE));

		Medico m1 = new Medico(901, "Lucas Goncalves", "71 98715-3214", "lucas@email.com", 24, Genero.MASCULINO,
				"15155151", "1515151", "58585", 10000, "4598", new Endereco("4111", "Rua Sem Nome", "45",
						"Do lado da casa do carinha", "Rio Branco", UnidadeFederativa.ACRE));

		PessoaJuridica pj1 = new PessoaJuridica(258, "Steven Universe", "89 5555-6666", "stevenuniverse@cartoon.com",
				"11111111", "5894948", new Endereco("4111", "Rua Sem Nome", "45", "Do lado da casa do carinha",
						"Salvador", UnidadeFederativa.BAHIA));

		/*----------------------------------------------------------------------------------------------*/

		System.out.println(a1.toString()); // ADVOGADO
		System.out.println(c1.toString()); // CLIENTE
		System.out.println(e1.toString()); // ENGENEHEIRO
		System.out.println(m1.toString()); // MEDICO
		System.out.println(pj1.toString()); // PESSSOA JURIDICA

	}
}
