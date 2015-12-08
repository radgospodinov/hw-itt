import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се състави програма, която чете набор от думи разделени с
		// интервал.
		// Като резултат да се извеждат броя на въведените думи, както и броя
		// знаци в най-дългата дума.
		// Пример: asd fg hjkl
		// Изход: 3 думи, най-дългата е с 4 символа.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете случаен текст");
		String text = sc.nextLine();
		String[] split = text.split(" ");		
		int max = 0;
		for(int i = 0;i<split.length;i++) {
			if(split[i].length()>max) {
				max = split[i].length();
			}
		}
		System.out.println(""+ (split.length) + " думи, най-дългата е с " + max + " символа.");		
		
	}

}
