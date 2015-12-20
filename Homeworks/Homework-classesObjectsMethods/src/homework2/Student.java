package homework2;

public class Student {
	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;

	Student() {
		grade = 4.0;
		yearInCollege = 1;
		isDegree = false;
		money = 0;
	}

	Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}

	void upYear() {
		if (!isDegree) {
			yearInCollege++;
		}
		if (yearInCollege == 4) {
			isDegree = true;
		}
	}

	double recieveScholarship(double min, double amount) {
		if (this.grade >= min && this.age < 30 && !isDegree) {
			return money + amount;
		}
		return money;
	}
	void improvedScholarship(double min,double amount) {
		if (this.grade >= min && this.age < 30 && !isDegree) {
		    this.money+=amount;
		}
	}
	

	String studentInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + this.name + "\n");
		sb.append("Age: " + this.age + "\n");
		sb.append("Subject: " + this.subject + "\n");
		sb.append("Grade: " + this.grade + "\n");
		sb.append("Year of college: " + this.yearInCollege + "\n");
		sb.append("Has degree? : " + this.isDegree + "\n");
		sb.append("Student's money: " + this.money + "\n");

		return sb.toString();
	}

}
