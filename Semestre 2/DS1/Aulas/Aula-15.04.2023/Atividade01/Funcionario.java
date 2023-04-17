package Atividade01;

import java.time.LocalDate;

public abstract class Funcionario {
	protected String nome;
	protected String cpf;
	protected Genero genero;
	protected double salarioBase;
	protected Bonificacao bonificacao;
	protected LocalDate dataAdmissao;

	// CONSTRUCTORS
	public Funcionario() {
		super();
	}

	public Funcionario(String nome, String cpf, Genero genero, double salarioBase, LocalDate dataAdmissao) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.genero = genero;
		this.salarioBase = salarioBase;
		this.dataAdmissao = dataAdmissao;
	}

	// GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getSalarioBase() {
		return Util.formatBrl(salarioBase);
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public String getDataAdmissao() {

		return Util.formatDate(dataAdmissao);
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	// GET SALARIO FINAL
	public double getSalarioFinal(double salarioBase, Bonificacao bonificacao) {

		return salarioBase + (salarioBase * bonificacao.valor);
	}

	@Override
	public String toString() {
		return "\nFuncionario \nNome: " + this.nome + 
				"\nCPF: " + this.cpf + 
				"\nGenero:" + this.genero + 
				"\nSalarioBase: " + this.salarioBase + 
				"\nData de admissao: " + this.getDataAdmissao() + 
				"\nSalario Fina:" + this.getSalarioBase();
	}

}
