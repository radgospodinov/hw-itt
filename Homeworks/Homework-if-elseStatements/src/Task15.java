import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �� �� ������� ��������, ����� ������� ���������� ����� �� ���������
		 * [0..24]. ���������� �� ������ ������������� ��������� ���������
		 * ��������� ���. ��������� ��: [18..4] - ����� �����; [4..9] - �����
		 * ����; [9..18] - ����� ��� ������: 10 �����: ����� ���
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� ���");
		int hr = sc.nextInt();

		while (hr < 0 || hr > 24) {
			System.out.println("���� �������� ��� ����� 0-24");
			hr = sc.nextInt();
		}
		if (hr < 4 || hr >= 18) {
			System.out.println("����� �����");
		} else if (hr < 9) {
			System.out.println("����� ����");
		} else
			System.out.println("����� ���");

	}

}
