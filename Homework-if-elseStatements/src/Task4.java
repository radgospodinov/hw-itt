import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �������� 2 �������� ����� �� ��������� � �� ������������ � ���������
		 * ���.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("���� �������� ��� �������� �����");
		int a = sc.nextInt();
		int b = sc.nextInt();

		while (a == b) {
			System.out.println("���� �������� _��������_ ����� !");
			a = sc.nextInt();
			b = sc.nextInt();
		}
		if (a > b) {
			System.out.println(b + " " + a);
		} else
			System.out.println(a + " " + b);

	}

}
