package homework2;

public class StudentGroup {
	String groupSubject;
	Student[] students;
	int freePlaces;

	StudentGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}

	// метод,който добавя студент към групата ако специалността на студента
	// съвпада с тази на групата, и разбира се , ако има свободни места в
	// групата
	void addStudent(Student s) {
		if (freePlaces > 0) {
			for (int i = 0; i < this.students.length; i++) {
				if (this.students[i] == null && s.subject.equalsIgnoreCase(this.groupSubject)) {
					this.students[i] = s;
					freePlaces--;
					break;
				}
			}
		}
	}

	void emptyGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	String theBestStudent() {
		
		Student max = new Student();
		if (this.freePlaces < this.students.length) {
			for (int i = 0; i < this.students.length; i++) {
				if (this.students[i] == null) {
					break;
				}
				if (this.students[i].grade > max.grade || i == 0) {
					max.grade = this.students[i].grade;
					max.name = this.students[i].name;
				}
			}
			return max.name;
		} else {
			return "There's no students in group";
		}

	}

	void printStudentsInGroup() {
		for (int i = 0; i < this.students.length; i++) {
			if (this.students[i] != null) {
				System.out.println("Info for student " + (i + 1) + ": ");
				System.out.println(this.students[i].studentInfo());
			}
		}
	}

}
