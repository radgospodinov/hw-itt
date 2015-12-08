import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// : Започвайки от 3, да се изведат на екрана първите n числа които се
		// делят на 3. Числата да са разделени със запетая.

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете n");

		int n = sc.nextInt();

		if (n >= 1) {
			System.out.print("3");
			for (int x = 6; x <= n * 3; x += 3) {
				System.out.print("," + x);
			}
		} else {
			System.out.println("Невалидно число");
		}
	}
}
