import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����� �������� ����� �� �����, ����� ��������� �� ��������
		// �������������. �� �� ��������� ������ �� ���������� �� ������, �����
		// � ������������������� �� ���� �����.

		// Input
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
		double[][] table = new double[r][c];
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print("�������� �������� �� " + (j + 1) + " ������� �� " + (i + 1) + " ��� �� ���������: ");
				table[i][j] = sc.nextDouble();
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

		// do magic
		double sum = 0;
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				sum += table[i][j];
			}

		}
		double mid = sum / (r * c);
		// result magic
		System.out.println("������ �� ���������� �: " + sum);
		System.out.println("������������������� �� ���� ����� �: " + mid);
	}

}
