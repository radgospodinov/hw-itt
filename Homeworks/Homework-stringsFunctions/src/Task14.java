import java.util.Scanner;



public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� �����, ����� ������ �� �������� ����� N � �����
		// ���������� �� N! (N ���������).
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �����");
		int x = sc.nextInt();
		// ��������� � ����� ����� ������������ ������� � � ����� ��� 19 �������� ���-�
		// ��� �������� ���� ,����� �� �������� ������ ����� �� ����
		
      	System.out.println("��������� �� ������� �: " + fact(x));
      	
      	System.out.println("��������� �� ������� ��������� � �������� �: " + factRec(x));
		
	}
	        static int fact(int n) {
	        	int f = 1; 
	        	for(int i = 2;i<=n;i++) {
	        		f = f*i;
	        	}
	        		return f;
	        	
	        }
	        static int factRec(int n) {
	        	if (n==1) {
	        		return 1;
	        	}
	        	return n=n*factRec(n-1);
	        }
	
	

}
