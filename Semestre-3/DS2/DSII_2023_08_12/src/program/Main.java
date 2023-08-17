package program;

import java.util.Scanner;
import entities.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*
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
*/
		Account acc = new Account(1001, "Lucas", 0.0);
		BusinessAccount bcc = new BusinessAccount(1002,"Ceci", 0.0, 500.0);
		
		//UPCAST
		Account acc1 = bcc;
		Account acc2 = new BusinessAccount(1003, "Ana", 0.0, 200.0);
		Account acc3 = new SavingAccount(1004, "Pedro", 0.0,0.1);
		
		
		System.out.println(acc.toString());
		System.out.println(bcc.toString());
		System.out.println(acc1.toString());
		System.out.println(acc2.toString());
		System.out.println(acc3.toString());
		
	}
}
