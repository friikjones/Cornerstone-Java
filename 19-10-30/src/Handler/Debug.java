package Handler;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Debug {

	public static void log(String message) {
		Console.println("[" + getDateTImeString() + "] - " + message);
	}

	public static void logInfo(String message) {
		Console.println("[" + getDateTImeString() + "] - [INFO] - " + message);
	}

	public static void logWarning(String message) {
		Console.println("[" + getDateTImeString() + "] - [WARN] - " + message);
	}

	public static void logException(String message) {
		Console.println("[" + getDateTImeString() + "] - [EXCEPTION] - " + message);
	}
	public static String getDateTImeString() {
		SimpleDateFormat formatter= new SimpleDateFormat("yyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		return formatter.format(date);
	}
	
}
