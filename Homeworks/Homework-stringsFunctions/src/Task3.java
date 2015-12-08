import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се състави програма, чрез която се въвеждат последователно две
		// редици от символи без интервали.
		// Програмата да извежда съобщение за резултата от сравнението им по
		// позиции.
		// Пример: хипопотам, хипопотук
		// Изход:
		// Двата низа са с равна дължина.
		// Разлика по позиции:
		// 8 а-у
		// 9 м-к

		// input
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете първият низ: ");
		String pyrvi = sc.nextLine();
		System.out.println("Въведете вторият низ: ");
		String vtori = sc.nextLine();
		// reading input
		System.out.println("Въведените низове са : " + pyrvi + ", " + vtori);
		// sravnqvane na stringovete
		if (pyrvi.length() == vtori.length()) {
			System.out.println("Двата низа са с равна дължина.");
		} else {
			System.out.println("Низ " + pyrvi + " e" + (pyrvi.length() > vtori.length() ? " по-дълъг " : " по-къс ")
					+ "от " + vtori);

		}
		if (pyrvi.length() <= vtori.length()) {
			String swap = pyrvi;
			pyrvi = vtori;
			vtori = swap;
		}
		System.out.println("Разлика по позиции: ");
		for (int i = 0; i < vtori.length(); i++) {

			if (vtori.charAt(i) != pyrvi.charAt(i)) {
				// print diff
				System.out.println(" " + (i + 1) + "  " + vtori.charAt(i) + "-" + pyrvi.charAt(i));
			}
		}
		if (pyrvi.length() > vtori.length()) {
			for (int i = vtori.length(); i < pyrvi.length(); i++) {
				System.out.println(" " + (i + 1) + "  " + pyrvi.charAt(i) + "-" + " ");
			}
		}

	}

}
