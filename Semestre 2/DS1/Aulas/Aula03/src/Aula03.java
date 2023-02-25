
import java.util.Scanner;

public class Aula03 { 
	public static void main (String arg []) {
		
		Scanner leitor = new Scanner(System.in);
		
		Aluno aluno = new Aluno ();
		
		System.out.print("Digite o seu nome: ");
		
		aluno.setNome(leitor.nextLine());
		
		
		System.out.print("Digite a nota 1: ");
		aluno.setNota1(leitor.nextFloat());
		
		System.out.print("Digite a nota 2: ");
		aluno.setNota2(leitor.nextFloat());
		
		System.out.print("Digite a nota 3: ");
		aluno.setNota3(leitor.nextFloat());
		
		System.out.print("Digite a nota 4: ");
		aluno.setNota4(leitor.nextFloat());
		
		System.out.println("Nome: " + aluno.getNome());
		
		/*
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Sua média é: " + media);
		
		if (media >= 7) {
			
			System.out.println("Aprovado!");
			
		} else {

			System.out.println("Reprovado!");
		}
		*/
		
	}
}