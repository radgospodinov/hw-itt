import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Имате предварително въведени стойности на елементи в двумерен масив -
		// естествени числа.
		// Да се състави програма, чрез която се извеждат стойностите на
		// елементите в двумерен масив след обръщането му на +90 градуса.
		// Пример: 1,2,3,4 5,6,7,8 9,10,11,12 13,14,15,16
		// Изход 13,9,5,1 14,10,6,2 15,11,7,3 16,12,8,4

		// input
		Scanner sc = new Scanner(System.in);
		int r;
		int c;
		do {
			System.out.println("Въведете брой редове на таблицата");
			r = sc.nextInt();
		} while (r < 1);
		do {
			System.out.println("Въведете брой колони на таблицата");
			c = sc.nextInt();
		} while (c < 1);

		int[][] table = new int[r][c];
		int[][] tableRotate = new int[c][r];

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print("Въведете стойност на " + (j + 1) + " елемент на " + (i + 1) + " ред от таблицата: ");
				table[i][j] = sc.nextInt();
			}
		}
		// reading input
		System.out.println("Получената таблица е: ");
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print((j == 0 ? "[ " : ", ") + table[i][j]);

			}
			System.out.println(" ]");
		}
		// rotate table to +90°
		for (int i = 0; i < tableRotate.length; i++) {
			for (int j = 0; j < tableRotate[i].length; j++) {
				tableRotate[i][j] = table[tableRotate[i].length - 1 - j][i];
			}
		}
		// reading result
		System.out.println("Обърнатата на +90 градуса таблица изглежда така: ");
		for (int i = 0; i < tableRotate.length; i++) {
			for (int j = 0; j < tableRotate[i].length; j++) {
				System.out.print((j == 0 ? "[ " : ", ") + tableRotate[i][j]);

			}
			System.out.println(" ]");
		}
	}

}
