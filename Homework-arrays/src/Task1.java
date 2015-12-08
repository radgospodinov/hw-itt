
import java.util.Scanner;

public abstract class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Задача 1:
		// Да се прочете масив и да се намери най-малкото число кратно на 3 от
		// масива
		//
		// 10, 3, 5, 8, 6, -3, 7 Най-малкото число кратно на 3 е -3

		Scanner sc = new Scanner(System.in);
		int x;
		do {
			System.out.println("Въведете дължина на масива");
			x = sc.nextInt();
		} while (x < 1);

		int[] arr = new int[x];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Моля въведете стойност на " + (i + 1) + " елемент от масива");
			arr[i] = sc.nextInt();
		}
		int kratno = 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				if (kratno > arr[i] || kratno == 1) {
					kratno = arr[i];
				}
			}
		}
		if (kratno != 1) {
			System.out.println("Най-малкото число кратно на 3 е " + kratno);
		} else {
			System.out.println("В масива няма числа кратни на 3");
		}

	}

}
