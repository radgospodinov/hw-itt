
import java.util.Scanner;

public abstract class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ 1:
		// �� �� ������� ����� � �� �� ������ ���-������� ����� ������ �� 3 ��
		// ������
		//
		// 10, 3, 5, 8, 6, -3, 7 ���-������� ����� ������ �� 3 � -3

		Scanner sc = new Scanner(System.in);
		int x;
		do {
			System.out.println("�������� ������� �� ������");
			x = sc.nextInt();
		} while (x < 1);

		int[] arr = new int[x];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("���� �������� �������� �� " + (i + 1) + " ������� �� ������");
			arr[i] = sc.nextInt();
		}
		int kratno = 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				if (kratno > arr[i] || kratno == 1) {
					kratno = arr[i];
				}
			}
		}
		if (kratno != 1) {
			System.out.println("���-������� ����� ������ �� 3 � " + kratno);
		} else {
			System.out.println("� ������ ���� ����� ������ �� 3");
		}

	}

}
