import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� ��������, ����� ������ � ������� ���-������� ������ ��
		// ������� ������� �������� � ����� �����.

		Scanner sc = new Scanner(System.in);
		int l;
		do {
			System.out.println("�������� ������� �� ������");
			l = sc.nextInt();
		} while (l < 1);
		int[] arr = new int[l];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("�������� �������� �� ������� " + (i + 1) + " �� ������: ");
			arr[i] = sc.nextInt();
		}
		System.out.println("���������� ����� �: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr[i]);
		}
		System.out.println(" ]");

		int i = 0;
		int element = 0;
		int length = 0;
		while (i < arr.length) {
			int m = arr[i];
			int count = 0;

			while (arr[i] == m) {
				count++;
				i++;
				if (i == arr.length) {
					break;
				}
			}
			if (count > length) {
				length = count;
				element = m;
			}

		}
		System.out.print("���-������� ������ �� ������� ������� �������� �: ");
		for (int c = 0; c < length; c++) {
			System.out.print((c == 0 ? "" : ", ") + element);
		}
	}

}
