import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ����� � �� �� �������� ���� � ���������.
		// �������� ������ �� ���������: [3 7 7 3] [4] [1 55 1] [6 27 -1 5 7 7 5
		// -1 27 6]

		Scanner sc = new Scanner(System.in);
		int l;
		do {
			System.out.println("�������� ������� �� ������");
			l = sc.nextInt();
		} while (l < 1);
		int[] arr = new int[l];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("�������� �������� �� " + (i + 1) + " �������: ");
			arr[i] = sc.nextInt();
		}
		System.out.println();

		boolean ogledalen = true;

		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] != arr[arr.length - i - 1]) {
				ogledalen = false;
				break;
			}
		}
		System.out.println(ogledalen ? "������� � ���������" : "������� �� � ���������");
	}

}
