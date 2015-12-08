import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се състави програма, която по въведено естествено число N от
		// интервала [10..200] извежда в обратен ред всички числа, които са
		// кратни на 7 и са по-малки от N.

		Scanner sc = new Scanner(System.in);
		int n;
		boolean pyrwo = true;
		do {
			System.out.println("Въведете числото N от интервала [10..200]");
			n = sc.nextInt();
		} while (n < 10 || n > 200);

		for (int i = n; i >= 7; i--) {
			if (i % 7 == 0) {
				if (pyrwo) {
					System.out.print("");
					pyrwo = false;
				} else {
					System.out.print(",");
				}
				System.out.print("" + i);
			}
		}

	}

}
