import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		// �� �� ������� ��������, ����� �� ����� ��� ����� ����,
		// ���������, �� ����� �� �������� ���� ��� ����� ��� �� ������
		// �� ASCII ��������� � ���������� ������� 5 � � �������
		// ������������� ������.
		// ������ :
		// ����: Hello
		// �����: Mjqqt

		Scanner sc = new Scanner(System.in);

		System.out.println("�������� ���");
		String str = sc.nextLine();
		
        System.out.println("��������������� ��� �: ");
		for (int i = 0; i < str.length(); i++) {
			System.out.print((char)(str.charAt(i) + 5));
		}
		System.out.println();

	}

}
