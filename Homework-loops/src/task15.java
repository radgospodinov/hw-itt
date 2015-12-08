import java.util.Scanner;

/////////////// ne e gotova
public class task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се състави програма, която да изчисли сумата на всички числа от 1
		// до въведено число N. Използвайте цикъл do-while.

		Scanner sc = new Scanner(System.in);

		System.out.println("Моля въведете число");
		int x = sc.nextInt();
		int sum = 0;
		int a = 1;

		if (x > 0) {
			do {
				sum = sum + a;
				a++;
			} while (a <= x);

		} else {

			do {
				sum = sum + a;
				a--;
			} while (a >= x);
		}

		System.out.println("Резултата е " + sum);
	}

}
