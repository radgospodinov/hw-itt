
public class Task20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се състави програма, чрез която се извежда квадрат от цифри.
		// Сумите от елементите на произволен ред или стълб са равни на 45.

		// 1234567890
		// 2
		// 3
		// 4
		// 5
		// 6
		// 7
		// 8
		// 9
		// 0

		for (int r = 0; r < 10; r++) {

			for (int c = 0; c < 10; c++) {

				System.out.print((r + 1 + c) % 10 + " ");

			}
			System.out.println();
		}
	}

}
