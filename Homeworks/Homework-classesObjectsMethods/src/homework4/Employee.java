package homework4;

public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeft;
	private boolean isValid;
	private AllWork allwork;

	Employee(String name) {
		if (name.length() > 0) {
			boolean isLetter = true;
			for (int i = 0; i < name.length(); i++) {
				if (!(Character.isAlphabetic(name.charAt(i)) || Character.isSpaceChar(name.charAt(i)))) {
					isLetter = false;
					break;
				}
			}
			if (isLetter) {
				this.name = name;
				this.isValid = true;
				this.hoursLeft = 8;
			}
		} else {
			// единственото решение ,което ми се струва удачно , ако се подаде
			// грешно име 2 или повече пъти
			this.isValid = false;
		}

	}

	void setAllWork(AllWork allwork) {
		this.allwork = allwork;
	}

	void work() {
		if (this.isValid) {
			if (this.currentTask == null) {
				if (allwork.haveNextTaskToWork()) {
					this.currentTask = allwork.getNextTask();
					System.out.println(
							"Employee " + this.name + " get next available task: " + this.currentTask.getName());
				} else {
					System.out.println("Employee " + this.name + " has no more work to do.");
					return;
				}

			}
			int workingHours = this.hoursLeft;
			if (workingHours > this.currentTask.getWorkingHours()) {
				workingHours = this.currentTask.getWorkingHours();
			}

			System.out.println("Employee " + this.name + " is working for " + workingHours + " hours on task "
					+ this.currentTask.getName());
			if (this.currentTask.getWorkingHours() > this.hoursLeft) {
				this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
				this.hoursLeft = 0;

			} else if (this.hoursLeft > this.currentTask.getWorkingHours()) {
				this.hoursLeft -= this.currentTask.getWorkingHours();
				this.currentTask.setWorkingHours(0);
				this.currentTask = null;
				this.work();

			} else {
				this.hoursLeft = 0;
				this.currentTask.setWorkingHours(0);
				this.currentTask = null;
			}

		} else {
			System.out.println("Invalid employee! Theres no work to do!");
		}

	}

	void startWorkingDay() {
		System.out.println("New day has started for employee: " + this.name);
		this.hoursLeft = 8;
		if (this.currentTask == null) {
			if (allwork.haveNextTaskToWork()) {
				this.currentTask = allwork.getNextTask();
				System.out.println("Employee " + this.name + " get next available task: " + this.currentTask.getName());
			} 
			// work метода ще каже ако няма работа повече за вършене.
		}
		
	}

	void setCurrentTask(Task task) {
		if (task.getIsValid())
			this.currentTask = task;
	}

	void setHoursLeft(int hoursLeft) {
		if (this.isValid && hoursLeft > 0) {
			this.hoursLeft = hoursLeft;
		} else {
			this.isValid = false;
			this.hoursLeft = 0;
		}

	}

	void showReport() {
		if (this.isValid) {
			System.out.println("Name of employee: " + this.name);
			System.out.println(
					"Name of task: " + (this.currentTask == null ? "No current task set" : this.currentTask.getName()));
			System.out.println("Working hours left for the employee " + this.hoursLeft);
			System.out.println("Working hours left for the task: "
					+ (this.currentTask == null ? "No current task set!" : this.currentTask.getWorkingHours()));
		} else {
			System.out.println("Invalid employee! There are no name,task,working hours set!");
		}
	}
}
