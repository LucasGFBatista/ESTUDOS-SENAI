package Aula0803;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int menuCargo, menuProfessor;
		int id, idade;
		String nome, generoStr;
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
		
		System.out.print("\nCargo do funcionario: \n1 - Coordenador \n2 - Secretária \n3 - Professor \nDigite uma opção: ");
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

		default:
			break;
		}
		
		
/*

		do {

			System.out.print(
					"\nCargo do funcionario: \n1 - Coordenador \n2 - Secretária \n3 - Professor \nDigite uma opção: ");
			menuCargo = leitor.nextInt();
		} while (menuCargo != 1 & menuCargo != 2 & menuCargo != 3);
		

		switch (menuCargo) {
		case 1:
			Coordenador coordenador = new Coordenador();

			System.out.print("\nDigite o ID do coordenador: ");
			id = leitor.nextInt();
			coordenador.setId(id);

			System.out.print("Digite o nome do coordenador: ");
			nome = leitor.next();
			coordenador.setNome(nome);

			System.out.print("Digite a idade do coordenador: ");
			idade = leitor.nextInt();
			coordenador.setIdade(idade);

			System.out.print("Digite o gênero do coordenador (M/F): ");
			generoStr = leitor.next();
			genero = generoStr.equals("M") ? Genero.MASCULINO : Genero.FEMININO;
			coordenador.setGenero(genero);

			System.out.println(coordenador.toString());

			break;
		case 2:
			Secretaria secretaria = new Secretaria();

			System.out.print("\nDigite o ID do secretaria: ");
			id = leitor.nextInt();
			secretaria.setId(id);

			System.out.print("Digite o nome do secretaria: ");
			nome = leitor.next();
			secretaria.setNome(nome);

			System.out.print("Digite a idade do secretaria: ");
			idade = leitor.nextInt();
			secretaria.setIdade(idade);

			System.out.print("Digite o gênero do secretaria (M/F): ");
			generoStr = leitor.next();
			genero = generoStr.equals("M") ? Genero.MASCULINO : Genero.FEMININO;
			secretaria.setGenero(genero);

			System.out.println(secretaria.toString());

			break;

		case 3:
			do {

				System.out.print(
						"\nArea de atuação do professor: \n1 - Professor de Direito \n2 - Professor de Nutrição \n3 - Professor de Engenharia \nDigite uma opção: ");
				menuProfessor = leitor.nextInt();
			} while (menuProfessor != 1 & menuProfessor != 2 & menuProfessor != 3);
			
			
			break;

		default:
			break;
		}
*/
		leitor.close();
	}

}
