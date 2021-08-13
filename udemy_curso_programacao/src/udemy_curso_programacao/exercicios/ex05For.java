package udemy_curso_programacao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex05For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		int N = sc.nextInt();
		
		int fatorial = 1;
		
		
		for (int i=1; i<=N; i++) {
			fatorial = fatorial * i;
			
		}
		
		System.out.println(fatorial);
		
		
	
		sc.close();

	}

}
