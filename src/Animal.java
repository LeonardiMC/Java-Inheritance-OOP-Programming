
public class Animal extends Object {     //Universal Super Class
	
	private int weight;
	private int height;
	
	public Animal (int weight, int height) {
		super();
		setWeight(weight);
		setHeight(height);
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String toString() {
		String result;
		result = "weighs " + weight + " pounds and is " + height + " inches tall.";
		return result;
	}
}
