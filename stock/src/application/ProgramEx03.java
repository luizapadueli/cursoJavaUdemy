package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Study;

public class ProgramEx03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Study study = new Study();
		
		System.out.print("Digite o nome do aluno e as tres notas: ");
		study.name = sc.nextLine();
		study.n1 = sc.nextDouble();
		study.n2 = sc.nextDouble();
		study.n3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + study.media());
		
		if (study.media() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", study.missingPoints());
			
		}
		else {
			System.out.println("PASS");
			
		}

	}

}
