import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Да се състави програма, която въвежда естествено число от интервала
		 * [0..24]. Програмата да изведе съответстващо съобщение съобразно
		 * въведения час. Периодите са: [18..4] - Добър вечер; [4..9] - Добро
		 * утро; [9..18] - Добър ден Пример: 10 Изход: Добър ден
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете час");
		int hr = sc.nextInt();

		while (hr < 0 || hr > 24) {
			System.out.println("Моля въведете час между 0-24");
			hr = sc.nextInt();
		}
		if (hr < 4 || hr >= 18) {
			System.out.println("Добър вечер");
		} else if (hr < 9) {
			System.out.println("Добро утро");
		} else
			System.out.println("Добър ден");

	}

}
