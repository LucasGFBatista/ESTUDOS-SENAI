package pacote;

public class Advogado extends Funcionario {

	private String oab;

	@Override
	public String toString() {
		return "Advogado \nNome: " + super.nome +
				"\nID: " + super.id +
				"\nOAB: " + this.oab +
				"\nIdade: " + super.idade +
				"\nQuantidade de filhos: " + super.qntfilho +
				"\nGenero=" + super.genero +
				"\nSetor=" + Setor.JURIDICO;
	}

	/* COSNTRUCTORS */
	public Advogado() {
		super();
	}

	public Advogado(int id, String nome, int idade, int qntfilho, Genero genero, String oab) {
		super(id, nome, idade, qntfilho, genero, Setor.JURIDICO);
		this.oab = oab;
	}

	/* GETTER AND SETTER */
	public String getoab() {
		return oab;
	}

	public void setoab(String oab) {
		this.oab = oab;
	}

}