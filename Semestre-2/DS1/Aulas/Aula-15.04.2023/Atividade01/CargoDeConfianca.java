package Atividade01;

import java.time.LocalDate;

public abstract class CargoDeConfianca extends Funcionario {
	
	protected Bonificacao bonificacao;

	// CONSTRUCTOR
	public CargoDeConfianca() {
		super();
	}

	public CargoDeConfianca(String nome, String cpf, Genero genero, double salarioBase, LocalDate dataAdmissao,
			Bonificacao bonificacao) {
		super(nome, cpf, genero, salarioBase, dataAdmissao);
		this.bonificacao = bonificacao;
	}

	// GETTERS AND SETTERS
	public Bonificacao getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(Bonificacao bonificacao) {
		this.bonificacao = bonificacao;
	}

}
