
public class Medico extends Funcionario {
	private String crm;

	/* CONSTRUCTORS */
	public Medico() {

	}

	public Medico(int id, String nome, String telefone, String email, int idade, Genero genero,
			String cpf, String rg, String matricula, double salario, String crm, Endereco endereco) {
		super(id, nome, telefone, email, endereco, idade, genero, cpf, rg, matricula, salario);
		this.crm = crm;
	}

	/* GETTER AND SETTER */

	public String getcrm() {
		return crm;
	}

	public void setcrm(String crm) {
		this.crm = crm;
	}

	@Override
	public String toString() {
		return "Medico\n" + "\nNome: " + nome +
				"\nID: " + id +
				"\nMatricula: " + matricula +
				"\nCPF: " + cpf + 
				"\nRG: " + rg + 
				"\ncrm: " + crm +
				"\nIdade: " + idade +
				"\nGenero: " + genero.texto +
				"\nSetor: " + Setor.SAUDE.nomeSetor +
				"\nSalario: " + super.getSalario() +
				"\n\nENDERECO\n" + endereco.toString();
	}

}