import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Имате предварително въведен едномерен масив, съдържащ реални числа.
		// Да се състави програма, чрез която се избират само елементи от масива
		// със стойности от интервала [-2.99..2.99] и се отпечатват в нов масив.
		// Новият масив да се извежда на екрана.
		// Пример: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2 Изход: 0.2;
		// 0.99; 1.4; 1.2

		// input
		Scanner sc = new Scanner(System.in);
		int l;

		do {
			System.out.println("Въведете дължина на масива");
			l = sc.nextInt();
		} while (l < 1);
		double[] arr = new double[l];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Въведете стойност на " + (i + 1) + " елемент от масива: ");
			arr[i] = sc.nextDouble();
		}
		System.out.println();
		// reading input
		System.out.print("Полученият масив е: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr[i]);
		}
		System.out.println(" ]");
		// define length of 2nd array
		int newArrayLength = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= -2.99 && arr[i] <= 2.99) {
				newArrayLength++;
			}
		}

		// creating 2nd array and fill it with needed values
		double[] arr2 = new double[newArrayLength];
		int counter = 0;
		for (int i = 0; i < arr.length; i++)

		{
			if (arr[i] >= -2.99 && arr[i] <= 2.99) {
				arr2[counter] = arr[i];
				counter++;
			}
		}
		// print result
		System.out.print("Изход: ");
		for (

		int i = 0; i < arr2.length; i++)

		{
			System.out.print((i == 0 ? "[ " : ", ") + arr2[i]);
		}
		System.out.println(" ]");
	}

}
