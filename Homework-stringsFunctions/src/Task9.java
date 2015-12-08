import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ��������, ���� ����� �� ������� ��� �������� �����,
		// �����, ���� ����� '-' �� ������� ������ �� ���������� ����� ���� ��
		// ������ ������ '-' ���� ����������� �����.
		// ����: asd-12sdf45-56asdf100
		// �����:
		// -12
		// 45
		// -56
		// 100
		// ���� = 77
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �����. ");
		String text = sc.nextLine();
		int i = 0;
		int sum = 0;
		while (i < text.length()) {
			if (!Character.isDigit(text.charAt(i)) && text.charAt(i) != '-') {
				i++;
				continue;
			}
			int start = i++;
			while (i < text.length() && Character.isDigit(text.charAt(i))) {
				i++;
			}
			int end = i;
			if ((text.charAt(start) == '-' && end > start + 1) || text.charAt(start) != '-') {
				System.out.println(text.substring(start, end));
				sum += Integer.parseInt(text.substring(start, end));
			}
		}

		System.out.println("���� = " + sum);
	}

}
