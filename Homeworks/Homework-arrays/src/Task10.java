import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ��������, ���� ����� �� �������� 7 ���� ����� �
		// ��������� �����.
		// ���������� �� ������ �������, ����� � ���-������ �� �������� ��������
		// �� ���������� �����.
		// ������: 1,2,3,4,5,6,7 �����: ������ �������� 4, ���-������ �������� 4

		// input (l=7)
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�������� �������� �� " + (i + 1) + " ������� �� ������: ");
			arr[i] = sc.nextInt();
		}
		System.out.println();
		// reading input
		System.out.print("���������� ����� �: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr[i]);
		}
		System.out.println(" ]");
		// finding mid value
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double mid = sum / 7.0;
		// loop to define closest to mid value and index of element with that
		// value
		int close = 0;
		double razlika = 0;
		for (int i = 0; i < arr.length; i++) {
			double forRazlika = mid - arr[i];
			if (forRazlika < 0) {
				forRazlika *= -1;
			}
			if (forRazlika < razlika || i == 0) {
				razlika = forRazlika;
				close = i;
			}
		}
		// print result
		System.out.println("������ �������� " + mid + ", ���-������ �������� " + arr[close]);
	}

}
