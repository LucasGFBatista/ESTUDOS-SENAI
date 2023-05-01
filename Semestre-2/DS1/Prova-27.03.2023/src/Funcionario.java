import java.text.NumberFormat;

public abstract class Funcionario extends PessoaFisica {
	protected String cpf;
	protected String rg;
	protected String matricula;
	protected static Setor setor;
	protected double salario;

	/* Constructor */

	public Funcionario() {

	}

	public Funcionario(int id, String nome, String telefone, String email, Endereco endereco, int idade, Genero genero,
			String cpf, String rg, String matricula, double salario) {
		super(id, nome, telefone, email, endereco, idade, genero);
		this.cpf = cpf;
		this.rg = rg;
		this.matricula = matricula;
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		Funcionario.setor = setor;
	}

	public String getSalario() {
		NumberFormat brl = NumberFormat.getCurrencyInstance();
		return brl.format(salario);
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario\n" + "\nNome: " + nome +
				"\nID: " + id +
				"\nMatricula: " + matricula +
				"\nCPF" + cpf
				+ "\nRG: " + rg +
				"\nIdade: " + idade +
				"\nGenero: " + genero.valor +
				"\nSetor: " + setor.nomeSetor
				+ "\nSalario: R$" + salario +
				"\n\nENDERE�O\n" + endereco.toString();

	}
}