
public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се състави програма, която извежда всички естествени трицифрени
		// числа, които нямат еднакви цифри т.е. 100,101, 606 и т.н. не се
		// извеждат.
		boolean purvo = true;
		for (int a1 = 1; a1 <= 9; a1++) {
			for (int a2 = 0; a2 <= 9; a2++) {
				if (a1 == a2) {
					continue;
				}
				for (int a3 = 0; a3 <= 9; a3++) {
					if (a1 == a3 || a2 == a3) {
						continue;
					}
					if (purvo) {
						purvo = false;
					} else {
						System.out.print(",");
					}
					System.out.print("" + a1 + a2 + a3);

				}
				System.out.println();
				purvo = true;
			}
		}
		System.out.println();
		purvo = true;
	}

}
