import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ��������, ����� ������� �� ������������ 7 ���� ����� �
		// ��������� �����
		// ���������� �� ������ ������ ����� ������ �� 5, �� �� ������ �� 5.
		// ������: -23, -55, 17, 75, 56, 105, 134 �����: 75,105 - 2 �����

		// input (l=7)
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�������� �������� �� " + (i + 1) + " ������� �� ������ ");
			arr[i] = sc.nextInt();
		}
		System.out.println();
		// reading input
		System.out.print("���������� ����� �: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr[i]);
		}
		System.out.println(" ]");
		// finding all indexes with value%5=0 and value>5 and print their value
		int counter = 0;
		System.out.print("�����: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0 && arr[i] > 5) {
				System.out.print((counter == 0 ? "" : ", ") + arr[i]);
				counter++;
			}
		}
		// print counter
		System.out.println(" - " + counter + " �����.");

	}
}
