import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Въведете число от клавиатурата и определете дали е просто. Просто
		 * число е това което се дели САМО на 1 и на себе си.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете число");
		int x = sc.nextInt();

		boolean eProsto = true;

		for (int y = 2; y < x; y++) {
			if (x % y == 0) {
				eProsto = false;
				break;
			}
		}
		if (eProsto) {
			System.out.println("Числото е просто");
		} else {
			System.out.println("Числото не е просто");
		}
	}

}
