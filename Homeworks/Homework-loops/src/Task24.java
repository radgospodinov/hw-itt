import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ����� X � ���������, a�� �� ���� ������� ������ ����� � �����
		// ������.
		// �� �� ������� ��������, ����� ��������� ���� �������� ����� �
		// ���������.
		// ������ �����: N - ���������� ����� �� ��������� [10 .. 30000].
		// ������: 17571 �����: ������� � ���������

		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("���� �������� ����� � ��������� [10...30000]");
			n = sc.nextInt();
		} while (n < 10 || n > 30000);

		int stepen = 10000;
		int stepen2 = 1;
		boolean isPolindrom = true;
		do {
			if (n / stepen != 0) {
				if ((n / stepen) % 10 != (n / stepen2) % 10) {
					isPolindrom = false;
					break;
				}
				stepen2 = stepen2 * 10;
			}
			stepen = stepen / 10;
		} while (stepen > 1 && stepen2 < stepen);

		System.out.println(isPolindrom ? "������� � ���������" : "������� �� � ���������");

	}

}
