package homework3;

public class Employee extends Person {
	private static double overtimeCoef = 1.5;
	private int daySalary;

	public Employee(String name, int age, boolean isMale, int daySalary) {
		super(name, age, isMale);
		if (daySalary > 0) {
			this.daySalary = daySalary;
		} else {
			this.daySalary = 0;
		}
		
	}

	double calcOvertime(double hours) {
		if (this.getAge() < 18) {
			return (double) daySalary;
		} else {
			return daySalary + hours * overtimeCoef;
		}
	}

	public void showEmployeeInfo() {
		this.showPersonInfo();
		if (this.isValid) {
			System.out.println("Day salary = " + this.daySalary);
		}
	}

}
