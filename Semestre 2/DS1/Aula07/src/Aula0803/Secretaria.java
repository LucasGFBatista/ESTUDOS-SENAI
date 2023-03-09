package Aula0803;

public class Secretaria extends Funcionario {

	

	@Override
	public String toString() {
		return "\nSecretaria \nNome: " + super.nome +
				"\nID: " + super.id +
				"\nIdade: " + super.idade +
				"\nGenero: " + super.genero +
				"\nSetor: " + Setor.SECRETARIA ;
	}

	/* COSNTRUCTORS */
	public Secretaria() {
		super();
	}

	public Secretaria(int id, String nome, int idade, Genero genero, String crea) {
		super(id, nome, idade, genero, Setor.SECRETARIA);
		
	}

}