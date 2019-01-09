
public class RegularDice {
	private int numberSides;
	private double roll;
	private double sum; 
	
	//establish a constructor
	public RegularDice() {
		setRoll(); 
		numberSides = 6;
	}
	
	public double setRoll () {
		double roll = (Math.random() * 6 +1);
		return roll;
	}
	public double totalSum(double s) {
		double sum = s; 
		return sum;
		
	}
	
	public int getNumberSides() {
		return numberSides;
	}
	public double getRoll() {
		return roll;
	}
	public double getTotalSum() {
		return sum; 
	}
	
	
	public String toString() {
		return "roll is: " + roll + "and sum is" + sum;
	}
	
}
