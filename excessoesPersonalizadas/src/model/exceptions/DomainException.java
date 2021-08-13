package model.exceptions;

public class DomainException extends Exception {
	private static final long serialVersionUID = 1L;
	
	//construtor que recebe uma string como argumento
	
	public DomainException(String msg) {
		//repassar a mensagem para o construtor da superclasse
		super(msg);
	}
	

}
