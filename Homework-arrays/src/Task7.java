import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� ��������, ����� ����� ���� ����� � ����� ������� ��� �����
		// ��� ����� ������ �� ������� �����: ���������� �� ����� ������� ��
		// ������ ����� �� � ����� �� ����� �� ���������� � ���������� �������
		// �� ���������� ������� �� ������ �����. ������� � ���������� �������
		// �� ������ ����� ������ �� �� ������� ����� �� ������� � ���������� ��
		// ������� �� ������ �����. �� �� ������ ��������� �����.

		Scanner sc = new Scanner(System.in);
		int l;
		do {
			System.out.println("�������� ������� �� ��������");
			l = sc.nextInt();
		} while (l < 1);

		int[] arr = new int[l];
		int[] arr2 = new int[l];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("�������� �������� �� " + (i + 1) + " ������� �� ������� �����: ");
			arr[i] = sc.nextInt();
		}
		System.out.println();

		arr2[0] = arr[0];
		arr2[arr.length - 1] = arr[arr.length - 1];

		for (int i = 1; i < arr.length - 1; i++) {
			arr2[i] = arr[i - 1] + arr[i + 1];
		}
		System.out.print("���������� ����� �: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr2[i]);

		}
		System.out.println(" ]");

	}

}
