import java.util.Scanner;

/////////////// ne e gotova
public class task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ��������, ����� �� ������� ������ �� ������ ����� �� 1
		// �� �������� ����� N. ����������� ����� do-while.

		Scanner sc = new Scanner(System.in);

		System.out.println("���� �������� �����");
		int x = sc.nextInt();
		int sum = 0;
		int a = 1;

		if (x > 0) {
			do {
				sum = sum + a;
				a++;
			} while (a <= x);

		} else {

			do {
				sum = sum + a;
				a--;
			} while (a >= x);
		}

		System.out.println("��������� � " + sum);
	}

}
