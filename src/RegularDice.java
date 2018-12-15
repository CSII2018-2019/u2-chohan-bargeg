
public class RegularDice {
	private int numberSides;
	private double roll;
	
	//establish a constructor
	public RegularDice() {
		setRoll(); 
	}
	
	public double setRoll () {
		double roll = (Math.random() * 6 +1);
		return roll;
	}
	public int getNumberSides() {
		return numberSides;
	}
	
	
	public String toString() {
		return "roll is: " + roll;
	}
	
}
