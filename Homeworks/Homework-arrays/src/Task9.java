import java.util.Arrays;
import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Напишете програма, в която потребителя въвежда масив, след което
		// елементите на масива се обръщат в обратен ред (Целта не е масива да
		// се отпечата в обратен ред, ами първо да се обърне, след което да се
		// отпечата в нормален ред). Пробвайте да решите задачата първо с един
		// допълнителен масив и после без да използвате друг масив.

		Scanner sc = new Scanner(System.in);
		// input
		int l;
		do {
			System.out.println("Въведете дължина на масива");
			l = sc.nextInt();
		} while (l < 1);
		int[] arr = new int[l];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Въведете стойност на  " + (i + 1) + " елемент от масива: ");
			arr[i] = sc.nextInt();
		}
		// reading input
		System.out.println("Полученият масив е: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr[i]);
		}
		System.out.println(" ]");
		// Вариант 1, в който ползвам 2 масива:
		int[] arr2 = new int[l];
		for (int i = 0; i < arr.length; i++) {
			arr2[arr2.length - i - 1] = arr[i];
		}

		// Вариант 2, в който ползвам един и същ масив:
		for (int i = 0; i < arr.length / 2; i++) {
			int sw = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = arr[i];
			arr[i] = sw;
		}
		// print
		System.out.print("Изход от вариант 1: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr2[i]);
		}
		System.out.println(" ]");

		System.out.print("Изход от вариант 2: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr[i]);
		}
		System.out.println(" ]");

	}

}
