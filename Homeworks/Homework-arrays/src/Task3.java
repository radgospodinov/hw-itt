import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������ �����, ���� ����� �� �� ������� ����� � 10 �������� ��
		// ������� �����: ������� 2 �������� �� ������ �� ���������� �����.
		// ����� ������� ������� �� ������ � ����� �� ����� �� ���������� 2
		// �������� � ������.
		// ���� ���� �������� ������

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ����� , ����� �� ���� �������� �� ������� ��� �������� �� ������");
		int x = sc.nextInt();

		int[] arr = new int[10];
		arr[0] = x;
		arr[1] = x;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr[i]);
		}
		System.out.println(" ]");
	}

}
