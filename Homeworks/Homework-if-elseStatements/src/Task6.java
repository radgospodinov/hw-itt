import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �������� 3 ����� �� ������������ �1, �2 � �3. ��������� �����������
		 * �� ����, �� �1 �� ��� ���������� �� �2, �2 �� ��� ���������� �� �3, �
		 * �3 �� ��� ������� �������� �� �1.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� ��� ����� ");

		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();

		int w = a1;
		a1 = a2;
		a2 = a3;
		a3 = w;

		System.out.println("���� ����������� ������� �� " + a1 + " " + a2 + " " + a3);

	}

}
