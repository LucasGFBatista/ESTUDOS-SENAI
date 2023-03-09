package Aula0803;

public class ProfessorNutricao extends Funcionario {

	private String crn;

	@Override
	public String toString() {
		return "\nProf. Nutrição \nNome: " + super.nome +
				"\nID: " + super.id +
				"\ncrn: " + this.crn +
				"\nIdade: " + super.idade +
				"\nGenero: " + super.genero +
				"\nSetor: " + Setor.ACADEMICO ;
	}

	/* COSNTRUCTORS */
	public ProfessorNutricao() {
		super();
	}

	public ProfessorNutricao(int id, String nome, int idade, Genero genero, String crn) {
		super(id, nome, idade, genero, Setor.ACADEMICO);
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