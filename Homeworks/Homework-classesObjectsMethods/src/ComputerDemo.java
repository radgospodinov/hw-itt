
public class ComputerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer HP15 = new Computer();
		HP15.year = 2007;
		HP15.price = 200.50;
		HP15.isNotebook = true;
		HP15.hardDiskMemory = 500_000;
		HP15.freeMemory = 280_000.48;
		HP15.operationSystem = "Windows XP";
		Computer PC1 = new Computer();
		PC1.year = 2012;
		PC1.price = 845.70;
		PC1.isNotebook = false;
		PC1.hardDiskMemory = 3_000_000;
		PC1.freeMemory = 560_500.17;
		PC1.operationSystem = "Windows 7 Pro";

		HP15.useMemory(100);
		PC1.changeOperationSystem("Windows 8.1 Pro");

		System.out.println("HP15:");
		System.out.println(HP15.getDescription());
		System.out.println();
		System.out.println("PC1: ");
		System.out.println(PC1.getDescription());
	}

}
