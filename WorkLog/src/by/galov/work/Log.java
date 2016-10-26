package by.galov.work;

import java.util.Calendar;

public class Log {
	private Task currentTask;
	private Calendar currentDate;
	public Log(Task currentTask, Calendar currentDate){
		this.setCurrentTask(currentTask);
		this.setCurrentDate(currentDate);
	}
	public Log() {
		// TODO Auto-generated constructor stub
	}
	public Task getCurrentTask() {
		return currentTask;
	}
	public void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}
	public Calendar getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(Calendar currentDate) {
		this.currentDate = currentDate;
	}
}
