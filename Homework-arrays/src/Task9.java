import java.util.Arrays;
import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� ��������, � ����� ����������� ������� �����, ���� �����
		// ���������� �� ������ �� ������� � ������� ��� (����� �� � ������ ��
		// �� �������� � ������� ���, ��� ����� �� �� ������, ���� ����� �� ��
		// �������� � �������� ���). ��������� �� ������ �������� ����� � ����
		// ������������ ����� � ����� ��� �� ���������� ���� �����.

		Scanner sc = new Scanner(System.in);
		// input
		int l;
		do {
			System.out.println("�������� ������� �� ������");
			l = sc.nextInt();
		} while (l < 1);
		int[] arr = new int[l];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�������� �������� ��  " + (i + 1) + " ������� �� ������: ");
			arr[i] = sc.nextInt();
		}
		// reading input
		System.out.println("���������� ����� �: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr[i]);
		}
		System.out.println(" ]");
		// ������� 1, � ����� ������� 2 ������:
		int[] arr2 = new int[l];
		for (int i = 0; i < arr.length; i++) {
			arr2[arr2.length - i - 1] = arr[i];
		}

		// ������� 2, � ����� ������� ���� � ��� �����:
		for (int i = 0; i < arr.length / 2; i++) {
			int sw = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = arr[i];
			arr[i] = sw;
		}
		// print
		System.out.print("����� �� ������� 1: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr2[i]);
		}
		System.out.println(" ]");

		System.out.print("����� �� ������� 2: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr[i]);
		}
		System.out.println(" ]");

	}

}
