import java.time.LocalDate;

public class Engenheiro extends Funcionario {
	private String crea;

	public Engenheiro() {

	}

	public Engenheiro(int id, String nome, LocalDate dataNascimento, int idade, Genero genero, Endereco endereco,
			String cpf, String rg, String matricula, double salario, String crea) {
		super(id, nome, dataNascimento, idade, genero, endereco, cpf, rg, matricula, salario);
		this.crea = crea;
	}

	@Override
	public String toString() {
		return "Engenheiro\n" + "\nNome: " + nome +
				"\nID: " + id +
				"\nMatricula: " + matricula +
				"\nCPF: " + cpf +
				"\nRG: " + rg +
				"\nCrea: " + crea +
				"\nData nascimento: " + dataNascimento +
				"\nIdade: " + idade + 
				"\nGenero: " + genero.valor +
				"\nSetor: " + Setor.ENGENHARIA +
				"\nSalario: R$" + salario + 
				"\n\nENDERECO\n" + endereco.toString();
	}

	public String getCrea() {
		return crea;
	}

	public void setCrea(String crea) {
		this.crea = crea;
	}

}
