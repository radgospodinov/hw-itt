import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Въведете число N чрез конзолата и изкарайте като резултат следния
		// триъгълник с височина N:
		// Кaто допълнително упражнение – нарисувайте същия триъгълник, но
		// незапълнен.

		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.println("Въведете стойност за височината на желания триъгълник");
			n = sc.nextInt();
		} while (n < 1);
		for (int i = 1; i <= n; i++) {
			for (int c = 0; c < n - i; c++) {
				System.out.print(" ");
			}
			for (int c = 0; c < 2 * i - 1; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// Незапълненият триъгълник
		for (int i = 1; i <= n; i++) {
			for (int c = 0; c < n - i; c++) {
				System.out.print(" ");
			}
			if (i == 1 || i == n) {
				for (int c = 0; c < 2 * i - 1; c++) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
				for (int c = 0; c < 2 * i - 3; c++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}

			System.out.println();
		}
	}
}