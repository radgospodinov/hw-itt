import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �������� � ���������� ���������� ����� �� ���� abc. ������ �� ��
		 * ������� ����: ��� a = b = c - �����: ������� �� �����; ��� a>b>c -
		 * �����: ������� �� ��� �������� ���; ��� a<b<c ������� �� � ��������
		 * ���; � �����: ������� �� ����������, �� ����������� ������. �� ��
		 * ������� ��������, ����� ������� ��������� �� ���������� �� ������� ��
		 * ������� � �������. ������: 345 �����: �������� ���.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���������� ���������� �����");

		int x = sc.nextInt();
		while (x < -999 || x > 999) {
			System.out.println("�������� ��� ������� �����");
			x = sc.nextInt();
		}
		int c = x % 10;
		int b = (x / 10) % 10;
		int a = (x / 100) % 10;

		if (a == b && b == c) {
			System.out.println("������� �� �����");
		} else if (a > b && b > c) {
			System.out.println("������� �� ��� �������� ���");
		} else if (a < b && b < c) {
			System.out.println("������� �� � �������� ���");
		} else {
			System.out.println("������� �� ����������");
		}

	}

}
