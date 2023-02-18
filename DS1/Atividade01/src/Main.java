import java.util.Scanner;

/*
 Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final  o mês.


Obs.: Implemente utilizando os conceitos de orientação a objetos abordados até a última aula.
- Abstração
- Atributos e métodos
- Visibilidade
- Construtores
- Métodos assessores

*/


public class Main{
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Vendedor vendedor = new Vendedor("Lucas",);
		
		System.out.println("Digite o nome do funcionario: " + );
		//vendedor.setNome(leitor.nextLine());
		
		System.out.println("Digite o sálario fixo: R$");
		//vendedor.setSalario(leitor.nextDouble());
		
		System.out.println("Digite o total de vendas no mês : R$");
		//vendedor.setTotalVendaMes(leitor.nextDouble());
		
	}
}