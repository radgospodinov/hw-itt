import java.util.Arrays;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� �����, ����� ������ �� ������ ����� ����� N �
		// ����� ����� �� ����� � ������� N, ����� ������� ������ �����
		// �� 1 �� N.
		
		
		int x = 14;
		printArr(arrOneToN(x));
	}

	static int[] arrOneToN(int n) {
		int[] arr = new int[n];
		for(int i =0;i<arr.length;i++ ) {
			arr[i] = i+1;
		}
		return arr;
	}
	// ������� �� ������ �� ������ 11 �� ��������� � ������������
    static void printArr(int[] arr) {
    	for(int i = 0 ; i<arr.length;i++) {
    		System.out.print((i==0 ? "[ " : ", ")+arr[i]);
    	}
    	System.out.println(" ]");
    }
}
