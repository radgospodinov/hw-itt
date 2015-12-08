import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се състави програма, при която предварително са въведени
		// естествени числа в двумерен масив 4*4 елемента.
		// Програмата да извежда резултат от проверката какво е съотношението на
		// най-голямата сума по редове спрямо най-голямата сума по колони.
		// Пример: 1,2,3,4 5,6,7,8 9,10,11,12 13,14,15,16
		//
		// Изход: най-голяма сума по редове 58 най-голяма сума по колони 40
		// Максималната сума по редове е > от максималната сума по колони

		// input
		Scanner sc = new Scanner(System.in);

		int[][] table = new int[4][4];

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				System.out.print("Въведете стойност на " + (j + 1) + " елемент на " + (i + 1) + " ред от матрицата: ");
				table[i][j] = sc.nextInt();
			}
		}

		// reading input
		System.out.println("Получената матрица е: ");
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				System.out.print((j == 0 ? "[ " : ", ") + table[i][j]);

			}
			System.out.println(" ]");
		}
		// finding both sums and compere
		int sumRows;
		int sumCols;
		int maxRows = 0;
		int maxCols = 0;

		for (int i = 0; i < table.length; i++) {
			sumRows = 0;
			for (int j = 0; j < table.length; j++) {
				sumRows += table[i][j];
			}
			if (sumRows > maxRows || i == 0) {
				maxRows = sumRows;
			}
		}
		for (int j = 0; j < table.length; j++) {
			sumCols = 0;
			for (int i = 0; i < table.length; i++) {
				sumCols += table[i][j];
			}
			if (sumCols > maxCols || j == 0) {
				maxCols = sumCols;
			}
		}

		// print result
		System.out.println("Най-голяма сума по редове е: " + maxRows);
		System.out.println("Най-голяма сума по колони е: " + maxCols);
		System.out.print("Максималната сума по редове е");
		System.out.print((maxRows > maxCols) ? " > " : " < ");
		System.out.println("от максималната сума по колони.");

	}

}
