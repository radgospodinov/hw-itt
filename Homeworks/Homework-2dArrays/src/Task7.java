import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����� ������������� �������� ��������� �� ���������� �����, ��������
		// � ��������� ������� � ������� 6 ���� � 6 ������.
		// �� �� ������� �������� , ���� ����� �� ������ ������ �� ������
		// ��������, ����� ���� �� ������� �� ��� � ������ � ����� �����.
		// ���������� �� ������� ����������� ���� �� ����� ������� ��� ��
		// ����������� �������, ����� � ������ ���� �� ���� ��������. �� ��
		// �������� ���� ���� �����.

		// ������: 11,12,13,14,15,16, 21,22,23,24,25,26, 31,32,33,34,35,36,
		// 41,42,43,44,45,46, 51,52,53,54,55,56, 61,62,63,64,65,66
		// �����: 11, ,13, ,15, , ���� �� ���������� �� ����: 39 22, ,24, ,26,
		// ���� �� ���������� �� ����: 72 31, ,33, ,35, , ���� �� ���������� ��
		// ����: 99 42, ,44, ,46, ���� �� ���������� �� ����: 132 51, ,53, ,55,
		// , ���� �� ���������� �� ����: 159 62, ,64, ,66 ���� �� ���������� ��
		// ����: 192
		// ���� �� ����������: 693

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

		// compute and print results
		int sum = 0;
		int total = 0;

		for (int i = 0; i < 36; i++) {
			int r = i / 6;
			int c = i % 6;
			if ((r + c) % 2 == 0) {
				System.out.print((c > 1 ? ", " : "") + table[r][c]);
				sum += table[r][c];
			}
			if (c == 5) {
				System.out.println(" ������ �� ���������� �: " + sum);
				total += sum;
				sum = 0;
			}
		}
		System.out.println("���� �� ����������: " + total);
	}

}
