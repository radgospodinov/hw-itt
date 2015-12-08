import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����� ������������� ������� ��������� �����, �������� ������ �����.
		// �� �� ������� ��������, ���� ����� �� ������� ���� �������� �� ������
		// ��� ��������� �� ��������� [-2.99..2.99] � �� ���������� � ��� �����.
		// ������ ����� �� �� ������� �� ������.
		// ������: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2 �����: 0.2;
		// 0.99; 1.4; 1.2

		// input
		Scanner sc = new Scanner(System.in);
		int l;

		do {
			System.out.println("�������� ������� �� ������");
			l = sc.nextInt();
		} while (l < 1);
		double[] arr = new double[l];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�������� �������� �� " + (i + 1) + " ������� �� ������: ");
			arr[i] = sc.nextDouble();
		}
		System.out.println();
		// reading input
		System.out.print("���������� ����� �: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr[i]);
		}
		System.out.println(" ]");
		// define length of 2nd array
		int newArrayLength = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= -2.99 && arr[i] <= 2.99) {
				newArrayLength++;
			}
		}

		// creating 2nd array and fill it with needed values
		double[] arr2 = new double[newArrayLength];
		int counter = 0;
		for (int i = 0; i < arr.length; i++)

		{
			if (arr[i] >= -2.99 && arr[i] <= 2.99) {
				arr2[counter] = arr[i];
				counter++;
			}
		}
		// print result
		System.out.print("�����: ");
		for (

		int i = 0; i < arr2.length; i++)

		{
			System.out.print((i == 0 ? "[ " : ", ") + arr2[i]);
		}
		System.out.println(" ]");
	}

}
