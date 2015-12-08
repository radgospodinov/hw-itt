
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Да се изведат съобщения към потребителя и да се прочетат 2 числа от
		 * клавиатурата A и B (може да са с плаваща запетая – double). После да
		 * се прочете 3-то число C и да се провери дали то е м/у A и B. Да се
		 * изведе подходящо съобщение за това дали C е между A и B.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Моля, въведете първото число");

		double a = sc.nextDouble();

		System.out.println("Моля, въведете второто число");

		double b = sc.nextDouble();

		System.out.println("Моля, въведете третото число");

		double c = sc.nextDouble();

		if (a > b) {
			double g = a;
			a = b;
			b = g;
		}
		if (a <= c && c <= b) {
			System.out.println(c + " е между " + a + " и " + b);
		} else
			System.out.println(c + " не е между " + a + " и " + b);

	}

}
