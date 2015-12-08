import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Имате двумерен масив 6х5 от естествени числа, чийто стойности са
		// въведени предварително.
		// Да се състави програма, чрез която се извеждат елементите от масива с
		// най-малката и най-голямата стойност.
		// Пример: 48,72,13,14,15 21,22,53,24,75 31,57,33,34,35 41,95,43,44,45
		// 59,52,53,54,55 61,69,63,64,65
		// Изход: най-малко 13; най-голямо 95

		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[6][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("Въведете стойност на " + (j + 1) + " елемент на " + (i + 1) + " ред от масива ");
				arr[i][j] = sc.nextInt();
			}
		}
		int min = 0;
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max || (i == 0 && j == 0)) {
					max = arr[i][j];
				}
				if (arr[i][j] < min || (i == 0 && j == 0)) {
					min = arr[i][j];
				}
			}
		}
		System.out.println("Най-малкото е: " + min);
		System.out.println("Най-голямото е: " + max);
	}

}
