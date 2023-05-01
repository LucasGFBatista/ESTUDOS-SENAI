import java.util.Scanner;


public class Aula02 {
    
	public static void main (String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quao o seu nome inseto? ");
		
		String nome = leitor.nextLine();
		
		
		System.out.println("Digite a nota 1");
		float nota1 = leitor.nextFloat();
		
		System.out.println("Digite a nota 2");
		float nota2 = leitor.nextFloat();
		
		System.out.println("Digite a nota 3");
		float nota3 = leitor.nextFloat();
		
		System.out.println("Digite a nota 4");
		float nota4 = leitor.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Sua média é: " + media);
		
		
		if (media >= 7 ) {
			
			System.out.println("Aprovado");
		
			
		} else {
			System.out.println("Reprovado");
		}
		
					
		
	}
}