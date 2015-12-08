import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се прочетат 2 числа от клавиатурата А и В. Да се изведат всички
		// числа от А до В на степен 2(разделени с запетая).Ако някое число е
		// кратно на 3, да се изведе съобщение че числото се пропуска „skip
		// 3“.Ако сумата от всички изведени числа (без пропуснатите) стане
		// по-голяма от 200, да се прекрати извеждането.

		// scanner 2 chisla

		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int sum = 0;
		boolean purvo = true;
		do {
			System.out.println("Моля въведете две различни положителни цели числа А и В");
			a = sc.nextInt();
			b = sc.nextInt();
		} while ((a < 0 && a > 199) || (b < 0 && b > 199) || (a == b));

		if (a > b) {
			int sw = a;
			a = b;
			b = sw;
		}
		for (int x = a; x <= b; x++) {
			if (purvo) {
				purvo = false;
			} else {
				System.out.print(",");
			}
			if (x % 3 == 0) {
				System.out.print("Skip " + "'" + x + "'");
			} else {
				System.out.print(x * x);

				sum = sum + x * x;
				if (sum > 200) {
					System.out.println();
					System.out.println("Прекъсваме изаждането на числа, защото сумата " + sum + " е по-голяма от 200");
					break;
				}
			}

		}
		// Понеже не ми беше ясно условието , тук печатаме всички квадрати между
		// А и В
		sum = 0;
		purvo = true;
		int x = 1;
		int n;
		do {
			n = x * x;
			if (n > a && n < b) {
				if (purvo) {
					purvo = false;
				} else {
					System.out.print(",");
				}
				if (x % 3 == 0) {
					System.out.print("Skip " + "'" + n + "'");
				} else {
					System.out.print(n);

					sum = sum + n;
					if (sum > 200) {
						System.out.println();
						System.out.println(
								"Прекъсваме изаждането на числа, защото сумата " + sum + " е по-голяма от 200");
						break;
					}
				}

			}
			x++;

		} while (n < b);

	}

}
