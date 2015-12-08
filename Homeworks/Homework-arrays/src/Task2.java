
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Нека по въведен масив да се конструира нов, като половината му
		// елементи са точно като на оригиналния, а другите да са тези елементи,
		// но в обратен ред. Последно, да се изведе новия масив на екрана.

		Scanner sc = new Scanner(System.in);
		int l;
		do {
			System.out.println("Въведете дължина на масива");
			l = sc.nextInt();
		} while (l < 1);
		int[] arr = new int[l];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Моля въведете стойност на " + (i + 1) + " елемент от масива: ");
			arr[i] = sc.nextInt();
		}
		System.out.println();

		System.out.print("Въведеният масив е: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "" : ", ") + arr[i]);
		}
		System.out.println();

		int[] arr2 = new int[l];

		for (int i = 0; i < (arr2.length / 2); i++) {
			arr2[i] = arr[i];
			arr2[arr2.length - 1 - i] = arr[i];
		}
		// От условието не ми стана ясно , какво да правя в случеи ,че се въведе
		// масив с нечетна дължина.
		// Затова предполагам ,че средното число си запазва позицията. Ако
		// премахна иф-а , ще бъде запълнено автоматично с 0.
		// Има и вариант , в който изисквам четна дължина на масива (с цикъл
		// do-while) , но смятам това за грешка.
		// Макар ,че в условието не е пояснено.

		if (arr2.length % 2 != 0) {
			arr2[arr2.length / 2] = arr[arr.length / 2];
		}

		System.out.print("Новият масив е: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr2[i]);
		}
		System.out.println(" ]");
	}
}
