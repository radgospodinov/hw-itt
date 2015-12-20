package homework3;

public class Person {

	private String name;
	private int age;
	private boolean isMale;
	protected boolean isValid;

	public Person(String name, int age, boolean isMale) {
		this.isValid = true;
		if (name.length() > 1) {
			boolean isLetter = true;
			for (int i = 0; i < name.length(); i++) {
				if (!Character.isAlphabetic(name.charAt(i)) && !Character.isSpaceChar(name.charAt(i))) {
					isLetter = false;
					break;
				}
			}
			if (isLetter) {
				this.name = name;
			}
		} else {
			this.isValid = false;
		}
		if (age > 0) {
			this.age = age;
		} else {
			this.isValid = false;
		}
		this.isMale = isMale;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void showPersonInfo() {
		if (this.isValid) {
			System.out.println("Name: " + this.name);
			System.out.println("Age: " + this.age);
			System.out.println("Is male?: " + (this.isMale ? "Yes" : "No"));
		} else {
			System.out.println("Invalid Person");
		}
	}

}
