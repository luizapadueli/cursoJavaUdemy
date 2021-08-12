package udemy_curso_programacao.exercicios;

import java.util.Scanner;

public class ex01Condicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
	
		int numero;
		
		numero = sc.nextInt();
		
		if(numero >= 0) {
			System.out.println("Numero positivo");
		} 
		else {
			System.out.println("Numero negativo");
		}
	
		sc.close();

	}

}
