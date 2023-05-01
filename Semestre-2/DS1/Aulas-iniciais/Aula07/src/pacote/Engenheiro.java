package pacote;

public class Engenheiro extends Funcionario {

	private String crea;

	@Override
	public String toString() {
		return "Engenheiro \nNome: " + super.nome +
				"\nID: " + super.id +
				"\nCREA: " + this.crea +
				"\nIdade: " + super.idade +
				"\nQuantidade de filhos: " + super.qntfilho +
				"\nGenero=" + super.genero +
				"\nSetor=" + Setor.ENGENHARIA ;
	}

	/* COSNTRUCTORS */
	public Engenheiro() {
		super();
	}

	public Engenheiro(int id, String nome, int idade, int qntfilho, Genero genero, String crea) {
		super(id, nome, idade, qntfilho, genero, Setor.ENGENHARIA);
		this.crea = crea;
	}

	/* GETTER AND SETTER */
	public String getCrea() {
		return crea;
	}

	public void setCrea(String crea) {
		this.crea = crea;
	}

}