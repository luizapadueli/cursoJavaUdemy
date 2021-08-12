package udemy_curso_programacao.exercicios;

import java.util.Scanner;

public class ex01_ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois numeros inteiros");
		int x;
		x = sc.nextInt();
		int y;
		y = sc.nextInt();
		int soma=x+y;
		
		
		System.out.println("A soma é igual a: " + soma);
		
		sc.close();

	}

}
