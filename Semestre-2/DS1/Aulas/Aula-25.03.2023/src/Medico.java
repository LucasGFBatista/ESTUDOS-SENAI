import java.time.LocalDate;

public class Medico extends Funcionario {
	private String crm;

	public Medico() {

	}

	public Medico(int id, String nome, LocalDate dataNascimento, int idade, Genero genero, 
			String cpf, String rg, String matricula, double salario, String crm, Endereco endereco) {
		super(id, nome, dataNascimento, idade, genero, endereco, cpf, rg, matricula, salario);
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
				"\nData nascimento: " + super.getdataNascimento() +
				"\nIdade: " + idade + 
				"\nGenero: " + genero.texto +
				"\nSetor: " + Setor.SAUDE.nomeSetor +
				"\nSalario: " + super.getSalario() + 
				"\n\nENDERECO\n" + endereco.toString();
	}

	public String getcrm() {
		return crm;
	}

	public void setcrm(String crm) {
		this.crm = crm;
	}

}
