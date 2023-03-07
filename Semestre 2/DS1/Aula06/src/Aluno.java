
public class Aluno extends Pessoa {

	private String disciplina;
	private int nota;

	/* CONSTRUCTOR */

	public Aluno() {

	}

	public Aluno(String diciplina, int nota, int id, String nome) {
		super(id, nome);
		this.disciplina = diciplina;
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Aluno " + "\nNome: " + super.nome + "\nID: " + super.id + "\nDisciplina: " + this.disciplina
				+ "\nNota: " + this.nota;
	}

	/* GET AND SETS */
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

}
