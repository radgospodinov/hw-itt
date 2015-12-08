import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се състави програма, чрез която се въвежда изречение с отделни
		// думи.
		// Като резултат на екрана да се извежда същия текст, но всяка отделна
		// дума да започва с главна буква, а следващите я букви да са малки.
		// Пример: супер яката задача
		// Изход: Супер Яката Задача
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете изречение за трансформиране");
		String text = sc.nextLine();
		// String controlChars = "?!,. ";      - спец. случей...
		text = text.toUpperCase().charAt(0) + text.substring(1);
		for (int i = 1; i < text.length() - 1; i++) {
			// if(controlChars.indexOf(text.charAt(i-1))>=0 &&
			// controlChars.indexOf(text.charAt(i))<0) {

			// - да се разменят "иф"-овете в случеи, в които
			// искаме да повдигнем първата буква на всяка нова дума разделена 
			// с препинателни знаци или "спейс"
			if (text.charAt(i - 1) == ' ' && text.charAt(i) != ' ') {
				text = text.substring(0, i) + text.toUpperCase().charAt(i) + text.substring(i + 1);
			}

		}
		System.out.println(text);

	}

}