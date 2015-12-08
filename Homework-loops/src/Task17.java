import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число за размер");
		int n = sc.nextInt();
		System.out.println("Въведете символ за пълнеж");
		char ch = sc.next().charAt(0);

		for (int i = 0; i < n; i++) {
			if (i == 0 || i == n - 1) {
				for (int c = 0; c < n; c++) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
				for (int c = 0; c < n - 2; c++) {
					System.out.print(ch);
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
