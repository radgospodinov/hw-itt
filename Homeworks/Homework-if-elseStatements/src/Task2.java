import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �������� 2 �������� ����������� ����� �� ���������. �������� �������
		 * ����, �������, ������������, ������� �� ������� � ����������� �������
		 * � ������� ���������� � ������������ ���� ��������� � ���������.
		 * �������� ������ � ����� � ������� �������.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("���� �������� ��� �������� �����");
		int a = sc.nextInt();
		int b = sc.nextInt();

		while (a == b) {
			System.out.println("���� �������� ��������� �����");
			a = sc.nextInt();
			b = sc.nextInt();
		}
		int suma = a + b;
		int raz = a - b;
		int mul = a * b;
		int div, mod;

		System.out.println("���� ����� �� " + suma);
		System.out.println("������� ����� �� " + raz);
		System.out.println("������������ ����� �� " + mul);

		if (b == 0) {
			System.out.println("�� � �������� �������");
		} else {
			div = a / b;
			mod = a % b;
			System.out.println("����������� ������� ����� �� " + div);
			System.out.println("������� �� ��������� � ����� �� " + mod);

		}

	}

}
