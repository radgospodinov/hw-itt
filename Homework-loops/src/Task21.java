import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ � �������� ����� �����. ��������� �� ������ �� ����� �:
		// 2,3,4,5,6,7,8,9,10, ����, ����, ���, ���. ��������� �� ���� ��
		// ������� �: ������, ����, ����, ����.
		// �� �� ������� ��������, ���� ����� �� ������� N - ����� �� ���������
		// [1..51] � �� �������� ��������� ����� ����� � ���������� ��-������
		// ����� �� �������.
		// ������: 47. �����: ��� ����, ��� ����, ��� ������, ��� ����, ���
		// ����, ��� ����

		// izvejdam chislo
		Scanner sc = new Scanner(System.in);
		int x;
		boolean purvo = true;

		do {
			System.out.println("���� �������� ����� �� ��������� [1..51]");
			x = sc.nextInt();

		} while (x < 1 || x > 51);

		for (int n = 0; n <= 12; n++) {
			for (int c = 1; c <= 4; c++) {
				int rank = (n * 4 + c);
				if (rank >= x) {
					if (purvo) {
						System.out.print("");
						purvo = false;
					} else {
						System.out.print(", ");
					}
					if (n + 2 < 11) {
						System.out.print(n + 2);
					} else if (n + 2 == 11) {
						System.out.print("����");
					} else if (n + 2 == 12) {
						System.out.print("����");
					} else if (n + 2 == 13) {
						System.out.print("���");
					} else {
						System.out.print("���");
					}
					System.out.print(" ");
					switch (c) {
					case 1:
						System.out.print("������");
						break;
					case 2:
						System.out.print("����");
						break;
					case 3:
						System.out.print("����");
						break;
					case 4:
						System.out.print("����");
						break;
					}
				}
			}

		}
	}
}
