package Atividade01;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca {
	private final double PARTICIPACAO_LUCRO = 0.1;

	// CONSTRUCTOR
	public Diretor() {
		super();

	}

	public Diretor(String nome, String cpf, Genero genero, double salarioBase, LocalDate dataAdmissao,
			Bonificacao bonificacao) {
		super(nome, cpf, genero, salarioBase, dataAdmissao, bonificacao);
		this.PARTICIPACAO_LUCRO = PARTICIPACAO_LUCRO;
	}

	// GETTER AND SETTER
	public double getPARTICIPACAO_LUCRO() {
		return PARTICIPACAO_LUCRO;
	}

	public void setPARTICIPACAO_LUCRO(double PARTICIPACAO_LUCRO) {
		this.PARTICIPACAO_LUCRO = PARTICIPACAO_LUCRO;
	}

	// GET SALARIO FINAL
	public String getSalarioFinal(double salarioBase) {

		double salarioFinal = salarioBase + (salarioBase * Bonificacao.DIRETOR.valor) + (salarioBase * PARTICIPACAO_LUCRO);

		return Util.formatBrl(salarioFinal);
	}

		@Override
		public String toString() {
			return "\nDIRETOR " +
					"\n\nNome: " + super.nome +
					"\nCPF: " + super.cpf +
					"\nData de admissao: " + super.getDataAdmissao() +
					"\nGenero: " + super.genero.texto + 
					"\nSalario Base: " + super.getSalarioBase() +
					"\nSalario Final: " + this.getSalarioFinal(salarioBase);
		}

	}
