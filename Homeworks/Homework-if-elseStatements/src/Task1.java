
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �� �� ������� ��������� ��� ����������� � �� �� �������� 2 ����� ��
		 * ������������ A � B (���� �� �� � ������� ������� � double). ����� ��
		 * �� ������� 3-�� ����� C � �� �� ������� ���� �� � �/� A � B. �� ��
		 * ������ ��������� ��������� �� ���� ���� C � ����� A � B.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("����, �������� ������� �����");

		double a = sc.nextDouble();

		System.out.println("����, �������� ������� �����");

		double b = sc.nextDouble();

		System.out.println("����, �������� ������� �����");

		double c = sc.nextDouble();

		if (a > b) {
			double g = a;
			a = b;
			b = g;
		}
		if (a <= c && c <= b) {
			System.out.println(c + " � ����� " + a + " � " + b);
		} else
			System.out.println(c + " �� � ����� " + a + " � " + b);

	}

}
