package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Registros;

public class ProgramRooms {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Registros[] vect = new Registros[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt(); 
		
	
		for (int i=1; i<=n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();			
			vect[room] = new Registros(name, email);
		}
		
		System.out.println("Busy rooms: ");
		
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + " : " + vect[i]);
			}
		}
		

		
		
		sc.close();
		

	}

}
