import java.time.LocalDate;

public abstract class Fornecedor extends Pessoa {
	protected String cnpj;
	protected String inscricaoEstadual;

	/* COSNTRUCTORS */

	public Fornecedor() {
		super();
	}

	public Fornecedor(int id, String nome, LocalDate dataNascimento, int idade, Genero genero, Endereco endereco,
			String cnpj, String inscricaoEstadual) {
		super(id, nome, dataNascimento, idade, genero, endereco);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}

	/* GETTERS AND SETTERS */
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

}
