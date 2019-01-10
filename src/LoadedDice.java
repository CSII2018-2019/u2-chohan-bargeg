
public class LoadedDice {
	private int numberSides;
	private int roll;
	//private double sum;
	public LoadedDice(int n) {
		numberSides = n; 
		setRoll();
	}
	
	public void setRoll () {
		int oddOrEven = (int) (Math.random() * 3) + 1;
		if (oddOrEven == 1) {
			roll = 1;
			
		}
		if (oddOrEven == 2) {
			roll = 2;
		}
		else if (oddOrEven ==3) {
			roll = 1;
		}
		
	}
	public int getRoll() {
		return roll;
	}
	//public double totalSum(double s) {
		//double sum = s; 
		//return sum;
		
	//}
	//public double getTotalSum() {
	//	return sum; 
	//}
	public String toString() {
		return "roll is: " + roll;
	}
		

}
