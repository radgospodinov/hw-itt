
public abstract class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Напишете програма, която създава масив с 10 елемента и инициализира
		// всеки от елементите със стойност, равна на индекса на елемента,
		// умножен по 3. Да се изведат елементите на екрана.

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 3;
		}

		for (int i = 0; i < arr.length; i++) {

			System.out.print((i == 0 ? "[ " : ", ") + arr[i]);

		}
		System.out.println(" ]");
	}

}
