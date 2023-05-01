import java.time.LocalDate;

public class Advogado extends Funcionario {
	private String oab;

	public Advogado() {

	}

	public Advogado(int id, String nome, LocalDate dataNascimento, int idade, Genero genero, Endereco endereco,
			String cpf, String rg, String matricula, double salario, String oab) {
		super(id, nome, dataNascimento, idade, genero, endereco, cpf, rg, matricula, salario);
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
				"\nData nascimento: " + dataNascimento +
				"\nIdade: " + idade + 
				"\nGenero: " + genero.valor +
				"\nSetor: " + Setor.JURIDICO +
				"\nSalario: R$" + salario + 
				"\n\nENDERECO\n" + endereco.toString();
	}

	public String getoab() {
		return oab;
	}

	public void setoab(String oab) {
		this.oab = oab;
	}

}
