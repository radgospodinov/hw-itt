import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се състави програма, чрез която по въведено естествено число от
		// интервала [10..99] се извежда поредица числа, при спазване на
		// следните изисквания: 1) ако предходното число е четно се извежда
		// 0.5*числото; 2) ако предходното число е нечетно се извежда 3*числото
		// +1. Извеждането продължава докато не се получи стойност 1.
		// Пример: 11 Изход: 34 17 52 26 13 40 20 10 5 16 8 4 2 1

		Scanner sc = new Scanner(System.in);
		int x;
		do {
			System.out.println("Въведете естествено число от интервала [10..99]");
			x = sc.nextInt();
		} while (x < 10 || x > 99);
		while (x > 1) {

			if (x % 2 == 0) {
				x = x / 2;
				System.out.print(x + " ");
			} else {
				x = x * 3 + 1;
				System.out.print(x + " ");
			}
		}

	}

}
