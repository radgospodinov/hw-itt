import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ��������, ���� ����� �� ������������ �� ��������
		// �������������� ��� ���� � ������� 10-20 �����.
		// ���������� �� ������� ������� �� 5 ����� � �� ������ ��������� ��
		// ��-�������, ����� � ������ �� ����������.
		// ������: uchilishe uchenik
		// �����: 9 uchenishe

		// input
		Scanner sc = new Scanner(System.in);
		String base;
		String[] split;
		do {
			System.out.println(
					"�������� �������������� ��� ����, ���� ������ �� ������� �� � ����� 10-20 ����� � ����� �� ��� � ���� 5 ������� ");
			base = sc.nextLine();
			split = base.split(" ");
		} while (base.length() < 10 || base.length() > 20 || split[0].length() < 5 || split[1].length() < 5);

		// reading input
		System.out.println("����� �������� ���� ��: " + split[0] + " � " + split[1]);
		// swap first 5 indexes
		if (split[0].length() < split[1].length()) {
			String swap = split[0];
			split[0] = split[1];
			split[1] = swap;
		}
		String bigFive = split[0].substring(0, 5);
		split[0] = split[1].substring(0, 5) + split[0].substring(5);
		split[1] = bigFive + split[1].substring(5);

		// print results
		System.out.println("��������� �� ��-������� ��� �: " + split[0].length() + " � ��� �������� �� ������� �����: "
				+ split[0]);
		System.out.println(
				"��������� �� ��-������ ��� �: " + split[1].length() + " � ��� �������� �� ������� �����: " + split[1]);
		if (split[0].length() == split[1].length()) {
			System.out.println("��������� �� ����� ������ � ������� � ������� �������� �: " + split[0].length()
					+ " � �� ��������� �� ������� �����: " + split[0] + " "+ split[1]);

		}
	}

}
