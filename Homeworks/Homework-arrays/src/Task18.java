import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ �� ��� ��������� ������ � ���������� �����. �� �� �������
		// ��������, ����� �������� ������ ����� � ������� ������� �� �����
		// ������ � ������� � ����� �����, ��-�������� �� ����� �����.
		// �� �� ������ ������������ � �� ����� ������
		// ������: 18,19,32,1,3, 4, 5, 6, 7, 8
		// 1, 2, 3,4,5,16,17,18,27,11
		// �����: 18,19,32 ,4,5,16,17,18,27,11

		Scanner sc = new Scanner(System.in);
		// input
		int l;

		do {
			System.out.println("�������� ������� �� �������� � ��������");
			l = sc.nextInt();
		} while (l < 1);

		int[] arr1 = new int[l];
		int[] arr2 = new int[l];
		int[] arr3 = new int[l];

		for (int i = 0; i < arr1.length; i++) {
			System.out.print("�������� �������� �� " + (i + 1) + " ������� �� ����� 1: ");
			arr1[i] = sc.nextInt();
		}
		System.out.println();

		for (int i = 0; i < arr2.length; i++) {
			System.out.print("�������� �������� �� " + (i + 1) + " ������� �� ����� 2: ");
			arr2[i] = sc.nextInt();
		}
		System.out.println();
		// reading input
		System.out.print("������� ������� ����� �: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr1[i]);
		}
		System.out.println(" ]");

		System.out.print("������� ������� ����� �: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr2[i]);
		}
		System.out.println(" ]");
		// filling the 3rd array
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i] < arr2[i] ? arr2[i] : arr1[i];
		}
		// print result
		System.out.print("�����: ");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr3[i]);
		}
		System.out.println(" ]");

	}

}
