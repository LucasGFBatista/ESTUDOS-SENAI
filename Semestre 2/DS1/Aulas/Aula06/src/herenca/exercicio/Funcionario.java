package herenca.exercicio;

public abstract class Funcionario {

	protected int id;
	protected String nome;
	protected int idade;

	/* CONSTRUCTORS */
	public Funcionario() {

	}

	public Funcionario(int id, String nome, int idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}

	/* GETS AND SETS */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

}
