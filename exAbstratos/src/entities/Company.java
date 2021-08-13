package entities;

public class Company extends TaxPayer {
	private Integer nuberOfEmployees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, Integer nuberOfEmployees) {
		super(name, anualIncome);
		this.nuberOfEmployees = nuberOfEmployees;
	}
	
	public Integer getNuberOfEmployees() {
		return nuberOfEmployees;
	}

	public void setNuberOfEmployees(Integer nuberOfEmployees) {
		this.nuberOfEmployees = nuberOfEmployees;
	}

	@Override
	public double tax() {
		if (nuberOfEmployees > 10) {
			return getAnualIncome() * 0.14;					
		}
		else {
			return getAnualIncome() * 0.16;
		}
		
	}
	

}
