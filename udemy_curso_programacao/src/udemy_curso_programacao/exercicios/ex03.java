package udemy_curso_programacao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite quatro valores:");
		int a, b, c, d;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		int diferenca = a*b-c*d;		
		
		System.out.printf("Diferença: " + diferenca);
		
		sc.close();

	}

}
