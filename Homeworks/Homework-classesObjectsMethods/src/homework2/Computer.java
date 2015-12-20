package homework2;

public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory, String operationSystem,
			boolean isNotebook) {
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
		this.isNotebook = isNotebook;
	}

	int comperePrice(Computer c) {
		if (this.price > c.price) {
			return -1;
		} else if (this.price == c.price) {
			return 0;
		} else {
			return 1;
		}

	}

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
