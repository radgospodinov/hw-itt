import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се въведат от потребителя 2 числа. И да се изведат на екрана
		// всички числа от по-малкото до по-голямото.

		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете първото число");
		int x = sc.nextInt();
		System.out.println("Въведете второто число");
		int y = sc.nextInt();

		while (x == y) {
			System.out.println("Моля въведете 2 различни едно от друго числа");
			x = sc.nextInt();
			y = sc.nextInt();

		}

		if (x > y) {
			int z = x;
			x = y;
			y = z;
		}
		while (x <= y) {
			System.out.print(x++ + " ");

		}

	}

}
