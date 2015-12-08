import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Въведено е трицифрено естествено число от вида abc. Трябва да се
		 * провери дали: ако a = b = c - Изход: цифрите са равни; ако a>b>c -
		 * Изход: цифрите са във възходящ ред; ако a<b<c цифрите са в низходящ
		 * ред; и изход: цифрите са ненаредени, за неописаните случаи. Да се
		 * състави програма, която извежда резултата от проверката за наредба на
		 * цифрите в числото. Пример: 345 Изход: възходящ ред.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете трицифрено естествено число");

		int x = sc.nextInt();
		while (x < -999 || x > 999) {
			System.out.println("Въведете три цифрено число");
			x = sc.nextInt();
		}
		int c = x % 10;
		int b = (x / 10) % 10;
		int a = (x / 100) % 10;

		if (a == b && b == c) {
			System.out.println("Цифрите са равни");
		} else if (a > b && b > c) {
			System.out.println("Цифрите са във възходящ ред");
		} else if (a < b && b < c) {
			System.out.println("Цифрите са в низходящ ред");
		} else {
			System.out.println("Цифрите са ненаредени");
		}

	}

}
