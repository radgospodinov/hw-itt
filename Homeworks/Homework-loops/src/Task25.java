import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се направи програма, която по дадено число N, да изчислява N!,
		// т.е. 1*2*3*4...*N.
		// Използвайте цикъл do-while

		Scanner sc = new Scanner(System.in);
		int N;
		do {
			System.out.println("Моля въведете число от 1 до 20");
			// защото факториел е много бързо растяща функция и 21! препълва
			// "long" променлива.
			// може да се използва и "double" , но и тя ще бъде препълнена при
			// големи стойности (по-големи от около 170) на N
			N = sc.nextInt();
		} while (N > 20 || N < 1);
		long mult = 1;
		int i = 1;

		do {
			mult = mult * i++;
		} while (i <= N);

		System.out.println("N! = " + mult);
	}

}
