import java.util.Scanner;

/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    BusinessAccount pf = new BusinessAccount(); //
    
    System.out.println("Por favor, insira alguns dados para completar o cadastro da conta bancaria.");
    System.out.println("Nome do cliente: ");
    pf.holder = sc.nextLine();
    
    System.out.println("Numero da conta: ");
    pf.number = sc.nextInt();
    
    System.out.println("Saldo inicial: ");
    pf.balance = sc.nextDouble();
    
    System.out.println(pf.toString());
    
    
    }
}
