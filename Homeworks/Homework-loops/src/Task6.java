import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ����� �� ������(���������) � �� �� ������ ����� ��
		// ������ ����� ����� 1 � ���������� �����.

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� �����");
		int x = sc.nextInt();
		int sum = 0;

		if (x > 0) {
			for (int a = 1; a <= x; a++) {
				sum = sum + a;
			}
		} else {
			for (int a = 1; a >= x; a--) {
				sum = sum + a;
			}
		}
		System.out.println("��������� � " + sum);
	}

}
