import java.util.Scanner;

public class GuessTheNumberApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("--------------------------");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("I'm thinking of a number from 1 to 100.\n" );
			System.out.println("Try to guess it");
			int randNum = generateRandomNumber();
			 System.out.println("nbr ="+randNum);
			// prompt for guess, compare to randNum, display output
			// continue until guess == randNumb
			 int guess = 0;
			 while (guess1=randNum) {
				 guess = getIntWithinRange();
			 }
			
			
			
			System.out.print("Try Again? (y/n):  ");
			
		}
		
		
		sc.close();
		System.out.println("BYE");
	}
	
	private static String getString(Scanner sc, String prompt) {
		String s = "";
		boolean isValid = false; //keep prompting until user enters y or n
		while(!isValid) {
			System.out.println(prompt);
			s = sc.nextLine();
			// check for empty string
			if (s.equalsIgnoreCase("")) {
				System.out.println("Error...entry is required");
				continue;
			}
			else if (!s.equalsIgnoreCase("y")|| !s.equalsIgnoreCase("n")) {
				System.out.println("Error...only 'y' or 'n' is accepted.");
				continue;
			}
		}
		
		isValid = true;
	}
	private static int generateRandomNumber() {
		int r = (int)(Math.random()*100)+1;
		return r;
	}

}
