import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Въведете 3 променливи от клавиатурата – час (целочислен тип), сума
		 * пари (число с плаваща запетая), дали съм здрав – булев тип. Съставете
		 * програма, която взема решения на базата на тези данни по следния
		 * начин: - ако съм болен, няма да излизам - ако имам пари, ще си купя
		 * лекарства - ако нямам – ще стоя вкъщи и ще пия чай - ако съм здрав,
		 * ще отида на кино с приятели - ако имам по-малко от 10 лв, ще отида на
		 * кафе. Полученото решение покажете като съобщение в конзолата
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Моля въвдете колко е часа");
		// Не разбирам защо въвеждаме час, при положение че не го ползваме
		// никъде в задачата.
		int hr = sc.nextInt();
		// Затова поне ще го проверим :)
		while (hr < 0 || hr > 24) {
			System.out.println("Невалиден час");
			hr = sc.nextInt();
		}
		System.out.println("Моля въведете колко пари имате");
		double sum = sc.nextDouble();
		System.out.println("Моля въведете дали сте здрави използвайки true/false");
		boolean hlt = sc.nextBoolean();

		if (!hlt) {
			System.out.println("няма да излизам");
			if (sum > 0) {
				System.out.println("ще си купя лекарства");

			} else {
				System.out.println("ще стоя вкъщи и ще пия чай");
			}

		} else {
			if (sum < 10) {
				System.out.println("ще отида на кафе");
			} else {
				System.out.println("ще отида на кино с приятели");
			}

		}

	}

}
