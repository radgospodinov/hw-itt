
public class Task22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ��������, ����� ������� ������� 10 ���-����� �����,
		// ����� �� ����� �� 2, 3 ��� �� 5 � ����� �� ��-������ �� ��������
		// ���������� �����.
		// ������� �� ��������, ������ � ������ ������� �����. ������ �����:
		// ����� �� ��������� [1..999]
		// ������: 1 �����: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
		// ����������� ����� while.

		int n = 1;
		int counter = 1;

		while (counter <= 10) {
			if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
				if (counter != 1) {
					System.out.print(", ");
				}
				System.out.print("" + counter + ":" + n);
				counter++;
			}
			n++;
		}
	}
}
