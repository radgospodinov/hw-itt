import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се състави програма, чрез която се въвеждат 2 редици от знаци
		// (думи).
		// Ако в двете редици участва един и същи знак, да се изведе на екрана
		// първата редица хоризонтално, а втората вертикално, така че да се
		// пресичат в общия си знак.
		// Ако редиците нямат общ знак да се изведе само уведомително
		// съобщение.

		// Пример :

		// м
		// а
		// шапка
		// и
		// н
		// а

		// input
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете първата дума ");
		String duma1 = sc.next();
		System.out.println("Моля въведете втората дума ");
		String duma2 = sc.next();

		// proverka na poziciq na presichane
		int pos = -1;
		String space = "";

		for (int i = 0; i < duma2.length(); i++) {
			pos = duma1.indexOf(duma2.charAt(i));

			if (pos > -1) {
				break;
			}
			// nujnite spaceove predi pechat na vertikalnite simvoli
			space += " ";
		}

		// pechat
		System.out.println("Полученият резултат след пресичане на двете думи е: ");
		for (int i = 0; i < duma1.length(); i++) {
			// horizontalna duma
			if (i == pos) {
				System.out.println(duma2);
			} else {
				// simvolite na vertikalna duma
				System.out.println(space + duma1.charAt(i));
			}
		}

	}

}
