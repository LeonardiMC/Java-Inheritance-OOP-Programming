
public class Bird extends Animal{
	
	private double wingspan;
	private boolean canFly;
	
	
	public Bird(int weight, int height, double wingspan, boolean canFly) {
		super(weight, height);
		setWingspan(wingspan);
		setCanFly(canFly);
		
	}


	public double getWingspan() {
		return wingspan;
	}


	public void setWingspan(double wingspan) {
		this.wingspan = wingspan;
	}


	public boolean isCanFly() {
		return canFly;
	}


	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	
	public String toString() {
		//String result;
		
		return "This bird has a wingspan of " + wingspan + " and "  +
		(canFly ? "can fly" : "cannot fly") + ", " + super.toString();
	}
	
	

	








}// Ends class
