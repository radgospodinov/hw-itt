import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се въведе число, след което да се създаде масив с 10 елемента по
		// следния начин: Първите 2 елемента на масива са въведеното число.
		// Всеки следващ елемент на масива е равен на сбора от предишните 2
		// елемента в масива.
		// След това изведете масива

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число , което ще бъде стойност на първите два елемента от масива");
		int x = sc.nextInt();

		int[] arr = new int[10];
		arr[0] = x;
		arr[1] = x;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i == 0 ? "[ " : ", ") + arr[i]);
		}
		System.out.println(" ]");
	}

}
