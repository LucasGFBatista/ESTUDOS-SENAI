public abstract class PessoaFisica extends Pessoa {

	protected int idade;
	protected Genero genero;

	/* CONSTRUCTORS */
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(int id, String nome, String telefone, String email, Endereco endereco, int idade,
			Genero genero) {
		super(id, nome, telefone, email, endereco);
		this.idade = idade;
		this.genero = genero;
	}

	/* GETTERS AND SETTERS */

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

}
