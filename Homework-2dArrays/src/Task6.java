import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����� ������������� �������� ��������� �� ���������� �����. �������
		// �� �������� � ��������� ������� � ������� 6 ���� � 6 ������. �� ��
		// ������� ��������, ���� ����� �� ������ ������ �� ������ �������� ��
		// �������� � ����� ������: 2,4 � 6. ���������� �� ������� � ������ ��
		// ����� ������� ���.
		// ������: 11,12,13,14,15,16, 21,22,23,24,25,26, 31,32,33,34,35,36,
		// 41,42,43,44,45,46, 51,52,53,54,55,56, 61,62,63,64,65,66
		// �����: 21,22,23,24,25,26 ���� 141 41,42,43,44,45,46 ���� 261
		// 61,62,63,64,65,66 ���� 381 ���� �� ���������� 783

		// input
		Scanner sc = new Scanner(System.in);

		int[][] table = new int[6][6];

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
		// computing sums of all even rows
		int sum = 0;
		int rowSum;
		for (int i = 1; i < table.length; i += 2) {
			rowSum = 0;
			System.out.print("������� �� �������� ��: ");
			for (int j = 0; j < table.length; j++) {
				System.out.print((j == 0 ? "" : ",") + table[i][j]);
				rowSum += table[i][j];
			}
			System.out.println(" � ������� ���� �: " + rowSum);
			sum += rowSum;
		}
		System.out.println("������ �� ������ �������� �� ������� ������ �: " + sum);
	}

}
