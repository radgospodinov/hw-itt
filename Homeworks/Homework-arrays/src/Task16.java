import java.util.Arrays;
import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ��������, ���� ����� ������������� �������� 10 ������
		// ����� �� ��������� �� ���������� �� ������� �����: 1. �������
		// �������������� �����. 2. ������ �������� ��� �������� ��-����� ��
		// -0.231 �� ������� ��� ������ �� �������� �� �������� �� ����� +
		// ������� 41.25, � ������ �������� �������� �� ������� � ��������������
		// ����� ����� ������� � �������� ������� �����. ��������� ����� ��
		// ������� ������� � 1. 3. �� �� ������� ���������� �� �������� �
		// ��������������� �����.
		// ������: -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4
		// �����: 42.25, 45.25, 9.3, 16.8, 0, 38.4, 90.25, 68.8, 81.9,141.25

		// input
		Scanner sc = new Scanner(System.in);

		double[] arr = new double[10];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�������� �������� �� " + (i + 1) + " ������� �� ������: ");
			arr[i] = sc.nextDouble();
		}

		// 1.printing our numbers
		System.out.print("���������� ����� �: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr[i]);
		}
		// 2.computing with some conditions
		double[] arr2 = new double[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < -0.231) {
				arr2[i] = (i + 1) * (i + 1) + 41.25;
			} else {
				arr2[i] = arr[i] * (i + 1);
			}
		}
		System.out.println();
		// 3.printing results - � ����� ����� ���� ��������� "������ ������"
		System.out.print("������� ����� �: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr[i]);
		}
		System.out.println();
		System.out.print("���������������� ����� �: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr2[i]);
		}
		System.out.println();

	}

}
