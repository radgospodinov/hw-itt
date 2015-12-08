import java.util.Arrays;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се създаде метод, който приема за входни данни число N и
		// връща масив от числа с дължина N, който съдържа всички числа
		// от 1 до N.
		
		
		int x = 14;
		printArr(arrOneToN(x));
	}

	static int[] arrOneToN(int n) {
		int[] arr = new int[n];
		for(int i =0;i<arr.length;i++ ) {
			arr[i] = i+1;
		}
		return arr;
	}
	// Копирам си метода от задача 11 за улеснение с принтирането
    static void printArr(int[] arr) {
    	for(int i = 0 ; i<arr.length;i++) {
    		System.out.print((i==0 ? "[ " : ", ")+arr[i]);
    	}
    	System.out.println(" ]");
    }
}
