import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �������� 2 �������� ����� �� ��������� � ��������� ���������� ��.
		 * ������������ ������ ���������
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("���� �������� ��� �������� �����");

		int a = sc.nextInt();
		int b = sc.nextInt();

		while (a == b) {
			System.out.println("���� �������� �������� �����");
			a = sc.nextInt();
			b = sc.nextInt();
		}
		int c = a;
		a = b;
		b = c;

		System.out.println("����������� ����� �� " + a + " � " + b);

	}

}
