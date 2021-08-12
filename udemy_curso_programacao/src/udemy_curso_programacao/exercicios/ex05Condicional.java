package udemy_curso_programacao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex05Condicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o codigo do item: ");
	
		int cod = sc.nextInt();		
		
		System.out.println("Digite a quantidade: ");
		
		int qtde = sc.nextInt();
		
		double resultado;
		
		if(cod == 1) {
			resultado = qtde * 4.00;
		} 
		else if (cod == 2) {
			resultado = qtde * 4.50;
		}
		else if (cod == 3) {
			resultado = qtde * 5.00;
		}
		else if (cod == 4) {
			resultado = qtde * 2.00;
		}
		else {
			resultado = qtde * 1.50;
		}
		
		Locale.setDefault(Locale.US);
		System.out.printf("Total: R$ %.2f%n", resultado);
	
		sc.close();

	}

}
