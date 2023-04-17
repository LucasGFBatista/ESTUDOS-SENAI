package pacote;

public class Nutricionista extends Funcionario {

	private String crn;

	@Override
	public String toString() {
		return "Nutricionista \nNome: " + super.nome +
				"\nID: " + super.id +
				"\nCRN: " + this.crn +
				"\nIdade: " + super.idade +
				"\nQuantidade de filhos: " + super.qntfilho +
				"\nGenero=" + super.genero +
				"\nSetor=" + Setor.NUTRICAO;
	}

	/* COSNTRUCTORS */
	public Nutricionista() {
		super();
	}

	public Nutricionista(int id, String nome, int idade, int qntfilho, Genero genero, String crn) {
		super(id, nome, idade, qntfilho, genero, Setor.NUTRICAO);
		this.crn = crn;
	}

	/* GETTER AND SETTER */
	public String getcrn() {
		return crn;
	}

	public void setcrn(String crn) {
		this.crn = crn;
	}

}