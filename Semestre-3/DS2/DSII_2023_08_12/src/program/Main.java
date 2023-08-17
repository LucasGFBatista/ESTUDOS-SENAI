package program;

import java.util.Scanner;
import entities.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, insira alguns dados para completar o cadastro da conta bancaria.");
		System.out.print("Nome do cliente: ");
		String holder = sc.nextLine();

		System.out.print("Numero da conta: ");
		int number = sc.nextInt();

		System.out.print("Saldo inicial: ");
		double balance = sc.nextDouble();

		System.out.print("Limite de emprestim: ");
		double loanLimit = sc.nextDouble();

		sc.close();

		BusinessAccount pf = new BusinessAccount(number, holder, balance, loanLimit);

		System.out.print(pf.toString());

	}
}
