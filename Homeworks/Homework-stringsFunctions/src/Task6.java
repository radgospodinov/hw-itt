import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ��������, ���� ����� �� ������� ��������� � �������
		// ����.
		// ���� �������� �� ������ �� �� ������� ����� �����, �� ����� �������
		// ���� �� ������� � ������ �����, � ���������� � ����� �� �� �����.
		// ������: ����� ����� ������
		// �����: ����� ����� ������
	
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ��������� �� ��������������");
		String text = sc.nextLine();
		// String controlChars = "?!,. ";      - ����. ������...
		text = text.toUpperCase().charAt(0) + text.substring(1);
		for (int i = 1; i < text.length() - 1; i++) {
			// if(controlChars.indexOf(text.charAt(i-1))>=0 &&
			// controlChars.indexOf(text.charAt(i))<0) {

			// - �� �� �������� "��"-����� � ������, � �����
			// ������ �� ��������� ������� ����� �� ����� ���� ���� ��������� 
			// � ������������ ����� ��� "�����"
			if (text.charAt(i - 1) == ' ' && text.charAt(i) != ' ') {
				text = text.substring(0, i) + text.toUpperCase().charAt(i) + text.substring(i + 1);
			}

		}
		System.out.println(text);

	}

}