import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNumber = (int)(Math.random() * 101); //Random number from 0 to 100.
		//System.out.println(randomNumber); (to test the game).
		
		//Setting a maximum of 5 tries.
		int tries = 5;
		//Store initial number of tries
		int maxTries = tries;
		
		Scanner input = new Scanner(System.in);
        
		//Try/Catch block to catch InputMisMatchException.
	    try (input) {
	    	
	        System.out.println("Type in a random number from 0-100:");
			
	        //Saving user input in a Integer.
			int userInput = input.nextInt();
			
			//Remove 1 try at the start of the game.
			tries = tries - 1;
	    	
			//Loop until the correct number is guessed
			while (userInput != randomNumber ) {
				System.out.println("Wrong number, try again.");
				userInput = input.nextInt();
				tries--; //Removing a try each loop.
				//If tries are equal to 0, end the game and tell user the right number.
				if (tries == 0) {
					System.out.println("Game ended, you have 0 tries left.");
					System.out.println("The correct number was: "+randomNumber);
					return;
				}
			}
			
			//If user input equals the random number, game is won.
			if (userInput == randomNumber) {
				System.out.println("Correct number!!");
			}
			
			//Calculate the used tries by removing the remaining tries from the maxTries
			//Variable (5-the tries left)
			int usedTries = maxTries - tries;
			//Sysout to inform the user about how many tries were used.
			System.out.println("You used "+usedTries+" tries out of "+maxTries);
			
		} catch (InputMismatchException e) {
			//If input is not a number, it will inform the user.
			System.out.println("Please only use numbers.");
		}
	    
	}

}
