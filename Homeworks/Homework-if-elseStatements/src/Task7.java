import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �������� 3 ���������� �� ������������ � ��� (���������� ���), ����
		 * ���� (����� � ������� �������), ���� ��� ����� � ����� ���. ���������
		 * ��������, ����� ����� ������� �� ������ �� ���� ����� �� �������
		 * �����: - ��� ��� �����, ���� �� ������� - ��� ���� ����, �� �� ����
		 * ��������� - ��� ����� � �� ���� ����� � �� ��� ��� - ��� ��� �����,
		 * �� ����� �� ���� � �������� - ��� ���� ��-����� �� 10 ��, �� ����� ��
		 * ����. ���������� ������� �������� ���� ��������� � ���������
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("���� ������� ����� � ����");
		// �� �������� ���� ��������� ���, ��� ��������� �� �� �� ��������
		// ������ � ��������.
		int hr = sc.nextInt();
		// ������ ���� �� �� �������� :)
		while (hr < 0 || hr > 24) {
			System.out.println("��������� ���");
			hr = sc.nextInt();
		}
		System.out.println("���� �������� ����� ���� �����");
		double sum = sc.nextDouble();
		System.out.println("���� �������� ���� ��� ������ ����������� true/false");
		boolean hlt = sc.nextBoolean();

		if (!hlt) {
			System.out.println("���� �� �������");
			if (sum > 0) {
				System.out.println("�� �� ���� ���������");

			} else {
				System.out.println("�� ���� ����� � �� ��� ���");
			}

		} else {
			if (sum < 10) {
				System.out.println("�� ����� �� ����");
			} else {
				System.out.println("�� ����� �� ���� � ��������");
			}

		}

	}

}
