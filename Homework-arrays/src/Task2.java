
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �� ������� ����� �� �� ���������� ���, ���� ���������� ��
		// �������� �� ����� ���� �� �����������, � ������� �� �� ���� ��������,
		// �� � ������� ���. ��������, �� �� ������ ����� ����� �� ������.

		Scanner sc = new Scanner(System.in);
		int l;
		do {
			System.out.println("�������� ������� �� ������");
			l = sc.nextInt();
		} while (l < 1);
		int[] arr = new int[l];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("���� �������� �������� �� " + (i + 1) + " ������� �� ������: ");
			arr[i] = sc.nextInt();
		}
		System.out.println();

		System.out.print("���������� ����� �: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "" : ", ") + arr[i]);
		}
		System.out.println();

		int[] arr2 = new int[l];

		for (int i = 0; i < (arr2.length / 2); i++) {
			arr2[i] = arr[i];
			arr2[arr2.length - 1 - i] = arr[i];
		}
		// �� ��������� �� �� ����� ���� , ����� �� ����� � ������ ,�� �� ������
		// ����� � ������� �������.
		// ������ ����������� ,�� �������� ����� �� ������� ���������. ���
		// �������� ��-� , �� ���� ��������� ����������� � 0.
		// ��� � ������� , � ����� �������� ����� ������� �� ������ (� �����
		// do-while) , �� ������ ���� �� ������.
		// ����� ,�� � ��������� �� � ��������.

		if (arr2.length % 2 != 0) {
			arr2[arr2.length / 2] = arr[arr.length / 2];
		}

		System.out.print("������ ����� �: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr2[i]);
		}
		System.out.println(" ]");
	}
}
