import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ��������, ���� ����� �� �������� �������������� ���
		// ������ �� ������� ��� ���������.
		// ���������� �� ������� ��������� �� ��������� �� ����������� �� ��
		// �������.
		// ������: ���������, ���������
		// �����:
		// ����� ���� �� � ����� �������.
		// ������� �� �������:
		// 8 �-�
		// 9 �-�

		// input
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������� ���: ");
		String pyrvi = sc.nextLine();
		System.out.println("�������� ������� ���: ");
		String vtori = sc.nextLine();
		// reading input
		System.out.println("���������� ������ �� : " + pyrvi + ", " + vtori);
		// sravnqvane na stringovete
		if (pyrvi.length() == vtori.length()) {
			System.out.println("����� ���� �� � ����� �������.");
		} else {
			System.out.println("��� " + pyrvi + " e" + (pyrvi.length() > vtori.length() ? " ��-����� " : " ��-��� ")
					+ "�� " + vtori);

		}
		if (pyrvi.length() <= vtori.length()) {
			String swap = pyrvi;
			pyrvi = vtori;
			vtori = swap;
		}
		System.out.println("������� �� �������: ");
		for (int i = 0; i < vtori.length(); i++) {

			if (vtori.charAt(i) != pyrvi.charAt(i)) {
				// print diff
				System.out.println(" " + (i + 1) + "  " + vtori.charAt(i) + "-" + pyrvi.charAt(i));
			}
		}
		if (pyrvi.length() > vtori.length()) {
			for (int i = vtori.length(); i < pyrvi.length(); i++) {
				System.out.println(" " + (i + 1) + "  " + pyrvi.charAt(i) + "-" + " ");
			}
		}

	}

}
