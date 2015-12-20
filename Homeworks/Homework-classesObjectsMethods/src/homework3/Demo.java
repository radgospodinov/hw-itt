package homework3;

public class Demo {
	public static void main(String[] args) {

		Person[] city = new Person[10];

		Person ivan = new Person("Ivan", 22, true);
		Person ivanka = new Person("Ivanka", 33, false);

		Student joro = new Student("Joro", 17, true, 4.50);
		Student geri = new Student("Geri", 15, false, 5.50);

		Employee pencho = new Employee("Pencho", 28, true, 200);
		Employee penka = new Employee("Penka", 16, false, 100);

		city[0] = ivan;
		city[1] = ivanka;
		city[2] = joro;
		city[3] = geri;
		city[4] = pencho;
		city[5] = penka;

		for (int i = 0; i < city.length; i++) {
			if (city[i] == null) {
				continue;
			}
			if (city[i] instanceof Student) {
				((Student) city[i]).showStudentInfo();
			} else if (city[i] instanceof Employee) {
				((Employee) city[i]).showEmployeeInfo();
			} else if (city[i] instanceof Person) {
				city[i].showPersonInfo();
			}

			System.out.println("--------------------");
		}
        System.out.println(city[6].getName());
		for (int i = 0; i < city.length; i++) {

			if (!(city[i] instanceof Employee)) {
				continue;
			}
			Employee tmp = (Employee) city[i];
			System.out.println(tmp.getName() + " salary after overtime is " + tmp.calcOvertime(2));
		}

		// Отговор на въпросът:
		// Ще ми даде грешка ,че конструкторът не е дефиниран, защото не е
		// възможно да се създаде
		// default контруктор без параметри от клас Student.В супер класът
		// Person е създаден конструктор , който изисква входни данни и този
		// конструкор заемва функциите на default конструктора от клас Person.
		// Това може да се оправи ,като създадем default конструктор в клас
		// Person , който не изисква входни данни ИЛИ като
		// въведем ръчно входните данни във конструктора в клас Student.

		// Ако искаме да създадем default конструктор без да въвеждаме входни
		// данни:

		// Person() {
		//
		// }

		// Ако искаме да въведем наши си входни данни в default конструкторът за
		// клас Student:

		// Student() {
		// super("Ime",18,true);
		// this.score = score;
		// }

	}

}
