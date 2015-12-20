package homework2;

public class DemoTaskEmployee {

	public static void main(String[] args) {

		Employee ivan = new Employee("Ivan Petrov");
		Employee pesho = new Employee("Petyr Ivanov");
		Employee error = new Employee("Error 4e");
		Employee error2 = new Employee("Error");
		Employee test = new Employee("error test");

		Task kopane = new Task("Kopane", 8);
		Task prane = new Task("Prane", 4);
		Task greshka = new Task("Leko gre6ka", 70);
		Task taskTest = new Task("Task error test", 10);
        
		ivan.setHoursLeft(4);
		ivan.setCurrentTask(kopane);
		ivan.work();
		ivan.showReport();
		pesho.setHoursLeft(7);
		pesho.setCurrentTask(prane);
		pesho.work();
		pesho.showReport();

		System.out.println("====== Day 2 ======");
		ivan.setHoursLeft(7);
		ivan.work();
		ivan.showReport();

		System.out.println();
		System.out.println("Test of errors");
        error.setHoursLeft(3);
		error.showReport();
		error.setCurrentTask(taskTest);
		System.out.println();
		error.work();
		System.out.println();
		error.showReport();

		System.out.println("---------");
		error2.setHoursLeft(0);
		error2.setCurrentTask(taskTest);
		error2.work();
		error2.showReport();

		System.out.println("----------");
		test.setHoursLeft(10);
		test.setCurrentTask(greshka);
		test.work();
		test.showReport();
		test.setCurrentTask(taskTest);
		test.work();
		test.showReport();

	}

}
