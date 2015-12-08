import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Имате предварително въведени стойности от естествени числа. Числата
		// са въведени в квадратна таблица с размери 6 реда и 6 колони. Да се
		// състави програма, чрез която се намира сумата на всички елементи от
		// редовете с четни номера: 2,4 и 6. Програмата да извежда и сумата на
		// всеки отделен ред.
		// Пример: 11,12,13,14,15,16, 21,22,23,24,25,26, 31,32,33,34,35,36,
		// 41,42,43,44,45,46, 51,52,53,54,55,56, 61,62,63,64,65,66
		// Изход: 21,22,23,24,25,26 сума 141 41,42,43,44,45,46 сума 261
		// 61,62,63,64,65,66 сума 381 Сума на елементите 783

		// input
		Scanner sc = new Scanner(System.in);

		int[][] table = new int[6][6];

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
		// computing sums of all even rows
		int sum = 0;
		int rowSum;
		for (int i = 1; i < table.length; i += 2) {
			rowSum = 0;
			System.out.print("Числата на редицата са: ");
			for (int j = 0; j < table.length; j++) {
				System.out.print((j == 0 ? "" : ",") + table[i][j]);
				rowSum += table[i][j];
			}
			System.out.println(" и тяхната сума е: " + rowSum);
			sum += rowSum;
		}
		System.out.println("Сумата на всички елементи на четните редове е: " + sum);
	}

}
