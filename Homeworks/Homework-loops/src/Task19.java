import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ��������, ���� ����� �� �������� ���������� ����� ��
		// ��������� [10..99] �� ������� �������� �����, ��� �������� ��
		// �������� ����������: 1) ��� ����������� ����� � ����� �� �������
		// 0.5*�������; 2) ��� ����������� ����� � ������� �� ������� 3*�������
		// +1. ����������� ���������� ������ �� �� ������ �������� 1.
		// ������: 11 �����: 34 17 52 26 13 40 20 10 5 16 8 4 2 1

		Scanner sc = new Scanner(System.in);
		int x;
		do {
			System.out.println("�������� ���������� ����� �� ��������� [10..99]");
			x = sc.nextInt();
		} while (x < 10 || x > 99);
		while (x > 1) {

			if (x % 2 == 0) {
				x = x / 2;
				System.out.print(x + " ");
			} else {
				x = x * 3 + 1;
				System.out.print(x + " ");
			}
		}

	}

}
