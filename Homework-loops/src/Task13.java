import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се състави програма, която извежда всички естествени трицифрени
		// числа, които имат сбор на цифрите равен на дадено число. Дадено :
		// sum, където 2>=sum<=27. Пример: 26 Изход: 899, 989, 998.

		Scanner sc = new Scanner(System.in);
		int sum;
		boolean purvo = true;
		do {
			System.out.println("Въведете число между 2 и 27");
			sum = sc.nextInt();
		} while (sum < 2 || sum > 27);

		for (int a1 = 1; a1 <= 9; a1++) {
			for (int a2 = 0; a2 <= 9; a2++) {
				for (int a3 = 0; a3 <= 9; a3++) {
					if (a1 + a2 + a3 == sum) {
						if (purvo) {
							purvo = false;
						} else {
							System.out.print(",");
						}
						System.out.print("" + a1 + a2 + a3);
					}

				}
			}
		}
	}

}
