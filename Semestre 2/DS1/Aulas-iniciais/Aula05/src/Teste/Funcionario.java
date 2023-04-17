package Teste;
public class Funcionario {

	private String nome;
	private int idade;
	private Genero genero;
	//private Departamento departamento;

	@Override
	public String toString() {
		return "Nome: " + nome + 
				"\nIdade: " + idade + 
				"\nGenero: " + genero;
				//"\nDepartamento: " + this.departamento;
	}

	/* CONSTRUCTOR */
	public Funcionario() {

	}

	public Funcionario(String nome, int idade, Genero genero/*, Departamento departamento*/) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		//this.departamento = departamento;
	}

	/* GET AND SETS */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
/*
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
*/
}
