import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������� ��������, ����� ���� ����� �� ���� ��������� �
		// ��������.
		// ���� �������� �� �� �������� ���� �� ���������� ����, ����� � ����
		// ����� � ���-������� ����.
		// ������: asd fg hjkl
		// �����: 3 ����, ���-������� � � 4 �������.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������� �����");
		String text = sc.nextLine();
		String[] split = text.split(" ");		
		int max = 0;
		for(int i = 0;i<split.length;i++) {
			if(split[i].length()>max) {
				max = split[i].length();
			}
		}
		System.out.println(""+ (split.length) + " ����, ���-������� � � " + max + " �������.");		
		
	}

}
