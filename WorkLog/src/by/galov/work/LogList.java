package by.galov.work;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LogList {
	private static ArrayList<Log> logList = new ArrayList<>();
	public static void addLog(Log lg){
		logList.add(lg);
	}
	public static void showLog(){
		for(Log lg:logList){
			System.out.println(lg.getCurrentTask().getCurrentTool().getToolName());
			
		}
	}
	public static void fileLog(Log lg){
		try {
			FileWriter writer = new FileWriter("loglist.txt",true);
			writer.append(lg.getCurrentDate().getTime().toString());
			writer.append("\t"+lg.getCurrentTask().getTaskName());
			writer.append("\t"+lg.getCurrentTask().getCurrentEmployee().getName());
			writer.append("\n");

			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("err");
		}
	}
}
