import java.util.Scanner;

//import java.util.Scanner;

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

        System.out.print("Digite o nome do funcionario: ");
        String nome = leitor.nextLine();

        System.out.print("Digite o sálario fixo: R$" );
        double salario = leitor.nextDouble();

        System.out.print("Digite o total de vendas no mês : R$");
        double totalVendas = leitor.nextDouble();

        Vendedor Lucas = new Vendedor(nome, salario, totalVendas);
		
		
		System.out.println("\nVendedor: "  + Lucas.getNome());
		System.out.println("Sálario vendedor: "  + Lucas.getSalario());
		System.out.println("Total de venda do mês: "   + Lucas.getTotalVendaMes());
		System.out.println("Salario com comissão: R$" + Lucas.salarioComissionado(Lucas.getSalario(), Lucas.getTotalVendaMes()));
	}
}