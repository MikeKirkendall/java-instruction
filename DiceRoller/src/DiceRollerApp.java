import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		
		/* Project 5-1: Dice Roller
         * Create an application that rolls a pair of six-sided dice.
         * 
         * SPECIFICATIONS
         * You can use the random method of the Math class to generate a random 
         * number for a die like this:
         * (int) (Math.random() * 6) + 1;
         * The application should display special messages for two ones 
         * (snake eyes) and two sixes (box cars).
         * The application should use static methods to organize its code.
         * The application should continue only if the user enters 
         * “y” or “Y” at the “Roll again?” prompt.
         */
		
		//declare variables
		int die1 = 0;
		int die2 = 0;
		Scanner sc = new Scanner(System.in);
		String cont = "";
		
		// welcome user to application
		System.out.println("Dice Roller");
		
		// prompt user to roll dice
		System.out.println("Roll the Dice? (y/n): ");
		cont = sc.next();
		
		//begin a loop
		while (cont.equalsIgnoreCase("y")){
			// roll dice - separate method
			rollDice();
			die1 = rollDice();
			die2 = rollDice();
			System.out.println("Die 1: "+ die1);
			System.out.println("Die 2: "+ die2);
		
			// check for snake eyes and box cars - separate method
			printTotal(die1,die2);
		
			// ask if roll again - sep method
			
			cont = rollAgain(sc);
	
		// ending loop
		}
		
		// print bye message
		System.out.println("Bye. Thank You for Using");
		
		// close scanner
			sc.close();
		

	}
	private static int rollDice() {
		int roll = (int)(Math.random() *6) +1;
		return roll;
	}
		//print total
	private static void printTotal (int die1, int die2) {
		int total = die1 + die2;
		System.out.println("Total: "+ total);
		
		// check for special roll
		if (die1 == 1 && die2 == 1) {
			System.out.println("Snake eyes!");
		}
			else if  (die1 == 6 && die2 == 6) {
			System.out.println("Boxcars!");
		}
	}
	
	
	private static String rollAgain(Scanner sc) {
		System.out.println("Roll the Dice? (y/n): ");
		String cont = sc.next();
		
		return cont;
	}
	}
