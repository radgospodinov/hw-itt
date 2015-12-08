import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		// Да се състави програма, която по даден низ връща друг,
		// символите, на който са получени като към всеки код на символ
		// от ASCII таблицата е добавеното числото 5 и е записан
		// новополучения символ.
		// Пример :
		// Вход: Hello
		// Изход: Mjqqt

		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете низ");
		String str = sc.nextLine();
		
        System.out.println("Преобразуваният низ е: ");
		for (int i = 0; i < str.length(); i++) {
			System.out.print((char)(str.charAt(i) + 5));
		}
		System.out.println();

	}

}
