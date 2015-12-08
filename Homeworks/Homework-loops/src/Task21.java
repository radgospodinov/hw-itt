import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Дадено е наредено тесте карти. Наредбата по тежест на карта е:
		// 2,3,4,5,6,7,8,9,10, Вале, Дама, Поп, Асо. Наредбата по цвят на
		// картите е: спатия, каро, купа, пика.
		// Да се създаде програма, чрез която се въвежда N - число от интервала
		// [1..51] и се извеждат въведения номер карта и останалите по-големи
		// карти от тестето.
		// Пример: 47. Изход: Поп купа, Поп пика, Асо спатия, Асо каро, Асо
		// купа, Асо пика

		// izvejdam chislo
		Scanner sc = new Scanner(System.in);
		int x;
		boolean purvo = true;

		do {
			System.out.println("Моля въведете число от интервала [1..51]");
			x = sc.nextInt();

		} while (x < 1 || x > 51);

		for (int n = 0; n <= 12; n++) {
			for (int c = 1; c <= 4; c++) {
				int rank = (n * 4 + c);
				if (rank >= x) {
					if (purvo) {
						System.out.print("");
						purvo = false;
					} else {
						System.out.print(", ");
					}
					if (n + 2 < 11) {
						System.out.print(n + 2);
					} else if (n + 2 == 11) {
						System.out.print("Вале");
					} else if (n + 2 == 12) {
						System.out.print("Дама");
					} else if (n + 2 == 13) {
						System.out.print("Поп");
					} else {
						System.out.print("Асо");
					}
					System.out.print(" ");
					switch (c) {
					case 1:
						System.out.print("Спатия");
						break;
					case 2:
						System.out.print("Каро");
						break;
					case 3:
						System.out.print("Купа");
						break;
					case 4:
						System.out.print("Пика");
						break;
					}
				}
			}

		}
	}
}
