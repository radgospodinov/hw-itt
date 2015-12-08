import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����� ������������� �������� ��������� �� �������� � �������� ����� -
		// ���������� �����.
		// �� �� ������� ��������, ���� ����� �� �������� ����������� ��
		// ���������� � �������� ����� ���� ���������� �� �� +90 �������.
		// ������: 1,2,3,4 5,6,7,8 9,10,11,12 13,14,15,16
		// ����� 13,9,5,1 14,10,6,2 15,11,7,3 16,12,8,4

		// input
		Scanner sc = new Scanner(System.in);
		int r;
		int c;
		do {
			System.out.println("�������� ���� ������ �� ���������");
			r = sc.nextInt();
		} while (r < 1);
		do {
			System.out.println("�������� ���� ������ �� ���������");
			c = sc.nextInt();
		} while (c < 1);

		int[][] table = new int[r][c];
		int[][] tableRotate = new int[c][r];

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print("�������� �������� �� " + (j + 1) + " ������� �� " + (i + 1) + " ��� �� ���������: ");
				table[i][j] = sc.nextInt();
			}
		}
		// reading input
		System.out.println("���������� ������� �: ");
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print((j == 0 ? "[ " : ", ") + table[i][j]);

			}
			System.out.println(" ]");
		}
		// rotate table to +90�
		for (int i = 0; i < tableRotate.length; i++) {
			for (int j = 0; j < tableRotate[i].length; j++) {
				tableRotate[i][j] = table[tableRotate[i].length - 1 - j][i];
			}
		}
		// reading result
		System.out.println("���������� �� +90 ������� ������� �������� ����: ");
		for (int i = 0; i < tableRotate.length; i++) {
			for (int j = 0; j < tableRotate[i].length; j++) {
				System.out.print((j == 0 ? "[ " : ", ") + tableRotate[i][j]);

			}
			System.out.println(" ]");
		}
	}

}
