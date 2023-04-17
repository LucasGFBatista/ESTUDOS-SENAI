package herenca.exercicio;

public class Medico extends Funcionario {
	private String crm;

	/* CONSTRUCTORS */
	public Medico() {

	}

	public Medico(int id, String nome, int idade, String crm) {
		super(id, nome, idade);
		this.crm = crm;
	}

	/* GET AND SET */
	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}


	
	/*METHODS*/
	
	@Override
	public String toString() {
		return "Medico \nNome:" + nome 
				+ "\nId: " + id 
				+ "\nIdade: " + idade 
				+ "\nCRM: " + crm;
	}
	

}
