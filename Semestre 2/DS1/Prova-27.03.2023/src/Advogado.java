
public class Advogado extends Funcionario {
	private String oab;

	/* CONSTRUCTORS */
	public Advogado() {

	}

	public Advogado(int id, String nome, String telefone, String email, int idade, Genero genero, String cpf, String rg,
			String matricula, double salario, String oab, Endereco endereco) {
		super(id, nome, telefone, email, endereco, idade, genero, cpf, rg, matricula, salario);
		this.oab = oab;
	}

	/* GETTER AND SETTER */

	public String getoab() {
		return oab;
	}

	public void setoab(String oab) {
		this.oab = oab;
	}

	@Override
	public String toString() {
		return "Advogado\n" + "\nNome: " + nome +
				"\nID: " + id +
				"\nMatricula: " + matricula +
				"\nCPF: " + cpf + 
				"\nRG: " + rg + 
				"\noab: " + oab +
				"\nIdade: " + idade +
				"\nGenero: " + genero.texto +
				"\nSetor: " + Setor.JURIDICO.nomeSetor +
				"\nSalario: " + super.getSalario() +
				"\n\nENDERECO\n" + endereco.toString();
	}

}