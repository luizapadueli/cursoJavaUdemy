package udemy_curso_programacao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex07For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		int N = sc.nextInt();
		
		int fatorial = 1;
		
		
		for (int i=1; i<=N; i++) {
			if (N%i == 0) {
				System.out.println(i);
			}
			
		}
			
		
	
		sc.close();

	}

}
