package udemy_curso_programacao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex04For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		int N = sc.nextInt();
		
		
		for (int i=0; i<N; i++) {
			double v1 = sc.nextDouble();
			double v2 = sc.nextDouble();
			double v3 = sc.nextDouble();
			
			double media = (v1 * 2.0 + v2 * 3.0 + v3 * 5.0)/10.0;
			System.out.printf("%.1f%n",media);
		}
		
		
	
		sc.close();

	}

}
