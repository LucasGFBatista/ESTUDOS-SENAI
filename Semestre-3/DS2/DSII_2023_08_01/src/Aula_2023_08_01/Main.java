package Aula_2023_08_01;

public class Main {
	public static void main(String args[]) {
		Product produto = new Product();

		produto.setPrice(55.39);
		produto.setQuantity(3);
		System.out.println("Preço do produto: R$" + produto.getPrice());
		System.out.println("Quantidade inicial de produto: " + produto.getQuantity());

		produto.addProduct(5);
		System.out.println("\nQuantidade do produto após adição: " + produto.getQuantity());
		System.out.println("Valor total em estoque: R$" + produto.totalValueInStock());

		produto.removeProduct(2);
		System.out.println("\nQuantidade do produto após remoção: " + produto.getQuantity());
		System.out.println("Valor total em estoque: R$" + produto.totalValueInStock());

	}
}
