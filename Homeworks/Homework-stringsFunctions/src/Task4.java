import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ��������, ���� ����� �� �������� ����� ����� �� �����
		// ������ ��������� ��� �������, �� ������� ��� ��� ��� ��-����� ����
		// �� ASCII �������� �� ����������� ����� �����.
		// ������: Anna Dosewa Asenowa, Iwo Peew Peew
		// �����: Anna Dosewa Asenowa

		// input
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ��� ����� ��������� ��� �������!");
		String names = sc.nextLine();
		// reading input
		System.out.println("��������� �������: " + names);
		// compare
		String[] name = names.split(",");

		int sum0 = 0;
		int sum1 = 0;
		for(int i =0;i<name[0].length();i++) {
			sum0+=name[0].charAt(i);
		}
		for(int i =0;i<name[1].length();i++) {
			sum1+=name[1].charAt(i);
		}
		
		// print result
		
		System.out.println("��-����� ���� �� ASCII ������ ���: " + (sum0 > sum1 ? name[0] : name[1]));
	}

}
