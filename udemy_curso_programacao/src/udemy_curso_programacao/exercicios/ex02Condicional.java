package udemy_curso_programacao.exercicios;

import java.util.Scanner;

public class ex02Condicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero: ");
	
		int n1;
		
		n1 = sc.nextInt();
		
		
		if(n1%2 == 0) {
			System.out.println("PAR");
		} 
		else {
			System.out.println("IMPAR");
		}
	
		sc.close();

	}

}
