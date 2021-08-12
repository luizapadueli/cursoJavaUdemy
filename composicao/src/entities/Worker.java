package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	
	
	//como trabalhador tem varios contratos vamos representar com uma lista
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
		
	}
	//construtor gerado sem os itens que são lista, lista foi instaciada (new)
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getLevel() {
		return level;
	}
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<HourContract> getContracts() {
		return contracts;
	}
	
	
	//adicionar na lista o contrato que veio como argumento
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	//remover o contrato informado da lista
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	//calcular quanto a pessoa ganhou baseado no mes e no ano informado
	public double income(int year, int month) {
		double sum = baseSalary;
		//chamando a classe calendario para utilizar no retorno do valor 
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contracts) {
			//settar a data do contrato no calendario
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
	
	
	

}
