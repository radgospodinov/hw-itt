import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �������� 3 �������� ����� �� ��������� � �� ������������ � ��������
		 * ���.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("M��� �������� ��� �������� �����");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		while (a == b || b == c || a == c) {
			System.out.println("���� �������� ��� �������� �����");
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		}
		boolean saRazmesteni = true;

		while (saRazmesteni) {

			saRazmesteni = false;

			if (a < b) {
				int g = a;
				a = b;
				b = g;
				saRazmesteni = true;
			}

			if (b < c) {
				int g = b;
				b = c;
				c = g;
				saRazmesteni = true;

			}

		}
		System.out.println("����������� ����� �� " + a + " " + b + " " + c);

	}

}
