package udemy_curso_programacao.exercicios;

import java.util.Scanner;

public class ex01For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i=0; i<=x; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
			
		}
		
		
		sc.close();

	}

}
