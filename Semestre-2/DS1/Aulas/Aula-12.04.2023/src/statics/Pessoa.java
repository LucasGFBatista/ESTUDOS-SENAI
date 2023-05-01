package statics;

public abstract class Pessoa {
	protected int id;
	protected String nome;
	protected Genero genero;
	protected Endereco endereco;

	/* Constructors */

	public Pessoa() {
	}

	public Pessoa(int id, String nome, Genero genero, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.genero = genero;
		this.endereco = endereco;

	}

	/* Getter and Setter */

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

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}