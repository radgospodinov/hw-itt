import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се състави програма, която въвежда от клавиатурата 7 цели числа в
		// едномерен масив
		// Програмата да изведе всички числа кратни на 5, но по големи от 5.
		// Пример: -23, -55, 17, 75, 56, 105, 134 Изход: 75,105 - 2 числа

		// input (l=7)
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Въведете стойност на " + (i + 1) + " елемент на масива ");
			arr[i] = sc.nextInt();
		}
		System.out.println();
		// reading input
		System.out.print("Полученият масив е: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr[i]);
		}
		System.out.println(" ]");
		// finding all indexes with value%5=0 and value>5 and print their value
		int counter = 0;
		System.out.print("Изход: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0 && arr[i] > 5) {
				System.out.print((counter == 0 ? "" : ", ") + arr[i]);
				counter++;
			}
		}
		// print counter
		System.out.println(" - " + counter + " числа.");

	}
}
