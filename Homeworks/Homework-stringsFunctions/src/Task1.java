import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ��������, ���� ����� �� �������� ��� ���� ��������� ��
		// 40 ������ � ����� �����. ���� �������� �� ������ �� �� ��������
		// �������� ���� � ������ � ���� � ����� �����.
		// ������: Abcd Efgh �����: ABCD abcd EFGH efgh

		Scanner sc = new Scanner(System.in);
		String str1;
		String str2;
		do {
			System.out.println("���� �������� ������� ���: ");
			str1 = sc.next();
			System.out.println("���� �������� ������� ���: ");
			str2 = sc.next();
		} while (str1.length() > 40 || str2.length() > 40);

		System.out.println("������� ��� �: " + str1);
		System.out.println("������� ��� �: " + str2);
		
		System.out.println("��������������� ����� ��� �: " + str1.toUpperCase() + " " + str1.toLowerCase());
		System.out.println("��������������� ����� ��� �: " + str2.toUpperCase() + " " + str2.toLowerCase());

	}

}
