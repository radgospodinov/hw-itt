import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� �� ����������� 2 �����. � �� �� ������� �� ������
		// ������ ����� �� ��-������� �� ��-��������.

		Scanner sc = new Scanner(System.in);

		System.out.println("�������� ������� �����");
		int x = sc.nextInt();
		System.out.println("�������� ������� �����");
		int y = sc.nextInt();

		while (x == y) {
			System.out.println("���� �������� 2 �������� ���� �� ����� �����");
			x = sc.nextInt();
			y = sc.nextInt();

		}

		if (x > y) {
			int z = x;
			x = y;
			y = z;
		}
		while (x <= y) {
			System.out.print(x++ + " ");

		}

	}

}
