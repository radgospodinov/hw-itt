import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се състави програма, чрез която се въвеждат два низа съдържащи до
		// 40 главни и малки букви. Като резултат на екрана да се извеждат
		// низовете само с главни и само с малки букви.
		// Пример: Abcd Efgh Изход: ABCD abcd EFGH efgh

		Scanner sc = new Scanner(System.in);
		String str1;
		String str2;
		do {
			System.out.println("Моля въведете първият низ: ");
			str1 = sc.next();
			System.out.println("Моля въведете вторият низ: ");
			str2 = sc.next();
		} while (str1.length() > 40 || str2.length() > 40);

		System.out.println("Първият низ е: " + str1);
		System.out.println("Вторият низ е: " + str2);
		
		System.out.println("Преобразуваният първи низ е: " + str1.toUpperCase() + " " + str1.toLowerCase());
		System.out.println("Преобразуваният втори низ е: " + str2.toUpperCase() + " " + str2.toLowerCase());

	}

}
