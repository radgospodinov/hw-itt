import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Напишете програма, която първо чете 2 масива и после извежда
		// съобщение дали са еднакви, и дали са с еднакъв размер.

		Scanner sc = new Scanner(System.in);

		int l1;
		int l2;
		do {
			System.out.println("Въведете дължина на масив 1: ");
			l1 = sc.nextInt();
		} while (l1 < 1);
		do {
			System.out.println("Въведете дължина на масив 2: ");
			l2 = sc.nextInt();
		} while (l2 < 1);
		int[] arr1 = new int[l1];
		int[] arr2 = new int[l2];

		for (int i = 0; i < arr1.length; i++) {
			System.out.print("Въведете стойност на елемент " + (i + 1) + " на първият масив: ");
			arr1[i] = sc.nextInt();
		}
		System.out.println();

		for (int i = 0; i < arr2.length; i++) {
			System.out.print("Въведете стойност на елемент " + (i + 1) + " на вторият масив: ");
			arr2[i] = sc.nextInt();
		}
		System.out.println();

		if (l1 != l2) {
			System.out.println("Масивите не са еднакви,размерът им е различен!");
		} else {
			boolean ravni = true;
			System.out.print("Масивите са с еднакъв размер и ");
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					ravni = false;
					break;
				}
			}
			System.out.print(ravni ? "двата масива са еднакви!" : "масивите НЕ са еднакви!");
		}

	}

}
