
public class Medico extends Funcionario {
		private String crm;

		public Medico() {
			super();
		}

		public Medico(int id, String nome, int idade, Genero genero, String cpf, String rg, String crm , String matricula,
				double salario, Setor setor , Endereco endereco) {
			super(id, nome, idade, genero, cpf, rg, matricula, salario, setor, endereco);
			this.crm = crm;
		}

		@Override
		public String toString() {
			return "Engenheiro\n" + 
					"\nNome: " + nome + 
					"\nID: " + id + 
					"\nMatricula: " + matricula + 
					"\nCPF" + cpf + 
					"\nRG: " + rg + 
					"\ncrm: " + crm +
					"\nIdade: " + idade + 
					"\nGenero: " + genero.valor + 
					"\nSetor: " + Setor.ENGENHARIA.nomeSetor + 
					"\nSalario: R$" + salario + 
					"\n\nENDEREÇO\n" + endereco.toString();
	
	
		
		
		
}
