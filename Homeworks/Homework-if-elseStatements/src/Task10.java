import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ������ �� �� ������� �������� � ����. ����� 2 ���� � ���������� 2 � 3
		 * ����� � �� �������� ������������. �� �� ������� ��������, ����� ��
		 * ����� ���� ������� ��� �� �������� ��������� � ���� ����, �.�.
		 * ��-����� ���� �� �� ����� ����� �� ������. ������ �� ����� �� ��
		 * ������� � �������� ���������� ����. ������ �����: ���������� ����� ��
		 * ��������� [10..9999]. ������: 107 �����: 21 ���� �� 2 �����, 21 ����
		 * �� 3 ����� ������������ ���� �� 2 �����
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out
				.println("���� �������� ������������ ����, � ����� ������ �� ��������� ���������� �� 10 �� 9999 �����");

		int a = sc.nextInt();
		while (a < 10 || a > 9999) {
			System.out.println("���� �������� ���������� ����� 10 � 9999");
			a = sc.nextInt();
		}
		int dvete = a / 5;
		int bonus = a % 5;

		if (bonus == 2 || bonus == 4) {
			System.out.println(dvete + " ���� �� 2 �����");
			System.out.println(dvete + " ���� �� 3 �����");
			System.out.println(bonus / 2 + " ���� ������������ �� 2 �����");
		} else if (bonus == 3) {
			System.out.println(dvete + " ���� �� 2 �����");
			System.out.println(dvete + " ���� �� 3 �����");
			System.out.println(bonus / 3 + " ���� ������������ �� 3 �����");
		} else if (bonus == 1) {
			dvete--;
			System.out.println(dvete + " ���� �� 2 �����");
			System.out.println(dvete + " ���� �� 3 �����");
			System.out.println((bonus + 5) / 2 + " ���� ������������ �� 2 ����� ���");
			System.out.println((bonus + 5) / 3 + " ���� ������������ �� 3 �����");
		} else {
			System.out.println(dvete + " ���� �� 2 �����");
			System.out.println(dvete + " ���� �� 3 �����");
			System.out.println("��� ������������ ���� �� 2 ��� 3 �����");

		}

	}

}
