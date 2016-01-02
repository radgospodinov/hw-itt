package homework4;

public class WorkingDemo {

	public static void main(String[] args) {
		AllWork work = new AllWork();

		work.addTask(new Task("brane", 15));
		work.addTask(new Task("kopane", 22));
		work.addTask(new Task("prane", 7));
		work.addTask(new Task("programirane", 8));
		work.addTask(new Task("pechatane", 13));
		work.addTask(new Task("chistene", 17));
		work.addTask(new Task("masterirane", 21));
		work.addTask(new Task("oshte programirane", 12));
		work.addTask(new Task("oshte kopane", 15));
		work.addTask(new Task("oshte mastering", 10));

		Employee[] bachkatori = { new Employee("pesho"), new Employee("gosho"), new Employee("tosho"),
				new Employee("ivan") };
		for(int i = 0;i<bachkatori.length;i++) {
			bachkatori[i].setAllWork(work);
		}

		while (!work.isAllWorkDone()) {
			for (int i = 0; i < bachkatori.length; i++) {
				bachkatori[i].startWorkingDay();
				System.out.println("-----------------------");
			}
			for (int i = 0; i < bachkatori.length; i++) {
				bachkatori[i].work();
				System.out.println("---------------------------");
			}
				
			System.out.println("==========================================");
		}

	}

}
