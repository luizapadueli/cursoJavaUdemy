package udemy_curso_programacao.exercicios;

import java.util.Scanner;

public class ex04Condicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial do jogo: ");
	
		int hInicial = sc.nextInt();		
		
		System.out.println("Digite a hora final do jogo: ");
		
		int hFinal = sc.nextInt();
		
		int resultado;
		
		if(hInicial < hFinal) {
			resultado = hFinal - hInicial;
		} 
		else {
			resultado = 24 - hInicial + hFinal;
		}
		
		System.out.println("O jogo durou " + resultado + " hora(s)");
	
		sc.close();

	}

}
