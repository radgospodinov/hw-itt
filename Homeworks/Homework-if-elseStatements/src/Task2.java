import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Въведете 2 различни целочислени числа от конзолата. Запишете тяхната
		 * сума, разлика, произведение, остатък от деление и целочислено деление
		 * в отделни променливи и разпечатайте тези резултати в конзолата.
		 * Опитайте същото с числа с плаваща запетая.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Моля въведете две различни числа");
		int a = sc.nextInt();
		int b = sc.nextInt();

		while (a == b) {
			System.out.println("Моля въведете РАЗПЛИЧНИ числа");
			a = sc.nextInt();
			b = sc.nextInt();
		}
		int suma = a + b;
		int raz = a - b;
		int mul = a * b;
		int div, mod;

		System.out.println("Сума равна на " + suma);
		System.out.println("Разлика равна на " + raz);
		System.out.println("Произведение равно на " + mul);

		if (b == 0) {
			System.out.println("НЕ Е ВЪЗМОЖНО ДЕЛЕНИЕ");
		} else {
			div = a / b;
			mod = a % b;
			System.out.println("Целочислено деление равно на " + div);
			System.out.println("Остатък от делението е равно на " + mod);

		}

	}

}
