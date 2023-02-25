/*
 Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final  o mês.


Obs.: Implemente utilizando os conceitos de orientação a objetos abordados até a última aula.
- Abstração
- Atributos e métodos
- Visibilidade
- Construtores
- Métodos assessores
	
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
        Scanner leitor = new Scanner(System.in);
        
        ArrayList<Vendedor> vendedores = new ArrayList<>();
        
        while (true) {
        	
            System.out.print("Digite o nome do funcionario (ou digite \"fim\" para sair): ");
            String nome = leitor.nextLine();
			
			if(nome.equalsIgnoreCase("fim")) {
				break;
			}
			
		    System.out.print("Digite o sálario fixo: R$" );
		    double salario = leitor.nextDouble();

		    System.out.print("Digite o total de vendas no mês : R$");
		    double totalVendas = leitor.nextDouble();
		    
		    leitor.nextLine();
		    
		    Vendedor novoVendedor = new Vendedor(nome, salario, totalVendas);
		    vendedores.add(novoVendedor);
			
		}

        for (Vendedor v : vendedores) {
            System.out.println("\nVendedor: " + v.getNome());
            System.out.println("Salário fixo: R$" + v.getSalario());
            System.out.println("Total de vendas do mês: R$" + v.getTotalVendaMes());
            System.out.println("Salário com comissão: R$" + v.salarioComissionado(v.getSalario(), v.getTotalVendaMes()));
        }
        
        leitor.close();
	}
}