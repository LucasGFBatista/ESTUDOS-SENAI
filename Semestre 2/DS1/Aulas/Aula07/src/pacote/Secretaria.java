package pacote;

public class Secretaria extends Funcionario {

	

	@Override
	public String toString() {
		return "Secretaria \nNome: " + super.nome +
				"\nID: " + super.id +
				"\nIdade: " + super.idade +
				"\nQuantidade de filhos: " + super.qntfilho +
				"\nGenero: " + super.genero +
				"\nSetor: " + Setor.SECRETARIA ;
	}

	/* COSNTRUCTORS */
	public Secretaria() {
		super();
	}

	public Secretaria(int id, String nome, int idade, int qntfilho, Genero genero) {
		super(id, nome, idade, qntfilho, genero, Setor.SECRETARIA);
	}


}