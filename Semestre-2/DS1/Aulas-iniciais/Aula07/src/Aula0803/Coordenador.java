package Aula0803;

public class Coordenador extends Funcionario {

	

	@Override
	public String toString() {
		return "\nCoordenador \nNome: " + super.nome +
				"\nID: " + super.id +
				"\nIdade: " + super.idade +
				"\nGenero: " + super.genero +
				"\nSetor: " + Setor.COORDENACAO ;
	}

	/* COSNTRUCTORS */
	public Coordenador() {
		super();
	}

	public Coordenador(int id, String nome, int idade, Genero genero, String crea) {
		super(id, nome, idade, genero, Setor.COORDENACAO);
		
	}

}