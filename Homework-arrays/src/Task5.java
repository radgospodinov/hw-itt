
public abstract class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� ��������, ����� ������� ����� � 10 �������� � ������������
		// ����� �� ���������� ��� ��������, ����� �� ������� �� ��������,
		// ������� �� 3. �� �� ������� ���������� �� ������.

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 3;
		}

		for (int i = 0; i < arr.length; i++) {

			System.out.print((i == 0 ? "[ " : ", ") + arr[i]);

		}
		System.out.println(" ]");
	}

}
