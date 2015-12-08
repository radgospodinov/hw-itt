
public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Да се създаде метод, който отпечатва масив в конзолата.
	    
         int[] array = {1,5,17,23,37,47};
         printArr(array);
	}
    static void printArr(int[] arr) {
    	for(int i = 0 ; i<arr.length;i++) {
    		System.out.print((i==0 ? "[ " : ", ")+arr[i]);
    	}
    	System.out.println(" ]");
    }
}
