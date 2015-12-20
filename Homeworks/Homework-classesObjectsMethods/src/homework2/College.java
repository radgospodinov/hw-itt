package homework2;

public class College {
	public static void main(String[] args) {
		
//		// testove sus Student
//		   -name
//		   -subject
//		   -grade
//		   -yearInCollege
//		   -age
//		   -isDegree
//		   -money;
//		   - student(name,subject,age)
//		   - upYear
//		   - recieveScholarship
		Student ivan = new Student("Ivan","himiq", 22);
		Student pesho = new Student("Pesho","himiq",24);
		Student durt = new Student("Starec","psihologiq",33);
		ivan.upYear();
		ivan.upYear();
		ivan.upYear();
		pesho.money = pesho.recieveScholarship(3, 500);
		durt.money = durt.recieveScholarship(3, 4100);
		System.out.println(ivan.studentInfo());
		System.out.println(pesho.studentInfo());
		System.out.println(durt.studentInfo());
		
//		   
//		// testove sus StudentGroup
//		   -groupSubject
//		   -Students[]
//		   -freePlaces
//		   -studentgroup(subject)
//		   -addStudent
//		   -emptyGroup
//		   -theBestStudent
//		   -printStudentsInGroup
//		
//		
		StudentGroup himiq = new StudentGroup("himiq");
		himiq.addStudent(ivan);
		himiq.addStudent(pesho);
		himiq.addStudent(durt);
		System.out.println("Best student in group is: " + himiq.theBestStudent());
		himiq.printStudentsInGroup();
		himiq.emptyGroup();
		himiq.printStudentsInGroup();
				
		
	}

}
