import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се състави програма, чрез която се въвеждат 2 естествени числа N,
		// M от интервала [10..5555].
		// Програмата, чрез цикъл for, да извежда всички числа от интервала,
		// които са кратни на 50 в низходящ ред.
		// Пример: 25,249 Изход: 200,150,100, 50.

		Scanner sc = new Scanner(System.in);

		int n;
		int m;
		boolean purvo = true;

		do {
			System.out.println("Въведете 2 естествени числа N, M от интервала [10..5555].");
			n = sc.nextInt();
			m = sc.nextInt();
		} while (n < 10 || n > 5555 || m < 10 || m > 5555 || n == m);
		if (n > m) {
			int sw = n;
			n = m;
			m = sw;
		}
		if (n < 50 && m < 50) {
			System.out.println("Няма числа кратни на 50 в този интервал");
		}
		for (int i = m; i >= n; i--) {
			if (i % 50 == 0) {
				if (purvo) {
					System.out.print("");
					purvo = false;
				} else {
					System.out.print(",");
				}
				System.out.print("" + i);
			}
		}

	}

}
