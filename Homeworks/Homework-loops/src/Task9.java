import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� �������� 2 ����� �� ������������ � � �. �� �� ������� ������
		// ����� �� � �� � �� ������ 2(��������� � �������).��� ����� ����� �
		// ������ �� 3, �� �� ������ ��������� �� ������� �� �������� �skip
		// 3�.��� ������ �� ������ �������� ����� (��� ������������) �����
		// ��-������ �� 200, �� �� �������� �����������.

		// scanner 2 chisla

		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int sum = 0;
		boolean purvo = true;
		do {
			System.out.println("���� �������� ��� �������� ����������� ���� ����� � � �");
			a = sc.nextInt();
			b = sc.nextInt();
		} while ((a < 0 && a > 199) || (b < 0 && b > 199) || (a == b));

		if (a > b) {
			int sw = a;
			a = b;
			b = sw;
		}
		for (int x = a; x <= b; x++) {
			if (purvo) {
				purvo = false;
			} else {
				System.out.print(",");
			}
			if (x % 3 == 0) {
				System.out.print("Skip " + "'" + x + "'");
			} else {
				System.out.print(x * x);

				sum = sum + x * x;
				if (sum > 200) {
					System.out.println();
					System.out.println("���������� ���������� �� �����, ������ ������ " + sum + " � ��-������ �� 200");
					break;
				}
			}

		}
		// ������ �� �� ���� ���� ��������� , ��� �������� ������ �������� �����
		// � � �
		sum = 0;
		purvo = true;
		int x = 1;
		int n;
		do {
			n = x * x;
			if (n > a && n < b) {
				if (purvo) {
					purvo = false;
				} else {
					System.out.print(",");
				}
				if (x % 3 == 0) {
					System.out.print("Skip " + "'" + n + "'");
				} else {
					System.out.print(n);

					sum = sum + n;
					if (sum > 200) {
						System.out.println();
						System.out.println(
								"���������� ���������� �� �����, ������ ������ " + sum + " � ��-������ �� 200");
						break;
					}
				}

			}
			x++;

		} while (n < b);

	}

}
