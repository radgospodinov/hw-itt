import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Имате двумерен масив от числа, чийто стойности са въведени
		// предварително. Да се отпечатат сумата на елементите на масива, както
		// и средноаритметичното на тези числа.

		// Input
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
		double[][] table = new double[r][c];
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print("Въведете стойност на " + (j + 1) + " елемент на " + (i + 1) + " ред от таблицата: ");
				table[i][j] = sc.nextDouble();
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

		// do magic
		double sum = 0;
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				sum += table[i][j];
			}

		}
		double mid = sum / (r * c);
		// result magic
		System.out.println("Сумата на елементите е: " + sum);
		System.out.println("Средноаритметичното на тези числа е: " + mid);
	}

}
