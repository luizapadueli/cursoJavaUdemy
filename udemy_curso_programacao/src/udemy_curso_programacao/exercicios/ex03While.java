package udemy_curso_programacao.exercicios;

import java.util.Scanner;

public class ex03While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o codigo do produto: ");
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int cod = sc.nextInt();		
		
		while (cod != 4) {
			if (cod == 1) {
				alcool = alcool + 1;				
			}
			else if (cod == 2) {
				gasolina = gasolina + 1;
			}
			else if (cod == 3) {
				diesel = diesel + 1;
			}
			
			cod = sc.nextInt();
			
		}
		

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
				
		sc.close();
	}

}
