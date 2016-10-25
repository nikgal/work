package by.galov.work;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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
		File f = new File("loglist.txt");
		try {
			Scanner fscanner = new Scanner(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
