public abstract class Funcionario extends Pessoa {
	protected String cpf;
	protected String rg;
	protected String matricula;
	protected Setor setor;
	protected double salario;

	/* Constructor */

	public Funcionario() {

	}

	public Funcionario(int id, String nome, int idade, Genero genero, String cpf, String rg, String matricula,
			double salario, Setor setor, Endereco endereco) {
		super(id, nome, idade, genero, endereco);
		this.cpf = cpf;
		this.rg = rg;
		this.matricula = matricula;
		this.setor = setor;
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
		this.setor = setor;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario\n" + "\nNome: " + nome + "\nID: " + id + "\nMatricula: " + matricula + "\nCPF" + cpf
				+ "\nRG: " + rg + "\nIdade: " + idade + "\nGenero: " + genero.valor + "\nSetor: " + setor.nomeSetor
				+ "\nSalario: R$" + salario + "\n\nENDEREÇO\n" + endereco.toString();

	}
}
