import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Да се състави програма, която чете от конзолата 2 естествени
		 * двуцифрени числа a,b. Програмата да изведе в конзолата дали
		 * последната цифра от произведението на двете числа е четна, както и
		 * самата цифра. Входни данни: a,b - естествени числа от интервала
		 * [10..99]. Пример: 15, 25 Изход: 375, 5 нечетна
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Моля въведете две цели двуцифрени числа");
		int a = sc.nextInt();
		int b = sc.nextInt();
		while (a < 10 || b < 10 || a > 99 || b > 99) {
			System.out.println("Моля въведете две двуцифрени числа");
			a = sc.nextInt();
			b = sc.nextInt();
		}
		int c = a * b;
		int lc = c % 10;

		System.out.println(c + "," + lc + (lc % 2 == 1 ? " нечетна" : " четна"));

		// if (lc % 2 == 1) {
		// System.out.println(c + "," + lc + " нечетна");
		// } else {
		// System.out.println(c + "," + lc + " четна");
		// }
		// Вариант, в който тренирам if-else statement-ите
		//

	}

}
