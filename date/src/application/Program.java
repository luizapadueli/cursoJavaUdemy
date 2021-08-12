package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d)); //imprimindo no horario do computador com base no UTC
		Calendar cal = Calendar.getInstance(); //inicializando o calendario 
		cal.setTime(d); //calendario com a data d instanciada 
		cal.add(Calendar.HOUR_OF_DAY, 4); //adicionar unidade hora do dia, indicar quantas horas - 4 horas 
		d = cal.getTime();
		System.out.println(sdf.format(d));
	}
	

}
