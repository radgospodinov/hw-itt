import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �������� ����� �� ������������ � ���������� ���� � ������. ������
		 * ����� � ���� ����� �� ���� ���� �� 1 � �� ���� ��.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� �����");
		int x = sc.nextInt();

		boolean eProsto = true;

		for (int y = 2; y < x; y++) {
			if (x % y == 0) {
				eProsto = false;
				break;
			}
		}
		if (eProsto) {
			System.out.println("������� � ������");
		} else {
			System.out.println("������� �� � ������");
		}
	}

}
