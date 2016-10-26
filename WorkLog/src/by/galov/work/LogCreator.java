package by.galov.work;

import java.util.Calendar;

public class LogCreator {
	private static Calendar date;
	public static Log createLog(){
		Log lg = new Log();
		System.out.println("Enter date");
		lg.setCurrentDate(date);
		return lg;
	}
}
