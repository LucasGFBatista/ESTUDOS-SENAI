package pacote;

public class Medico extends Funcionario {

	private String crm;

	@Override
	public String toString() {
		return "Medico \nNome: " + super.nome +
				"\nID: " + super.id +
				"\nCRm: " + this.crm +
				"\nIdade: " + super.idade +
				"\nQuantidade de filhos: " + super.qntfilho +
				"\nGenero=" + super.genero +
				"\nSetor=" + Setor.MEDICINA ;
	}

	/* COSNTRUCTORS */
	public Medico() {
		super();
	}

	public Medico(int id, String nome, int idade, int qntfilho, Genero genero, String crm) {
		super(id, nome, idade, qntfilho, genero, Setor.MEDICINA);
		this.crm = crm;
	}

	/* GETTER AND SETTER */
	public String getcrm() {
		return crm;
	}

	public void setcrm(String crm) {
		this.crm = crm;
	}

}