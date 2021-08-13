package udemy_curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.print("Ola mundo!");
		System.out.println("Bom dia!");
		
		int y = 32;
		System.out.println(y);
		
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x); //numero formatado com duas casas depois da virgula
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x); //numero formatado com duas casas depois da virgula e com a configuracao de separador no formato americano
		
		System.out.println("RESULTADO = " + x + " METROS");
		
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}

}
