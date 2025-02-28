
public class Cat extends Animal {

	private String name;
	private int countLives;

	public Cat(int weight, int height, String name, int countLives) {
		super(weight, height);
		setName(name);
		setCountLives(countLives);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCountLives() {
		return countLives;
	}

	public void setCountLives(int countLives) {
		if (countLives < 0) {
			System.out.println("Warning: Lives cannot be negative. Setting to 0.");
			this.countLives = 0;
		} else if (countLives > 9) {
			System.out.println("Warning: Cats cannot have more than 9 lives. Setting to 9.");
			this.countLives = 9;
		} else {
			this.countLives = countLives;
		}
	}

	public String toString() {
		String result;
		if (countLives > 0) {
			result = name + " is a cat with " + countLives + " lives remaining, " + super.toString();
		} else {
			result = name + " is a cat that has no more lives left, " + super.toString();
		}
		return result;
	}
}