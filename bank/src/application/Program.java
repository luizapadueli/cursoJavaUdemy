package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.print("Enter account number: ");
		int numero = sc.nextInt(); 
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char resposta = sc.next().charAt(0);
		
		
		
		if (resposta == 'y') {
			System.out.print("Enter initial deposit value: ");
			double saldoInicial = sc.nextDouble(); 
			conta = new Conta(numero, titular, saldoInicial);
		}
		else {
			conta = new Conta(numero, titular);
	
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		sc.close();
		
	}

}
