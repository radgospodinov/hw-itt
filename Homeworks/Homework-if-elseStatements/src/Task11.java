import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��������� ��������, ����� �� ������ ���������o ����� ��������� ����
		// ������� �� ���� �� ����� ���� �����. ��� ���������� ����� �� ����
		// ����� 0

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� ���������� �����");
		int x = sc.nextInt();
		int c = x % 10;
		int b = (x / 10) % 10;
		int a = (x / 100) % 10;
		while (a == 0 || b == 0 || c == 0 || x <= -999 || x >= 999) {
			System.out.println("���� �������� �������� ���������� �����(����� �� ������� 0)");
			x = sc.nextInt();
			c = x % 10;
			b = (x / 10) % 10;
			a = (x / 100) % 10;
		}
		if (x % a == 0 && x % b == 0 && x % c == 0) {
			System.out.println("������� �� ���� �� ����� ���� �����");
		} else {
			System.out.println("������� �� �� ���� �� ����� ���� �����");
		}
	}

}
