package Aula0803;

public class ProfessorDireito extends Funcionario {

	private String oab;

	@Override
	public String toString() {
		return "\nProf. Direito \nNome: " + super.nome +
				"\nID: " + super.id +
				"\noab: " + this.oab +
				"\nIdade: " + super.idade +
				"\nGenero: " + super.genero +
				"\nSetor: " + Setor.ACADEMICO ;
	}

	/* COSNTRUCTORS */
	public ProfessorDireito() {
		super();
	}

	public ProfessorDireito(int id, String nome, int idade, Genero genero, String oab) {
		super(id, nome, idade, genero, Setor.ACADEMICO);
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