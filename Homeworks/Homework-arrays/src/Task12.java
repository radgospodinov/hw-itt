import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ��������, ���� ����� �� ������������� �������� 7 �����
		// � ��������� ����� �� �������� ������� �� �������� � �������: - 0 � 1
		// ���� ����� ����������; - 2 � 3 ���� ��������; - 4 � 5 ���� ���������.
		// ������: 1,2,3,4,5,6,7 �����: 2,1,4,3,6,5,7

		// input (l=7)
		int[] arr = new int[7];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�������� �������� �� ������� " + (i + 1) + " �� ������: ");
			arr[i] = sc.nextInt();
		}
		System.out.println();
		// reading input
		System.out.print("���������� ����� �: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr[i]);
		}
		System.out.println(" ]");
		// swap values of [0]&[1] with third variable
		int treta = arr[0];
		arr[0] = arr[1];
		arr[1] = treta;
		// swap values of [2]&[3] with addition
		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] = arr[2] - arr[3];
		// swap values of [4]&[5] with multiplication
		if (arr[4] == 0 || arr[5] == 0) {
			System.out.println("�� � �������� ������� �� ���������� 4 � 5 � ���������!");
		} else {
			arr[4] = arr[4] * arr[5];
			arr[5] = arr[4] / arr[5];
			arr[4] = arr[4] / arr[5];
		}
		// print result
		System.out.print("�����: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr[i]);
		}
		System.out.println(" ]");

	}

}
