package udemy_curso_programacao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o codigo da peça 1, o numero de peças e o valor unitario da peça 1:");
		int cod1, numero1;
		double valor1;
		
		
		cod1 = sc.nextInt();
		numero1 = sc.nextInt();
		valor1 = sc.nextDouble();		
		
		System.out.println("Digite o codigo da peça 2, o numero de peças e o valor unitario da peça 2:");
		int cod2 = sc.nextInt(), numero2;
		double valor2;
		
		
		numero2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		double conta = (numero1*valor1)+(numero2*valor2);
		
		System.out.printf("Valor a pagar: R$ %.2f%n", conta);
		
		sc.close();

	}

}
