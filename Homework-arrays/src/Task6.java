import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� ��������, ����� ����� ���� 2 ������ � ����� �������
		// ��������� ���� �� �������, � ���� �� � ������� ������.

		Scanner sc = new Scanner(System.in);

		int l1;
		int l2;
		do {
			System.out.println("�������� ������� �� ����� 1: ");
			l1 = sc.nextInt();
		} while (l1 < 1);
		do {
			System.out.println("�������� ������� �� ����� 2: ");
			l2 = sc.nextInt();
		} while (l2 < 1);
		int[] arr1 = new int[l1];
		int[] arr2 = new int[l2];

		for (int i = 0; i < arr1.length; i++) {
			System.out.print("�������� �������� �� ������� " + (i + 1) + " �� ������� �����: ");
			arr1[i] = sc.nextInt();
		}
		System.out.println();

		for (int i = 0; i < arr2.length; i++) {
			System.out.print("�������� �������� �� ������� " + (i + 1) + " �� ������� �����: ");
			arr2[i] = sc.nextInt();
		}
		System.out.println();

		if (l1 != l2) {
			System.out.println("�������� �� �� �������,�������� �� � ��������!");
		} else {
			boolean ravni = true;
			System.out.print("�������� �� � ������� ������ � ");
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					ravni = false;
					break;
				}
			}
			System.out.print(ravni ? "����� ������ �� �������!" : "�������� �� �� �������!");
		}

	}

}
