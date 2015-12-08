import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Съставете програма, която по дадено трицифренo число проверява дали
		// числото се дели на всяка своя цифра. Във въведеното число да няма
		// цифра 0

		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете трицифрено число");
		int x = sc.nextInt();
		int c = x % 10;
		int b = (x / 10) % 10;
		int a = (x / 100) % 10;
		while (a == 0 || b == 0 || c == 0 || x <= -999 || x >= 999) {
			System.out.println("Моля въведете коректно ТРИцифрено число(което не съдържа 0)");
			x = sc.nextInt();
			c = x % 10;
			b = (x / 10) % 10;
			a = (x / 100) % 10;
		}
		if (x % a == 0 && x % b == 0 && x % c == 0) {
			System.out.println("Числото се дели на всяка своя цифра");
		} else {
			System.out.println("Числото не се дели на всяка своя цифра");
		}
	}

}
