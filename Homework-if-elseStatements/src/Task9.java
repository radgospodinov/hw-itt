import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �� �� ������� ��������, ����� ���� �� ��������� 2 ����������
		 * ���������� ����� a,b. ���������� �� ������ � ��������� ����
		 * ���������� ����� �� �������������� �� ����� ����� � �����, ����� �
		 * ������ �����. ������ �����: a,b - ���������� ����� �� ���������
		 * [10..99]. ������: 15, 25 �����: 375, 5 �������
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("���� �������� ��� ���� ���������� �����");
		int a = sc.nextInt();
		int b = sc.nextInt();
		while (a < 10 || b < 10 || a > 99 || b > 99) {
			System.out.println("���� �������� ��� ���������� �����");
			a = sc.nextInt();
			b = sc.nextInt();
		}
		int c = a * b;
		int lc = c % 10;

		System.out.println(c + "," + lc + (lc % 2 == 1 ? " �������" : " �����"));

		// if (lc % 2 == 1) {
		// System.out.println(c + "," + lc + " �������");
		// } else {
		// System.out.println(c + "," + lc + " �����");
		// }
		// �������, � ����� �������� if-else statement-���
		//

	}

}
