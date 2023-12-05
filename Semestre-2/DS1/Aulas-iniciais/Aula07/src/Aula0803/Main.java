package Aula0803;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int menuCargo, menuProfessor;
		int id, idade;
		String nome, generoStr, oab, crea, crn;
		Genero genero;
		
		System.out.print("\nDigite o ID do funcionario: ");
		id = leitor.nextInt();
		
		System.out.print("Digite o nome do funcionario: ");
		nome = leitor.next();
		
		System.out.print("Digite a idade do funcionario: ");
		idade = leitor.nextInt();
		
		System.out.print("Digite o gênero do funcionario (M/F): ");
		generoStr = leitor.next();
		genero = generoStr.equals("M") ? Genero.MASCULINO : Genero.FEMININO;
		
		System.out.print("\nCargo do funcionario: \n1 - Coordenador \n2 - Secretária \n3 - Professor Direito \n4 - Professor Nutrição \n5 - Professor Engenharia \nDigite uma opção: ");
		menuCargo = leitor.nextInt();
		
		switch (menuCargo) {
		case 1:
			Coordenador coordenador = new Coordenador();
			coordenador.setId(id);
			coordenador.setNome(nome);
			coordenador.setIdade(idade);
			coordenador.setGenero(genero);

			System.out.println(coordenador.toString());
			
			break;
			
		case 2:
			Secretaria secretaria = new Secretaria();
			secretaria.setId(id);
			secretaria.setNome(nome);
			secretaria.setIdade(idade);
			secretaria.setGenero(genero);

			System.out.println(secretaria.toString());
			
			break;
			
		case 3:
			
			System.out.println("Digite a OAB do professor: ");
			oab = leitor.next();
			
			
			ProfessorDireito professorDireito = new ProfessorDireito();
			professorDireito.setId(id);
			professorDireito.setoab(oab);
			professorDireito.setNome(nome);
			professorDireito.setIdade(idade);
			professorDireito.setGenero(genero);

			System.out.println(professorDireito.toString());
			
			break;

		case 4:
			
			System.out.println("Digite a CRN do professor: ");
			crn = leitor.next();
			
		ProfessorNutricao professorNutricao = new ProfessorNutricao();
			professorNutricao.setId(id);
			professorNutricao.setcrn(crn);
			professorNutricao.setNome(nome);
			professorNutricao.setIdade(idade);
			professorNutricao.setGenero(genero);

			System.out.println(professorNutricao.toString());
			
			break;

			
		case 5:
			System.out.println("Digite a CREA do professor: ");
			crea = leitor.next();
			
		ProfessorEngenharia professorEngenharia = new ProfessorEngenharia();
			professorEngenharia.setId(id);
			professorEngenharia.setCrea(crea);
			professorEngenharia.setNome(nome);
			professorEngenharia.setIdade(idade);
			professorEngenharia.setGenero(genero);

			System.out.println(professorEngenharia.toString());
			
			
			break;



		default:
			System.out.println("Cargo selecionado inexistente!");
			break;
		}
		
		leitor.close();
	}

}
