import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����� ��������� �������� ����� �� ���������� �����, ����� ���������
		// �� �������� �� ���������. �� �� ��������� ����������� �� ������.
		// ������: 1,4,6,3 5,9,7,2 4,8,1,9 2,3,4,5
		// �����: 1 9 1 5 3 7 8 2

		// input
		Scanner sc = new Scanner(System.in);
		int d;
		do {
			System.out.println("�������� ���������� �� ����������� �������");
			d = sc.nextInt();
		} while (d < 1);
		int[][] table = new int[d][d];

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				System.out.print("�������� �������� �� " + (j + 1) + " ������� �� " + (i + 1) + " ��� �� ���������: ");
				table[i][j] = sc.nextInt();
			}
		}
		// reading input
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				System.out.print((j == 0 ? "[ " : ", ") + table[i][j]);

			}
			System.out.println(" ]");
		}

		// print glaven
		System.out.println("�����: ");
		for (int i = 0; i < table.length; i++) {
			System.out.print(" " + table[i][i]);
		}
		System.out.println();
		// print vtorostepenen
		for (int i = 0; i < table.length; i++) {
			System.out.print(" " + table[i][table.length - 1 - i]);
		}

	}

}
