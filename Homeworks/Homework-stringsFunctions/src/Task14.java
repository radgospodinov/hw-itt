import java.util.Scanner;



public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се състави метод, който приема за стойност число N и връща
		// стойността на N! (N факториел).
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число");
		int x = sc.nextInt();
		// факториел е много бързо прогресираща функция и с число над 19 препълва инт-а
		// ако ползваме лонг ,обаче ще спечелим съвсем малко от горе
		
      	System.out.println("Факториел от числото е: " + fact(x));
      	
      	System.out.println("Факториел от числото изчислено с рекурсия е: " + factRec(x));
		
	}
	        static int fact(int n) {
	        	int f = 1; 
	        	for(int i = 2;i<=n;i++) {
	        		f = f*i;
	        	}
	        		return f;
	        	
	        }
	        static int factRec(int n) {
	        	if (n==1) {
	        		return 1;
	        	}
	        	return n=n*factRec(n-1);
	        }
	
	

}
