package udemy_curso_programacao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite três valores: ");
	
		double a, b, c;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		double atriangulo = (a*c)/2;
		double acirculo = 3.14159 * Math.pow(c, 2);
		double atrapezio = (a+b)/2*c;
		double aquadrado = Math.pow(b, 2);
		double aretangulo = a*b;
		
		System.out.printf("Triangulo: %.3f%n", atriangulo);
		System.out.printf("Circulo: %.3f%n", acirculo);
		System.out.printf("Trapezio: %.3f%n", atrapezio);
		System.out.printf("Quadrado: %.3f%n", aquadrado);
		System.out.printf("Retangulo: %.3f%n", aretangulo);
		
		sc.close();

	}

}
