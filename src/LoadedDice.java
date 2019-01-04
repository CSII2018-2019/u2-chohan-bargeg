
public class LoadedDice {
	private int numberSides;
	private double roll;
	public LoadedDice(int n) {
		numberSides = n; 
		setRoll();
	}
	
	public double setRoll () {
		double oddOrEven = (Math.random() * 3 +1);
		if (oddOrEven == 1) {
			double roll = 1;
			
		}
		if (oddOrEven == 2) {
			double roll = 2;
		}
		else if (oddOrEven ==3) {
			double roll = 1;
		}
		
		return roll;
	}
	public double getRoll() {
		return roll;
	}
		

}
