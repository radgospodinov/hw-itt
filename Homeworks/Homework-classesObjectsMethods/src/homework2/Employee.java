package homework2;

public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeft;
	private boolean isValid;
	

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
			}
		} else {
			// единственото решение ,което ми се струва удачно , ако се подаде
			// грешно име 2 или повече пъти
			this.isValid = false;
		}

	}

	void work() {
		if (this.isValid) {
			if (this.currentTask != null) {
				if (this.currentTask.getWorkingHours() > this.hoursLeft) {
					this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
					this.hoursLeft = 0;
				} else if (this.hoursLeft > this.currentTask.getWorkingHours()) {
					this.hoursLeft -= this.currentTask.getWorkingHours();
					this.currentTask.setWorkingHours(0);
				} else {
					this.hoursLeft = 0;
					this.currentTask.setWorkingHours(0);
				}

			} else {
				System.out.println("There is no assigned task to this employee");
			}
		} else {
			System.out.println("Invalid employee or task! Theres no work to do!");
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
