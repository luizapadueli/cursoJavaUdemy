package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		//tratar a exceção no construtor = programação defensiva
		Date now = new Date();
		if (!checkOut.after(checkIn)) {
			//instanciar uma exceção
			throw new DomainException("Check-out date must be after check-in date");	
		}
		if (checkIn.before(now) || checkOut.before(now)) {
			//instanciar uma exceção
			throw new DomainException("Reservation dates for update must be future dates");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	//duration vai retornar um inteiro do tipo long pq sera calculado em milissegundos
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		// converter de milissegundos para dias
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	//metodo vai lançar a exceção criada DomainException
	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		
		//datas de atualização nao podem ser anteriores a data atual
		Date now = new Date(); //isntanciando a variavel com a data atual
		if (checkIn.before(now) || checkOut.before(now)) {
			//instanciar uma exceção
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if (!checkOut.after(checkIn)) {
			//instanciar uma exceção
			throw new DomainException("Check-out date must be after check-in date");	
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
	}

	@Override
	public String toString() {
		return "Room " 
				+ roomNumber 
				+ ", check-in: " 
				+ sdf.format(checkIn)
				+ ", checkOut: " 
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nights";
	}

}
