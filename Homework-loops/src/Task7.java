import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// : ���������� �� 3, �� �� ������� �� ������ ������� n ����� ����� ��
		// ����� �� 3. ������� �� �� ��������� ��� �������.

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� n");

		int n = sc.nextInt();

		if (n >= 1) {
			System.out.print("3");
			for (int x = 6; x <= n * 3; x += 3) {
				System.out.print("," + x);
			}
		} else {
			System.out.println("��������� �����");
		}
	}
}
