import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Примерът даден за изход е грешен в условието - 2000 е високосна!
		 * 
		 * Високосни години са всички години кратни на 4 с изключения
		 * столетията, но без столетия кратни на 400, т.е. 1900 не е високосна,
		 * но 1600 и 2000 са високосни. Съставете програма, която по дадени ден,
		 * месец, година отпечатва следващата дата. Входни данни: три числа за
		 * ден, месец, година. Пример: 28, 2, 2000 Изход: 1,3,2000
		 */

		Scanner sc = new Scanner(System.in);
		int d;
		int m;
		int y;
		int maxDniM = 31;
		boolean valid = false;
		do {
			System.out.println("Въведете ден, месец,година");
			d = sc.nextInt();
			m = sc.nextInt();
			y = sc.nextInt();
			if (y > 0) {
				if (m >= 1 && m <= 12) {
					if (m == 2) {
						maxDniM = 28;
						if (y % 4 == 0) {
							if (y % 100 != 0) {
								maxDniM = 29;
							} else if (y % 400 == 0) {
								maxDniM = 29;
							}
						}

					} else if (m == 4 || m == 6 || m == 9 || m == 11) {
						maxDniM = 30;

					} else {
						maxDniM = 31;
					}
					if (d > 0 && d <= maxDniM) {
						valid = true;
					}
				}
			}

		} while (!valid);

		d++;
		if (d > maxDniM) {
			d = 1;
			m++;
			if (m > 12) {
				m = 1;
				y++;
			}
		}
		System.out.println("Следващият ден е " + d + "," + m + "," + y);

	}
}
