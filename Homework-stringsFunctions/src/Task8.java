import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ��������, ���� ����� �� ������� ��� �� �������
		// (������, ���).
		// ���������� �� ������ �� ������ ���� ��������� ������ � ���������,
		// �.�. ���� ����� ������-������� � �������-������ � ���� � ���.
		// ����: �����
		// �����: ��.
		// ����: ��������
		// �����: ��.

		Scanner sc = new Scanner(System.in);

		System.out.println("�������� ���� �� ��������");
		String test = sc.next();
		boolean isPali = true;
		for (int i = 0; i < test.length() / 2; i++) {
			if (test.charAt(i) != test.charAt(test.length() - i - 1)) {
				isPali = false;
			}
		}
		System.out.println(isPali ? "������ � ���������." : "������ �� � ���������.");

	}

}
