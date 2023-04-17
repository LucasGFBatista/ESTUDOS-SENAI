package herenca.exercicio;

public class Engenheiro extends Funcionario {
	private String crea;

	
	/*CONSTRUCTORS*/
	public Engenheiro() {

	}

	public Engenheiro(int id, String nome, int idade, String crea) {
		super(id, nome, idade);
		this.crea = crea;
	}


	
	/*GET AND SET*/
	
	public String getCrea() {
		return crea;
	}

	public void setCrea(String crea) {
		this.crea = crea;
	}


	
	/*METHODS*/
	
	@Override
	public String toString() {
		return "ENGENHEIRO \nNome:" + nome 
				+ "\nId: " + id 
				+ "\nIdade: " + idade 
				+ "\nCRM: " + crea;
	}
	
	

}
