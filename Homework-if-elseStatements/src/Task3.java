import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Въведете 2 различни числа от конзолата и разменете стойността им.
		 * Разпечатайте новите стойности
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Моля въведете две различни числа");

		int a = sc.nextInt();
		int b = sc.nextInt();

		while (a == b) {
			System.out.println("Моля въведете различни числа");
			a = sc.nextInt();
			b = sc.nextInt();
		}
		int c = a;
		a = b;
		b = c;

		System.out.println("Разменените числа са " + a + " и " + b);

	}

}
