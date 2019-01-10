import javax.swing.JOptionPane;

public class Unit2ChoHanProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberLoop = 1; 
		int play1Wins = 0;
		int play2Wins = 0;
		int totalRoll = 0;
		for (int i=1; i < 5; i++) {
			RegularDice dice1 = new RegularDice();
			RegularDice dice2 = new RegularDice(); 
			LoadedDice dice3 = new LoadedDice(10);
			LoadedDice dice4 = new LoadedDice(10); 
			int whichDie = (int) (Math.random () * 2) +1;
			if (whichDie == 1) {
				totalRoll = dice1.getRoll() + dice2.getRoll();
				//dice1.totalSum(dice1.getRoll() + dice2.getRoll());
	
				
			}
			else {
				totalRoll = dice3.getRoll() + dice4.getRoll();
				//dice1.totalSum(dice3.getRoll() + dice4.getRoll());
			} 
			//start with randomizing the rolls 
			
			String choHan;
			if (totalRoll %2 ==0) {
				choHan = "Cho"; 
			}
			else {
				choHan = "Han";
			}
		String playerGuess = JOptionPane.showInputDialog("Would you like to guess Cho or Han?");
		String opponentGuess = JOptionPane.showInputDialog("What is your guess opponent? Cho or Han?");
		if (playerGuess.equals(choHan)) {
			System.out.println("Player 1: Congrats! You guessed right!");
			play1Wins ++;
		}
		if (opponentGuess.equals(choHan)) {
			System.out.println("Player 2: Congrats! You guessed right!");
			play2Wins++;
		}
		System.out.println("The scores after round " + i + "... Player 1 score:" + play1Wins + ". Player 2 score:" + play2Wins);
		
		
		
			
			
	}

}
}
