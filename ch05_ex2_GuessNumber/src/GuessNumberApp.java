import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumberApp {
    
    private static void displayWelcome(int limit) {
        System.out.println("Guess the number!");
        System.out.println("I'm thinking of a number from 1 to " + limit);
        System.out.println();
    }
    
    public static int getRandomInt(int limit) {
        double d = Math.random() * limit;   // d is >= 0.0 and < limit
        int randomInt = (int) d;            // convert double to int
        randomInt++;                        // int is >= 1 and <= limit
        return randomInt;
    }

    public static void main(String[] args) {
        final int LIMIT = 10;
        
        displayWelcome(LIMIT);
        int number = getRandomInt(LIMIT);

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);            
        int count = 1;
        int guess = 0;
        while (true) {
        	/*try {
            System.out.print("Your guess: ");
            guess = sc.nextInt();
        	}
            catch (InputMismatchException e) {
            	System.out.println("Error Please Enter a Valid Integer: ");
            	 sc.nextInt();
            	 continue;
            }
           */
            System.out.print("Your guess: ");
        	if (sc.hasNextInt()) {
                guess = sc.nextInt();
                sc.hasNextLine();
            	}
        	else  {
                	System.out.println("Error Please Enter a Valid Integer: ");
                	 sc.nextInt();
                	 continue;
                }
            
            if (guess < 1 || guess > LIMIT) {
                System.out.println("Invalid guess. Try again.");
                continue;
            }
            
            if (guess < number) {
                System.out.println("Too low.");
            } else if (guess > number) {
                System.out.println("Too high.");
            } else {
                System.out.println("You guessed it in " + 
                                   count + " tries.\n");
                break;
            }            
            count++;
        }
        System.out.println("Bye!");
    }   
}