package homework4;

public class AllWork {
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnsignedTask;
	private int currentAssignedTask;

	AllWork() {
		this.freePlacesForTasks = 10;
		this.currentUnsignedTask = 0;
		this.currentAssignedTask = 0;
		this.tasks = new Task[freePlacesForTasks];
	}

	void addTask(Task task) {
		if (freePlacesForTasks > 0) {
			this.tasks[this.currentUnsignedTask] = task;
			this.currentUnsignedTask++;
			this.freePlacesForTasks--;
		} else {
			System.out.println("There is no place for " + task.getName() + "!");
		}
	}

	Task getNextTask() {
		if (this.currentAssignedTask == this.currentUnsignedTask) {
			return null;
		}
		return this.tasks[this.currentAssignedTask++];
	}

	boolean isAllWorkDone() {
		for (int i = 0; i < this.currentUnsignedTask; i++) {
			if (tasks[i].getWorkingHours() > 0) {
				return false;
			}
		}
		return true;
	}

	boolean haveNextTaskToWork() {
		return currentAssignedTask != currentUnsignedTask;
	}

}
