import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		ArrayList<Funcionario> funcionarios = new ArrayList<>();

		while (true) {

			System.out.print("Digite o nome do funcionario: ");
			String nome = leitor.nextLine();

			if (nome.equalsIgnoreCase("fim")) {
				break;
			}

			System.out.print("Digite a idade do funcionario: ");
			int idade = leitor.nextInt();

			System.out.print("Digite o genero do funcionario: ");
			String genero = leitor.nextLine();

			if (genero.equals("f")) {
				Funcionario novoFuncionario = new Funcionario(nome, idade, Genero.FEMININO);
				funcionarios.add(novoFuncionario);
			} else {
				Funcionario novoFuncionario = new Funcionario(nome, idade, Genero.MASCULINO);
				funcionarios.add(novoFuncionario);
			}

			leitor.nextLine();

		}

		for (Funcionario I : funcionarios) {
			System.out.println("Nome: " + I.getNome());
			System.out.println("Idade: " + I.getIdade());
			System.out.println("Genero: " + I.getGenero());

		}

		leitor.close();
	}
}