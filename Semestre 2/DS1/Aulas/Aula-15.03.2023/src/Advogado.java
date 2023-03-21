
public class Advogado extends Funcionario {
	private String oab;

	public Advogado() {

	}

	public Advogado(int id, String nome, int idade, Genero genero, String cpf, String rg, String oab, String matricula,
			double salario, Setor setor, Endereco endereco) {
		super(id, nome, idade, genero, cpf, rg, matricula, salario, setor, endereco);
		this.oab = oab;
	}

	@Override
	public String toString() {
		return "\nAdvogado\n" + "\nNome: " + nome + "\nID: " + id + "\nMatricula: " + matricula + "\nCPF: " + cpf
				+ "\nRG: " + rg + "\noab: " + oab + "\nIdade: " + idade + "\nGenero: " + genero.valor + "\nSetor: "
				+ setor.JURIDICO + "\nSalario: R$" + salario + "\n\nENDEREÃ‡O\n" + endereco.toString();
	}

	public String getOab() {
		return oab;
	}

	public void setOab(String oab) {
		this.oab = oab;
	}

}
