package homework3;

public class Student extends Person {
	private double score;

	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		if (score >= 2 && score <= 6) {
			this.score = score;
		} else {
			this.isValid = false;
		}
	}

	public void showStudentInfo() {
		this.showPersonInfo();
		if (this.isValid) {
			System.out.println("Score: " + this.score);
		}
	}
}
