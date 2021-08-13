package udemy_curso_programacao.exercicios;

import java.util.Scanner;

public class ex02While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 valores: ");
		
		double x = sc.nextDouble();		
		double y = sc.nextDouble();	
		
		while (x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("primeiro");
				break;
			} 
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
				break;
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
				break;
			}
			else {
				System.out.println("quarto");
				break;
			}
			
		}
		
		
		sc.close();
	}

}
