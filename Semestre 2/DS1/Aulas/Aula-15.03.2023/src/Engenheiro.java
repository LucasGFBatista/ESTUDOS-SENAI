
public class Engenheiro extends Funcionario {
		private String crea;

		public Engenheiro() {
			super();
		}

		public Engenheiro(int id, String nome, int idade, Genero genero, String cpf, String rg, String crea , String matricula,
				double salario, Setor setor , Endereco endereco) {
			super(id, nome, idade, genero, cpf, rg, matricula, salario, setor, endereco);
			this.crea = crea;
		}

		@Override
		public String toString() {
			return "Engenheiro\n" + 
					"\nNome: " + nome + 
					"\nID: " + id + 
					"\nMatricula: " + matricula + 
					"\nCPF: " + cpf + 
					"\nRG: " + rg + 
					"\nCrea: " + crea +
					"\nIdade: " + idade + 
					"\nGenero: " + genero.valor + 
					"\nSetor: " + Setor.ENGENHARIA.nomeSetor + 
					"\nSalario: R$" + salario + 
					"\n\nENDEREÇO\n" + endereco.toString();
	
	
		
		
		
}
