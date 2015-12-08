import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ��������, ����� ������� � ��������� ����� ������ �����.
		// ���� �����: �������� ������� ����� 3 �������� �����, ����� ���������
		// �������� ������� ������������ ���� ����.
		// ������: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12 �����: 5.1; 6.34; 7.13

		// input
		Scanner sc = new Scanner(System.in);
		int l;
		do {
			System.out.println("���� �������� ������� �� ������");
			l = sc.nextInt();
		} while (l < 1);
		double[] arr = new double[l];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�������� �������� �� ������� " + (i + 1) + " �� ������: ");
			arr[i] = sc.nextDouble();
		}
		// reading input
		System.out.print("���������� ����� �: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr[i]);
		}
		System.out.println(" ]");
		// finding highest 3 values
		double sum = 0;
		double maxSum = 0;
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					continue;
				}
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] == arr[k] || arr[j] == arr[k]) {
						continue;
					}
					sum = (arr[i] < 0 ? -arr[i] : arr[i]) + (arr[j] < 0 ? -arr[j] : arr[j])
							+ (arr[k] < 0 ? -arr[k] : arr[k]);
					if (sum > maxSum) {
						maxSum = sum;
						n1 = arr[i];
						n2 = arr[j];
						n3 = arr[k];
					}
				}
			}
		}
		// print result
		System.out.println("����� ���-������ ��������� ��������� � ������� ��: " + n1 + "; " + n2 + "; " + n3);

	}

}F
