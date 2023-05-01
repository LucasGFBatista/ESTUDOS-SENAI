
public abstract class Pessoa {
	protected int id;
	protected String nome;

	public Pessoa() {
	}

	public Pessoa(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	/* GET AND SETS */
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

}
