import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и 3
		 * литра и ги ползвате едновременно. Да се състави програма, която по
		 * даден обем извежда как ще прелеете течността с тези кофи, т.е.
		 * по-колко пъти ще се пълни всяка от кофите. Кофите не могат да се
		 * ползват с частично количество вода. Входни данни: естествено число от
		 * интервала [10..9999]. Пример: 107 Изход: 21 пъти по 2 литра, 21 пъти
		 * по 3 литра допълнително кофа от 2 литра
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out
				.println("Моля въведете количеството вода, с което искате да напълните цистерната от 10 до 9999 литра");

		int a = sc.nextInt();
		while (a < 10 || a > 9999) {
			System.out.println("Моля въведете количество между 10 и 9999");
			a = sc.nextInt();
		}
		int dvete = a / 5;
		int bonus = a % 5;

		if (bonus == 2 || bonus == 4) {
			System.out.println(dvete + " пъти по 2 литра");
			System.out.println(dvete + " пъти по 3 литра");
			System.out.println(bonus / 2 + " пъти допълнително от 2 литра");
		} else if (bonus == 3) {
			System.out.println(dvete + " пъти по 2 литра");
			System.out.println(dvete + " пъти по 3 литра");
			System.out.println(bonus / 3 + " пъти допълнително от 3 литра");
		} else if (bonus == 1) {
			dvete--;
			System.out.println(dvete + " пъти по 2 литра");
			System.out.println(dvete + " пъти по 3 литра");
			System.out.println((bonus + 5) / 2 + " пъти допълнително от 2 литра или");
			System.out.println((bonus + 5) / 3 + " пъти допълнително от 3 литра");
		} else {
			System.out.println(dvete + " пъти по 2 литра");
			System.out.println(dvete + " пъти по 3 литра");
			System.out.println("без допълнителни кофи от 2 или 3 литра");

		}

	}

}
