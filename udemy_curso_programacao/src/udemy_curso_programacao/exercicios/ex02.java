package udemy_curso_programacao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o raio do circulo");
		double raio;
		raio = sc.nextDouble();
		double area = 3.14159 * Math.pow(raio, 2);		
		
		System.out.printf("A área do circulo é igual a: %.4f%n",area);
		
		sc.close();

	}

}
