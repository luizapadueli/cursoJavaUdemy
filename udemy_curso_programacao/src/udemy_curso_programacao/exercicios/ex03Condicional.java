package udemy_curso_programacao.exercicios;

import java.util.Scanner;

public class ex03Condicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
	
		int n1;
		
		n1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		
		int n2;
		
		n2 = sc.nextInt();
		
		if(n1%n2 == 0 || n2%n1 == 0) {
			System.out.println("São Multiplos");
		} 
		else {
			System.out.println("Não são Multiplos");
		}
	
		sc.close();

	}

}
