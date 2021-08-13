package application;

import entities.Account;
import entities.BussinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.00);
		BussinessAccount bacc = new BussinessAccount(1002, "Maria", 0.0, 500.00);
		
		//UPCASTING - objeto da subclasse ser atribuido para a superclasse
		Account acc1 = bacc;
		Account acc2 = new BussinessAccount(1004, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
	

		//DOWNCASTING - objeto da superclasse ser atribuido para o objeto da subclasse
		
		BussinessAccount acc4 = (BussinessAccount)acc2;//fazer o downcasting para poder fazer as operações da classe bussiness, é feito indicando o business account antes da variavel que é account
		acc4.loan(100.0);
		
		//BussinessAccount acc5 = (BussinessAccount)acc3; //naopode associar um objeto da saving account na bussiness account 
		//maneira correta de verificar
		if (acc3 instanceof BussinessAccount) {
			BussinessAccount acc5 = (BussinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}
