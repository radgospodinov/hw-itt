import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ��������, ����� �� ������ ����� N, �� ��������� N!,
		// �.�. 1*2*3*4...*N.
		// ����������� ����� do-while

		Scanner sc = new Scanner(System.in);
		int N;
		do {
			System.out.println("���� �������� ����� �� 1 �� 20");
			// ������ ��������� � ����� ����� ������� ������� � 21! ��������
			// "long" ����������.
			// ���� �� �� �������� � "double" , �� � �� �� ���� ���������� ���
			// ������ ��������� (��-������ �� ����� 170) �� N
			N = sc.nextInt();
		} while (N > 20 || N < 1);
		long mult = 1;
		int i = 1;

		do {
			mult = mult * i++;
		} while (i <= N);

		System.out.println("N! = " + mult);
	}

}
