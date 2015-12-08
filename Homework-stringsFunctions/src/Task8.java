import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се състави програма, чрез която се въвежда ред от символи
		// (стринг, низ).
		// Програмата да изведе на екрана дали въведения стринг е палиндром,
		// т.е. дали четен отляво-надясно и отдясно-наляво е един и същ.
		// Вход: капак
		// Изход: да.
		// Вход: тенджера
		// Изход: не.

		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете дума за проверка");
		String test = sc.next();
		boolean isPali = true;
		for (int i = 0; i < test.length() / 2; i++) {
			if (test.charAt(i) != test.charAt(test.length() - i - 1)) {
				isPali = false;
			}
		}
		System.out.println(isPali ? "Думата е палиндром." : "Думата не е палиндром.");

	}

}
