import java.util.Scanner;

public class Task18 {
	public static void main(String[] args) {
		// Да се състави програма, чрез която се въвежда две числа от интервала
		// [1..9].
		// Програмата да извежда таблицата за умножение. Максималната стойност
		// на множителите е определена от 2-те числа.

		// Пример : 2 2
		//
		// Изход: 1*1= 1;
		// 1*2= 2;
		// 2*1= 2;
		// 2*2= 4;

		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		do {
			System.out.println("Въведете две числа от интервала [1..9]");
			a = sc.nextInt();
			b = sc.nextInt();
		} while (a < 1 || b < 1 || a > 9 || b > 9);

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				System.out.println("" + i + "*" + j + "= " + (i * j) + ";");
			}
		}

	}
}
