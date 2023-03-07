package pacote;

public abstract class Funcionario {

	protected int id;
	protected String nome;
	protected int idade;
	protected int qntfilho;
	protected Genero genero;
	protected Setor setor;
	
	/*CONSTRUCTOR*/
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(int id, String nome, int idade, int qntfilho, Genero genero, Setor setor) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.qntfilho = qntfilho;
		this.genero = genero;
		this.setor = setor;
	}

	
	
	
	/*GETTERS AND SETTERS*/
	
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

	public int getQntfilho() {
		return qntfilho;
	}

	public void setQntfilho(int qntfilho) {
		this.qntfilho = qntfilho;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	
	
}
