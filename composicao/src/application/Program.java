package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//importar formatação da data
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();
		
		//intanciar o trabalhador, novo objeto do tipo worker
		// nome do trabalhador, indicar tipo enumerado.valueOf, indicar o salario base, instanciar um departamento recebendo o nome como argumento
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Enter contract #" + i + " data: ");	
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			//criando o objeto de cada contrato informado 
			HourContract contrac = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contrac);						
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		//recortando apenas da posição 0 a 2 para pegar o valor do mes 
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		//recortando a partit da posição 3 para pegar o valor do ano
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.print("Name: " + worker.getName());
		System.out.println();
		System.out.print("Department: " + worker.getDepartment().getName());
		System.out.println();
		System.out.print("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
		

	}

}
