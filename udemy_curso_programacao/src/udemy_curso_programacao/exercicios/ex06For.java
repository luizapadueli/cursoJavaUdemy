package udemy_curso_programacao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex06For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		int N = sc.nextInt();
		
		
		for (int i=1; i<=N; i++) {
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
			
		
	
		sc.close();

	}

}
