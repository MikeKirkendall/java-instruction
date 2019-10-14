package ch05_prj_GuessingGame;
import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
	/* Project 5-3: Guessing Game
     * Create an application that lets a user guess a number between 1 and 100.
     * 
     * SPECIFICATIONS
     * - If the user’s guess is higher than the random number, the application 
     * should display, “Too high!”
     * - If the user’s guess is lower than the random number, the application 
     * should display, “Too low!”
     * - If the user’s guess is more than 10 higher or 10 lower than the random 
     * number, the application should display, “Way too high!” or “Way too low!”
     * - The message that’s displayed when the user gets the number should vary 
     * depending on the number of guesses. For example:
     * - Number of guesses  Message
     *   =================  =======
     *   <=3                 Great work! You are a mathematical wizard.
     *   >3 and <=7       Not too bad! You've got some potential.
     *   >7              What took you so long? Maybe you should take some lessons.
     * - When the user guesses a number, the application should only accept 
     * numbers from 1 to 100.
     * - When the user responds to the “Try Again?” prompt, the application 
     * should only accept a value of “y” or “n”.
     * - If the user enters invalid data, the application should display an 
     * appropriate error message and prompt the user again until the user enters valid data.
     * - The code that’s used to validate data should be stored in separate methods. For example:
     *      public static double getDoubleWithinRange(Scanner sc, String prompt, 
     *          double min, double max)
     *      public static int getIntWithinRange(Scanner sc, String prompt,
     *          int min, int max)
     * - The code that’s used to run the application should also be stored in separate methods.
     * - Use the random() method of the java.lang.Math class to generate a random number.
     */
			// declare variables
		
			String cont = "Y";
			Scanner sc = new Scanner(System.in);
			
			// welcome user
			System.out.println("Welcome to the Guessing Game");
			
	
			// BEGIN LOOP
			while (cont.equalsIgnoreCase("y")) {
				
			
				// Prompt user to enter number (sep method)
			
					// being loop data validation number from 1-100 (sep method) track number of tries
					// Begin Loop
						// Evaluate if number too high, too low > 10, way too high > 10 way too low (sep method)
	
					// Tell user how many tries it took and give them a feedback message
	
				// prompt user to try again (sep method) - data validation only y or n (sep method)
	
			// END LOOP
			}
			//Good Bye message
	
			// close scanner
		
		
	}

	private static int getNumberFromUser(Scanner sc) { 
		boolean isValid = false;
		int guess = 0;
	
		System.out.println("I'm thinking of a Number from 1 to 100:");
		System.out.println("Try to Guess what it is\n");
		
	
		
			
			
		while (!isValid){
			System.out.print("Enter Number: ");
		
			if (sc.hasNextInt()) {
			guess = sc.nextLine();
			isValid = true;
			continue;
		}
			else {
				System.out.println("ERROR: Invalid Entry Please Try Again.");
				sc.nextLine();
			}
		}
		return guess;
	}
}
