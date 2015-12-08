import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се състави програма, чрез която по въведени трите имена на двама
		// човека разделени със запетая, се извежда чие име има по-голям сбор
		// от ASCII кодовете на съставящите името букви.
		// Пример: Anna Dosewa Asenowa, Iwo Peew Peew
		// Изход: Anna Dosewa Asenowa

		// input
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете две имена разделени със запетая!");
		String names = sc.nextLine();
		// reading input
		System.out.println("Въведохте имената: " + names);
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
		
		System.out.println("По-голям сбор от ASCII кодове има: " + (sum0 > sum1 ? name[0] : name[1]));
	}

}
