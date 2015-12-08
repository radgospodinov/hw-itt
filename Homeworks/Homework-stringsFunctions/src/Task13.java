import java.util.Arrays;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Да се създаде метод, който приема два масива от числа и връща
//		масив, съдържащ всички елементи на подадените масиви, като в
//		първата част на масива са елементите на първия подаден масив,
//		а във втората част – тези на втория подаден масив.
		
		int[] array1 ={2,4,6,8,10};
		int[] array2= {3,5,7,9};
	   printArr(arrBuilder(array1,array2));
		
	}
    static int[] arrBuilder(int[] arr1,int[] arr2) {
    	int[] arr3 = new int[arr1.length+arr2.length];
    	for(int i = 0;i<arr1.length;i++) {
    		arr3[i]=arr1[i];
    	}
    	for(int i =0;i<arr2.length;i++) {
    		arr3[arr1.length+i]= arr2[i];
    	}
    		
    	return arr3;
    }
    // Копирам си метода от задача 11 за улеснение с принтирането
    static void printArr(int[] arr) {
    	for(int i = 0 ; i<arr.length;i++) {
    		System.out.print((i==0 ? "[ " : ", ")+arr[i]);
    	}
    	System.out.println(" ]");
    }
}
