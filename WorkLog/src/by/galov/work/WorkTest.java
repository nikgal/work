package by.galov.work;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class WorkTest {

	public static void main(String[] args) {
		Employee currentEmployee = new Employee("Nick");
		Tool currentTool = new Tool("hammer");
		Material currentMaterial = new Material("nail");
		Task currentTask = new Task(currentEmployee,currentMaterial,currentTool,
				10,"hammer a nail");
		Calendar c = new GregorianCalendar(2016,10,25);
		Log currentLog = new Log(currentTask,c);
		
		LogList.addLog(currentLog);
		LogList.addLog(currentLog);

		LogList.showLog();
	}

}
