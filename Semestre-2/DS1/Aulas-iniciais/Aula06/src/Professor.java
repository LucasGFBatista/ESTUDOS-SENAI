
public class Professor extends Pessoa {
	protected String matricula;
	
	
	
	

	@Override
	public String toString() {
		return "Professor [matricula=" + matricula + ", id=" + id + ", nome=" + nome + "]";
	}

	/* CONSTRUCTORS */
	public Professor() {

	}

	public Professor(String matricula, int id, String nome) {
		super(id, nome);
		this.matricula = matricula;
	}

	/* GET AND SET */
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
