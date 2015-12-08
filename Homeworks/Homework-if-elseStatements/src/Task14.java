import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се състави програма, която по въведени координати на 2 позиции от
		// шахматната дъска извежда отговор дали са оцветени в еднакъв или
		// различен цвят.Шахматната дъска е квадратна. Въвеждат се две двойки
		// числа от интервала [1..8].
		// Пример: 2 2 3 2 Изход: Позициите са с различен цвят

		Scanner sc = new Scanner(System.in);
		int x1;
		int y1;
		int x2;
		int y2;
		int z1;
		int z2;

		do {
			System.out.println("Моля въведете X кординати за първата позиция ");
			x1 = sc.nextInt();
		} while (x1 < 1 || x1 > 8);
		do {
			System.out.println("Моля въведете Y кординати за първата позиция");
			y1 = sc.nextInt();
		} while (y1 < 1 || y1 > 8);
		do {
			System.out.println("Моля въведете X кординати за втората позиция ");
			x2 = sc.nextInt();
		} while (x2 < 1 || x2 > 8);
		do {
			System.out.println("Моля въведете Y кординати за втората позиция");
			y2 = sc.nextInt();
		} while (y2 < 1 || y2 > 8);
		if ((x1 % 2 == 1 && y1 % 2 == 1) || (x1 % 2 == 0 && y1 % 2 == 0)) {
			z1 = 1;
		} else {
			z1 = 0;
		}
		if ((x2 % 2 == 1 && y2 % 2 == 1) || (x2 % 2 == 0 && y2 % 2 == 0)) {
			z2 = 1;
		} else {
			z2 = 0;
		}

		System.out.println("Избраните кординати за първата позиция са " + x1 + "," + y1);
		System.out.println("Избраните кординати за втората позиция са " + x2 + "," + y2);
		if (z1 == z2) {
			System.out.println("Позициите са с еднакъв цвят.");
		} else {
			System.out.println("Позициите са с различен цвят.");
		}
	}

}
