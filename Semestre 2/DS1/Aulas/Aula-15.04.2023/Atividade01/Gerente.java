package Atividade01;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca {

	public Gerente() {
		super();

	}

	public Gerente(String nome, String cpf, Genero genero, double salarioBase, LocalDate dataAdmissao,
			Bonificacao bonificacao) {
		super(nome, cpf, genero, salarioBase, dataAdmissao, bonificacao);

	}

	// GET SALARIO FINAL
	public String getSalarioFinal(double salarioBase) {

		double salarioFinal = salarioBase + (salarioBase * Bonificacao.GERENTE.valor);

		return Util.formatBrl(salarioFinal);
	}

	@Override
	public String toString() {
		return "\nGERENTE " +
				"\n\nNome: " + super.nome +
				"\nCPF: " + super.cpf +
				"\nData de admissao: " + super.getDataAdmissao() +
				"\nGenero: " + super.genero.texto + 
				"\nSalario Base: " + super.getSalarioBase() +
				"\nSalario Final: " + this.getSalarioFinal(salarioBase)
				;
		}
}
