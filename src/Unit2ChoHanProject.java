import javax.swing.JOptionPane;

public class Unit2ChoHanProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberLoop = 1; 
		int play1Wins = 0;
		int play2Wins = 0;
		for (int i=0; i < 10; i++) {
			int whichDie = (int) (Math.random () * 2) +1;
			if (whichDie == 1) {
				RegularDice dice1 = new RegularDice();
				RegularDice dice2 = new RegularDice();
				double totalRoll = dice1.getRoll() + dice2.getRoll();
				dice1.totalSum(dice1.getRoll() + dice2.getRoll());
	
				
			}
			else {
				LoadedDice dice1 = new LoadedDice(10);
				LoadedDice dice2 = new LoadedDice(10); 
				double totalRoll = dice1.getRoll() + dice2.getRoll();
				dice1.totalSum(dice1.getRoll() + dice2.getRoll());
			} 
			//start with randomizing the rolls 
			
			String choHan;
			if (sum %2 ==0) {
				choHan = "Han"; 
			}
			else {
				choHan = "Cho";
			}
		String playerGuess = JOptionPane.showInputDialog("Would you like to guess Cho or Han?");
		String opponentGuess = JOptionPane.showInputDialog("What is your guess opponent? Cho or Han?");
		if (playerGuess.equals(choHan)) {
			System.out.println("Congrats! You guessed right!");
			play1Wins ++;
		}
		if (opponentGuess.equals(choHan)) {
			System.out.println("Congrats! You guessed right!");
			play2Wins++;
		}
		System.out.println("The scores after the rounnd... Player 1 score:" + play1Wins + ". Player 2 score:" + play2Wins);
		
		
		
			
			
	}

}
}
