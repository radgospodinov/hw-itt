import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ��������, ���� ����� �� �������� 2 ������ �� �����
		// (����).
		// ��� � ����� ������ ������� ���� � ���� ����, �� �� ������ �� ������
		// ������� ������ ������������, � ������� ����������, ���� �� �� ��
		// �������� � ����� �� ����.
		// ��� �������� ����� ��� ���� �� �� ������ ���� ������������
		// ���������.

		// ������ :

		// �
		// �
		// �����
		// �
		// �
		// �

		// input
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� ������� ���� ");
		String duma1 = sc.next();
		System.out.println("���� �������� ������� ���� ");
		String duma2 = sc.next();

		// proverka na poziciq na presichane
		int pos = -1;
		String space = "";

		for (int i = 0; i < duma2.length(); i++) {
			pos = duma1.indexOf(duma2.charAt(i));

			if (pos > -1) {
				break;
			}
			// nujnite spaceove predi pechat na vertikalnite simvoli
			space += " ";
		}

		// pechat
		System.out.println("���������� �������� ���� ��������� �� ����� ���� �: ");
		for (int i = 0; i < duma1.length(); i++) {
			// horizontalna duma
			if (i == pos) {
				System.out.println(duma2);
			} else {
				// simvolite na vertikalna duma
				System.out.println(space + duma1.charAt(i));
			}
		}

	}

}
