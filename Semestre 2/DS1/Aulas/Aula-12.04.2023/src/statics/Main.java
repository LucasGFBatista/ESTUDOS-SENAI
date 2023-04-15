package statics;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario(901, "Lucas", Genero.MASCULINO, "085.555.458-78", "1616876065",
				LocalDate.of(1998, 12, 15), 10000, new Endereco("41811-123", "Rua de Baixo", "55",
						"Depois da Rua de Cima", "Salvador", UnidadeFederativa.BAHIA));
		
		PessoaJuridica pj = new PessoaJuridica(508, "Karl Marx", Genero.MASCULINO, "8818181818", "8828282", LocalDate.of(1998, 12, 15), LocalDate.of(2023, 04, 15), new Endereco("41811-123", "Rua de Baixo", "55",
				"Depois da Rua de Cima", "Salvador", UnidadeFederativa.BAHIA));
		
		
		
		System.out.println(funcionario.toString());
		System.out.println(pj.toString());
		
	}

}
