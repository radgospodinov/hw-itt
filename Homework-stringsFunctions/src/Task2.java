import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се състави програма, чрез която от клавиатурата се въвеждат
		// последователно две думи с дължина 10-20 знака.
		// Програмата да размени първите им 5 знака и да изведе дължината на
		// по-дългата, както и новото им съдържание.
		// Пример: uchilishe uchenik
		// Изход: 9 uchenishe

		// input
		Scanner sc = new Scanner(System.in);
		String base;
		String[] split;
		do {
			System.out.println(
					"Въведете последователно две думи, като общата им дължина да е между 10-20 знака и всяка от тях е поне 5 символа ");
			base = sc.nextLine();
			split = base.split(" ");
		} while (base.length() < 10 || base.length() > 20 || split[0].length() < 5 || split[1].length() < 5);

		// reading input
		System.out.println("Двете получени думи са: " + split[0] + " и " + split[1]);
		// swap first 5 indexes
		if (split[0].length() < split[1].length()) {
			String swap = split[0];
			split[0] = split[1];
			split[1] = swap;
		}
		String bigFive = split[0].substring(0, 5);
		split[0] = split[1].substring(0, 5) + split[0].substring(5);
		split[1] = bigFive + split[1].substring(5);

		// print results
		System.out.println("Дължината на по-дългият низ е: " + split[0].length() + " и той изглежда по следния начин: "
				+ split[0]);
		System.out.println(
				"Дължината на по-късият низ е: " + split[1].length() + " и той изглежда по следния начин: " + split[1]);
		if (split[0].length() == split[1].length()) {
			System.out.println("Дължината на двата масива е еднаква и нейната стойност е: " + split[0].length()
					+ " и те изглеждат по следния начин: " + split[0] + " "+ split[1]);

		}
	}

}
