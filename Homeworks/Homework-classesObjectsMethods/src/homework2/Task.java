package homework2;

public class Task {
	private String name;
	private int workingHours;
	private boolean isValid;

	Task(String name, int workingHours) {
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
			// единственото решение ,което ми се струва удачно , ако се подаде грешно име  2 или повече пъти
			isValid = false;
		}
		if (workingHours > 0) {
			this.workingHours = workingHours;
		} else {
			this.workingHours = 0;
		}
	}
    boolean getIsValid() {
    	return this.isValid;
    }
	String getName() {
		return this.name;
	}

	int getWorkingHours() {
		return this.workingHours;
	}

	void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

}
