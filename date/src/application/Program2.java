package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program2 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d)); //imprimindo no horario do computador com base no UTC
		Calendar cal = Calendar.getInstance(); //inicializando o calendario 
		cal.setTime(d); //calendario com a data d instanciada 
		//saber quantos minutos tem na representação da data
		int minutes = cal.get(Calendar.MINUTE);	
		//saber qual o mes na representação da data
		int month = 1 + cal.get(Calendar.MONTH); //precisa adicionar 1 pois a contagem de meses começa com 0
				
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
	}
	

}
