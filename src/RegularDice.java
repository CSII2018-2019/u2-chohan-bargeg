
public class RegularDice {
	private int numberSides;
	private int roll;
	
	//establish a constructor
	public RegularDice() {
		setRoll(); 
		numberSides = 6;
	}
	
	public void setRoll () {
		roll = (int) (Math.random() * 6) + 1;
		
	}
	//public double totalSum(double s) {
		//double sum = s; 
		//return sum;
		
	//}
	
	public int getNumberSides() {
		return numberSides;
	}
	public int getRoll() {
		return roll;
	}
	//public double getTotalSum() {
		//return sum; 
	//}//
	
	
	public String toString() {
		return "roll is: " + roll;
	}
	
}
