package udemy_curso_programacao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o numero do funcionario, numero de horas trabalhadas, valor recebido por hora:");
		int number, hour;
		double preco;
		
		
		number = sc.nextInt();
		hour = sc.nextInt();
		preco = sc.nextDouble();		
		double salario = hour*preco;
		
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();

	}

}
