package utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
public static String DateTime () {
		
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy"+" - "+"HH:mm:ss");
		String time = current.format(pattern);
		return time;
		
	}


}
