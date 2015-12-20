package homework2;

public class ComputerDemo {

	public static void main(String[] args) {
		
		// ^^^ Task from 7/12/2015 ^^^
		
//		Computer HP15 = new Computer();
//		HP15.year = 2007;
//		HP15.price = 200.50;
//		HP15.isNotebook = true;
//		HP15.hardDiskMemory = 500_000;
//		HP15.freeMemory = 280_000.48;
//		HP15.operationSystem = "Windows XP";
//		Computer PC1 = new Computer();
//		PC1.year = 2012;
//		PC1.price = 845.70;
//		PC1.isNotebook = false;
//		PC1.hardDiskMemory = 3_000_000;
//		PC1.freeMemory = 560_500.17;
//		PC1.operationSystem = "Windows 7 Pro";
//
//		HP15.useMemory(100);
//		PC1.changeOperationSystem("Windows 8.1 Pro");
//
//		System.out.println("HP15:");
//		System.out.println(HP15.getDescription());
//		System.out.println();
//		System.out.println("PC1: ");
//		System.out.println(PC1.getDescription());
		
		// ^^^ Task from 7/12/2015 ^^^
		
		Computer comp1 = new Computer(2005,250.50,500_000,250_000);
		Computer comp2 = new Computer(2014,550,1_000_000,500_000,"Win 7", false);
		Computer comp3 = new Computer(2015,1_200,750_000,150_000);
		
		if(comp1.comperePrice(comp2)==-1) {
			System.out.println("comp1 price is higher than comp2 price");
		} else if(comp1.comperePrice(comp2)==1){
		        System.out.println("comp1 price is lower than comp2 price");	
		} else {
			System.out.println("both computers have same price");
		}
		
		
		
	}

}
