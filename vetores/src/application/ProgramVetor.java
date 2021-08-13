package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 

		Product[] vect = new Product[n]; 
		
		for (int i=0; i<vect.length; i++) { //trocar o n por vect.length para sempre olhar para o tamanho do vetor e nao a variavel criada
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price); //instanciar um novo produto (new) e o vect[i] vai apontar para um novo objeto
		}	
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice(); //do vetor vai pegar apenas o valor do price
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		
		
		sc.close();

	}

}
