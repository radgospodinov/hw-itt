import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се състави програма, която да отгатне колко е студено/топло по
		// въведената температура t в градус Целзий.
		// Температурните интервали са: под -20 ледено студено; между 0 и -20 -
		// студено; между 15 и 0 - хладно; между 25 и 15 - топло; над 25 –
		// горещо.
		// Входни данни: цяло число от интервала [-100..100].
		// Пример: 12 Изход: хладно

		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете температура в градус по Целзий");
		int t = sc.nextInt();

		while (t < -100 || t > 100) {
			System.out.println("Моля въведете температура между -100 и 100 градуса");
			t = sc.nextInt();
		}
		if (t <= -20) {
			System.out.println("Ледено студено");
		} else if (t <= 0) {
			System.out.println("Студено");
		} else if (t <= 15) {
			System.out.println("Хладно");
		} else if (t <= 25) {
			System.out.println("Топло");
		} else {
			System.out.println("Горещо");
		}
	}

}
