package entities;

public class Employee {
	private String name;
	private Integer hours;
	private Double valuePerHour;
	
	public Employee() {
		
	}
	
	public Employee(String nameString, Integer hours, Double valuePerHour) {
		this.name = nameString;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public String getNameString() {
		return name;
	}

	public void setNameString(String nameString) {
		this.name = nameString;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public double payment() {
		return hours * valuePerHour;
	}
	
	
}
