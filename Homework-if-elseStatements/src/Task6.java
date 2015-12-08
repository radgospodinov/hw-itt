import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите
		 * им така, че а1 да има стойността на а2, а2 да има стойността на а3, а
		 * а3 да има старата стойност на а1.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете три числа ");

		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();

		int w = a1;
		a1 = a2;
		a2 = a3;
		a3 = w;

		System.out.println("След разместване числата са " + a1 + " " + a2 + " " + a3);

	}

}
