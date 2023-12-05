
public class Engenheiro extends Funcionario {
	private String crea;

	/* CONSTRUCTORS */
	public Engenheiro() {

	}

	public Engenheiro(int id, String nome, String telefone, String email, int idade, Genero genero, String cpf,
			String rg, String matricula, double salario, String crea, Endereco endereco) {
		super(id, nome, telefone, email, endereco, idade, genero, cpf, rg, matricula, salario);
		this.crea = crea;
	}

	/* GETTER AND SETTER */

	public String getcrea() {
		return crea;
	}

	public void setcrea(String crea) {
		this.crea = crea;
	}

	@Override
	public String toString() {
		return "Engenheiro\n" + "\nNome: " + nome +
				"\nID: " + id +
				"\nMatricula: " + matricula +
				"\nCPF: " + cpf + 
				"\nRG: " + rg + 
				"\ncrea: " + crea +
				"\nIdade: " + idade +
				"\nGenero: " + genero.texto +
				"\nSetor: " + Setor.ENGENHARIA.nomeSetor +
				"\nSalario: " + super.getSalario() +
				"\n\nENDERECO\n" + endereco.toString();
	}

}