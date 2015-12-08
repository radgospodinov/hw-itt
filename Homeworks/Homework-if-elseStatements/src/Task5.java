import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ
		 * ред.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Mоля въведете три различни числа");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		while (a == b || b == c || a == c) {
			System.out.println("Моля въведете три различни числа");
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		}
		boolean saRazmesteni = true;

		while (saRazmesteni) {

			saRazmesteni = false;

			if (a < b) {
				int g = a;
				a = b;
				b = g;
				saRazmesteni = true;
			}

			if (b < c) {
				int g = b;
				b = c;
				c = g;
				saRazmesteni = true;

			}

		}
		System.out.println("Подредените числа са " + a + " " + b + " " + c);

	}

}
