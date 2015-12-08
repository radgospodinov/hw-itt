import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// По зададено число n, да се изведе на екрана таблица по следния начин:
		// n=1 n=2 n=3 n=4
		//
		// 0 11 222 3333
		//
		// 33 444 5555
		//
		// 666 7777
		//
		// 9999

		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Моля въведете цяло и положително число");
			n = sc.nextInt();
		} while (n <= 0);
		int digit = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(digit % 10);
			}
			digit += 2;
			System.out.println();
		}

	}

}
