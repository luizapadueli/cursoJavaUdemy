package entities;

public class Conta {
	
	private int numero;
	private String titular;
	private double saldo;
	
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public Conta(int numero, String titular, double saldoInicial) {
		this.numero = numero;
		this.titular = titular;
		deposito(saldoInicial);
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo = saldo + valor;
	}
	
	public void saque(double valor) {
		double taxa = 5.00;
		saldo = saldo - valor - taxa;
	}
	
	public String toString() {
		return "Account "
				+ numero
				+ ", Tutular: "
				+ titular
				+ ", Saldo: $ "
				+ String.format("%.2f", saldo);
				
	}

	
}
