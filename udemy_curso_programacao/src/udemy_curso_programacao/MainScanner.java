package udemy_curso_programacao;

import java.util.Scanner;

public class MainScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //associado o scanner ao teclado no modo console
//		
//		String x;
//		x = sc.next(); //permitir que a palavra digitada seja salva na variavel x
//		
//		System.out.println("Voce digitou: " + x);
		
		int y;
		y = sc.nextInt(); //permitir que a palavra digitada seja salva na variavel x
		
		System.out.println("Voce digitou: " + y);
		
		
		sc.close();//finalizar o scanner

	}

}
