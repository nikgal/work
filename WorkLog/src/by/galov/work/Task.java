package by.galov.work;

public class Task {
	private String taskName;
	private Employee currentEmployee;
	private Material currentMaterial;
	private Tool currentTool;
	private int labourContent;
	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Task(Employee currentEmployee, Material currentMaterial, Tool currentTool, 
			int labourContent, String taskName) {
		this.currentEmployee=currentEmployee;
		this.currentMaterial=currentMaterial;
		this.currentTool=currentTool;
		this.labourContent=labourContent;
		this.taskName=taskName;
	}

	public Employee getCurrentEmployee() {
		return currentEmployee;
	}

	public void setCurrentEmployee(Employee currentEmployee) {
		this.currentEmployee = currentEmployee;
	}

	public Material getCurrentMaterial() {
		return currentMaterial;
	}

	public void setCurrentMaterial(Material currentMaterial) {
		this.currentMaterial = currentMaterial;
	}

	public Tool getCurrentTool() {
		return currentTool;
	}

	public void setCurrentTool(Tool currentTool) {
		this.currentTool = currentTool;
	}

	public int getLabourContent() {
		return labourContent;
	}

	public void setLabourContent(int labourContent) {
		this.labourContent = labourContent;
	}
}
