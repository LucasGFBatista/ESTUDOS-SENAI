package statics;

import java.time.LocalDate;
import java.time.Period;

public abstract class Funcionario extends Pessoa {
	protected String cpf;
	protected String rg;
	protected LocalDate dataNascimento;
	protected double salario;

	/* Constructor */

	public Funcionario() {

	}

	public Funcionario(int id, String nome, Genero genero, Endereco endereco, String cpf, String rg,
			LocalDate dataNascimento, double salario) {
		super(id, nome, genero, endereco);
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}

	/* Getter and Setter */

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSalario() {

		return Util.formatBrl(salario);
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataNascimento() {
		return Util.formatDate(dataNascimento);
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade(LocalDate dataNascimento) {

		return Util.timeBetween(dataNascimento);
	}

	@Override
	public String toString() {
		return "Funcionario\n" 
				+ "\nNome: " + super.nome
				+ "\nIdade" + this.getIdade(dataNascimento)
				+ "\nID: " + super.id 
				+ "\nCPF" + this.cpf 
				+ "\nRG: " + this.rg
				+ "\nData de Nascimento: " + this.dataNascimento
				+ "\nGenero: " + super.genero.valor 
				+ "\nSalario: R$" + this.salario 
				+ "\n\nENDERE�O\n" + super.endereco.toString();

	}
}