import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ��������, ��� ����� ������������� �� ��������
		// ���������� ����� � �������� ����� 4*4 ��������.
		// ���������� �� ������� �������� �� ���������� ����� � ������������� ��
		// ���-�������� ���� �� ������ ������ ���-�������� ���� �� ������.
		// ������: 1,2,3,4 5,6,7,8 9,10,11,12 13,14,15,16
		//
		// �����: ���-������ ���� �� ������ 58 ���-������ ���� �� ������ 40
		// ������������ ���� �� ������ � > �� ������������ ���� �� ������

		// input
		Scanner sc = new Scanner(System.in);

		int[][] table = new int[4][4];

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				System.out.print("�������� �������� �� " + (j + 1) + " ������� �� " + (i + 1) + " ��� �� ���������: ");
				table[i][j] = sc.nextInt();
			}
		}

		// reading input
		System.out.println("���������� ������� �: ");
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
		System.out.println("���-������ ���� �� ������ �: " + maxRows);
		System.out.println("���-������ ���� �� ������ �: " + maxCols);
		System.out.print("������������ ���� �� ������ �");
		System.out.print((maxRows > maxCols) ? " > " : " < ");
		System.out.println("�� ������������ ���� �� ������.");

	}

}
