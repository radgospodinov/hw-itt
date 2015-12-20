package homework1;

public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
	}

	void useMemory(double memory) {
		if (freeMemory < memory) {
			System.out.println("Not enough free memory!");
		} else {
			freeMemory -= memory;
		}
	}

	String getDescription() {
		StringBuilder sb = new StringBuilder();
		sb.append("Year = " + year + "\n");
		sb.append("Price = " + price + "\n");
		sb.append("Is Notebook = " + (isNotebook ? "Yes" : "No") + "\n");
		sb.append("HardDisk Memory  = " + hardDiskMemory + "\n");
		sb.append("Free Memory = " + freeMemory + "\n");
		sb.append("Operation System = " + operationSystem);

		return sb.toString();
	}

}
