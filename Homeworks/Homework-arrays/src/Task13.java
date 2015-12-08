import java.util.Arrays;
import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се състави програма, чрез която се въвежда число и се представя
		// като число в двоична бройна система.
		// Програмата, чрез масив, да изчислява последователно всички цифри на
		// въведеното естествено число в 2-ична бройна система.
		// Пример: 99 Изход: 1100011

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число");
		int n = sc.nextInt();

		int[] arr = new int[32];
		boolean otricatelno = false;
		if (n < 0) {
			otricatelno = true;
			n *= -1;
		}
		for (int i = 31; i >= 0; i--) {
			arr[i] = n % 2;
			n /= 2;
			if (n == 0) {
				break;
			}
		}
		if (otricatelno) {
			// Обръщаме битовете
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (arr[i] == 0 ? 1 : 0);
			}
			// Прибавяме двoична единица
			for (int i = 31; i >= 0; i--) {
				if (arr[i] == 0) {
					arr[i] = 1;
					break;
				} else {
					arr[i] = 0;
				}
			}

		}
		boolean firstOneReached = false;
		System.out.print("Двoичното представяне е: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0 && !firstOneReached) {
				continue;
			}
			firstOneReached = true;

			System.out.print("" + arr[i]);
		}
		System.out.println();
	}

}
