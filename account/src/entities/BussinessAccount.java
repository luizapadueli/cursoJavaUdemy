package entities;

//a classe bussiness herda todos os dados e comportamentos da classe account 
public class BussinessAccount extends Account{

	private Double loanLimit;
	
	public BussinessAccount() {
		super(); //traz a logica criada na classe padrao do account se houver
	}

	public BussinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); //construtor da super classe account
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	//trazendo a referencia de atributo da classe account e alterando o status do balance para protected
	public void loan(double amount) {
		if (amount <= loanLimit) {			
			balance += amount - 10.0;
		}
		
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
	
}
