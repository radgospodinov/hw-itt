import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ��������, ����� �� ������� ����� � �������/����� ��
		// ���������� ����������� t � ������ ������.
		// �������������� ��������� ��: ��� -20 ������ �������; ����� 0 � -20 -
		// �������; ����� 15 � 0 - ������; ����� 25 � 15 - �����; ��� 25 �
		// ������.
		// ������ �����: ���� ����� �� ��������� [-100..100].
		// ������: 12 �����: ������

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� ����������� � ������ �� ������");
		int t = sc.nextInt();

		while (t < -100 || t > 100) {
			System.out.println("���� �������� ����������� ����� -100 � 100 �������");
			t = sc.nextInt();
		}
		if (t <= -20) {
			System.out.println("������ �������");
		} else if (t <= 0) {
			System.out.println("�������");
		} else if (t <= 15) {
			System.out.println("������");
		} else if (t <= 25) {
			System.out.println("�����");
		} else {
			System.out.println("������");
		}
	}

}
