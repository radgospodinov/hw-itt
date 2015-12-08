import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Дадени са два едномерни масива с естествени числа. Да се състави
		// програма, която сравнява всички числа с еднакви индекси от двата
		// масива и записва в трети масив, по-голямото от двете числа.
		// Да се изведе съдържанието и на трите масива
		// Пример: 18,19,32,1,3, 4, 5, 6, 7, 8
		// 1, 2, 3,4,5,16,17,18,27,11
		// Изход: 18,19,32 ,4,5,16,17,18,27,11

		Scanner sc = new Scanner(System.in);
		// input
		int l;

		do {
			System.out.println("Въведете дължина на масивите в задачата");
			l = sc.nextInt();
		} while (l < 1);

		int[] arr1 = new int[l];
		int[] arr2 = new int[l];
		int[] arr3 = new int[l];

		for (int i = 0; i < arr1.length; i++) {
			System.out.print("Въведете стойност на " + (i + 1) + " елемент от масив 1: ");
			arr1[i] = sc.nextInt();
		}
		System.out.println();

		for (int i = 0; i < arr2.length; i++) {
			System.out.print("Въведете стойност на " + (i + 1) + " елемент от масив 2: ");
			arr2[i] = sc.nextInt();
		}
		System.out.println();
		// reading input
		System.out.print("Първият получен масив е: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr1[i]);
		}
		System.out.println(" ]");

		System.out.print("Вторият получен масив е: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr2[i]);
		}
		System.out.println(" ]");
		// filling the 3rd array
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i] < arr2[i] ? arr2[i] : arr1[i];
		}
		// print result
		System.out.print("Изход: ");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr3[i]);
		}
		System.out.println(" ]");

	}

}
