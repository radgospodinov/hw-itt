import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ��������, ���� ����� �� �������� 2 ���������� ����� N,
		// M �� ��������� [10..5555].
		// ����������, ���� ����� for, �� ������� ������ ����� �� ���������,
		// ����� �� ������ �� 50 � �������� ���.
		// ������: 25,249 �����: 200,150,100, 50.

		Scanner sc = new Scanner(System.in);

		int n;
		int m;
		boolean purvo = true;

		do {
			System.out.println("�������� 2 ���������� ����� N, M �� ��������� [10..5555].");
			n = sc.nextInt();
			m = sc.nextInt();
		} while (n < 10 || n > 5555 || m < 10 || m > 5555 || n == m);
		if (n > m) {
			int sw = n;
			n = m;
			m = sw;
		}
		if (n < 50 && m < 50) {
			System.out.println("���� ����� ������ �� 50 � ���� ��������");
		}
		for (int i = m; i >= n; i--) {
			if (i % 50 == 0) {
				if (purvo) {
					System.out.print("");
					purvo = false;
				} else {
					System.out.print(",");
				}
				System.out.print("" + i);
			}
		}

	}

}
