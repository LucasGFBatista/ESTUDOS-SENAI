package aplicacao;

import java.util.Scanner;

import entidade.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Product produto = new Product();

		System.out.println("Informe os Dados do produto");
		System.out.print("Nome: ");
		produto.name = sc.nextLine();

		System.out.print("Preco: R$ ");
		produto.price = sc.nextDouble();

		System.out.print("Quantidade: ");
		produto.quantity = sc.nextInt();
		
		
		System.out.println(produto.toString());

		System.out.print("Adicione produto ao estoque: ");
		int quantity = sc.nextInt();
		produto.addProducts(quantity);
		
		System.out.println(produto.toString());
		
		
	}

}
