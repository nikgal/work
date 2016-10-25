package by.galov.work;

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
}
