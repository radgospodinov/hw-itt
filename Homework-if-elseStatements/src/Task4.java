import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Въведете 2 различни числа от конзолата и ги разпечатайте в нарастващ
		 * ред.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Моля въведете две различни числа");
		int a = sc.nextInt();
		int b = sc.nextInt();

		while (a == b) {
			System.out.println("Моля въведете _различни_ числа !");
			a = sc.nextInt();
			b = sc.nextInt();
		}
		if (a > b) {
			System.out.println(b + " " + a);
		} else
			System.out.println(a + " " + b);

	}

}
