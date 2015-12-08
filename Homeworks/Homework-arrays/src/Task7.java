import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Напишете програма, която първо чете масив и после създава нов масив
		// със същия размер по следния начин: стойността на всеки елемент от
		// втория масив да е равна на сбора от предходния и следващият елемент
		// на съответния елемент от първия масив. Първият и последният елемент
		// на втория масив трябва да си останат равни на първият и последният от
		// елемент от първия масив. Да се изведе получения масив.

		Scanner sc = new Scanner(System.in);
		int l;
		do {
			System.out.println("Въведете дължина на масивите");
			l = sc.nextInt();
		} while (l < 1);

		int[] arr = new int[l];
		int[] arr2 = new int[l];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Въведете стойност на " + (i + 1) + " елемент от първият масив: ");
			arr[i] = sc.nextInt();
		}
		System.out.println();

		arr2[0] = arr[0];
		arr2[arr.length - 1] = arr[arr.length - 1];

		for (int i = 1; i < arr.length - 1; i++) {
			arr2[i] = arr[i - 1] + arr[i + 1];
		}
		System.out.print("Полученият масив е: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr2[i]);

		}
		System.out.println(" ]");

	}

}
