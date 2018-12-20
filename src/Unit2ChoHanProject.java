
public class Unit2ChoHanProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberLoop = 1; 
		int compWins = 0;
		int playWins = 0;
		for (int i=0; i < 10; i++) {
			int whichDie = (int) (Math.random () * 2) +1;
			if (whichDie == 1) {
				RegularDice dice1 = new RegularDice();
				RegularDice dice2 = new RegularDice();
				
			}
			else {
				LoadedDice dice1 = new LoadedDice();
				LoadedDice dice2 = new LoadedDice();
			}
			int totalRoll = dice1.getRoll() + dice2.getRoll(); 
			//start with randomizing the rolls 
			int dieRoll = (int)(Math.random() * 6) + 1;
			int playerRoll = (int)(Math.random() * 6) + 1;
	}

}
