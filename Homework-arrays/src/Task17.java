import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ������ �� ���������� ����� �� �������� �������������� ������,
		// ��� �� ���������� � �� ���������� ���������:
		// N1 < N2 > N3 < N4 > N5 <..
		// ��������� ��������, ����� ��������� ���� �������� � ��������� �����
		// ������ �� ����� ���������� ������� ����������.
		// ������: 1 3 2 4 3 7
		// �����: ��������� ������������ �� �������������� ������ ������

		// input
		Scanner sc = new Scanner(System.in);
		int l;
		do {
			System.out.println("���� �������� ������� �� ������");
			l = sc.nextInt();
		} while (l < 1);
		int[] arr = new int[l];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�������� �������� �� ������� " + (i + 1) + " : ");
			arr[i] = sc.nextInt();
		}
		// reading input
		System.out.print("���������� ����� �: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr[i]);
		}
		System.out.println(" ]");
		// proverka
		boolean zigZag = true;
		for (int i = 1; i < arr.length; i++) {
			if (i % 2 == 0) {
				if (!(arr[i] < arr[i - 1])) {
					zigZag = false;
					break;
				}

			} else {
				if (!(arr[i] > arr[i - 1])) {
					zigZag = false;
					break;
				}

			}

		}
		// print result
		System.out.println(zigZag ? "��������� ������������ �� �������������� ������ ������"
				: "�� ��������� ������������ �� �������������� ������ ������");
	}

}
