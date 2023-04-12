package Aula0803;

public class ProfessorEngenharia extends Funcionario {

	private String crea;

	@Override
	public String toString() {
		return "\nProf. Engenharia \nNome: " + super.nome +
				"\nID: " + super.id +
				"\nCREA: " + this.crea +
				"\nIdade: " + super.idade +
				"\nGenero: " + super.genero +
				"\nSetor: " + Setor.ACADEMICO ;
	}

	/* COSNTRUCTORS */
	public ProfessorEngenharia() {
		super();
	}

	public ProfessorEngenharia(int id, String nome, int idade, Genero genero, String crea) {
		super(id, nome, idade, genero, Setor.ACADEMICO);
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