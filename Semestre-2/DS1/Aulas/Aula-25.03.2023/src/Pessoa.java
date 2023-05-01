import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pessoa {
	protected int id;
	protected String nome;
	protected int idade;
	protected LocalDate dataNascimento;
	protected Genero genero;
	protected Endereco endereco;

	/* Constructors */

	public Pessoa() {
	}

	public Pessoa(int id, String nome, LocalDate dataNascimento, int idade, Genero genero, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getdataNascimento() {
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return dataNascimento.format(formatar);
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
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
