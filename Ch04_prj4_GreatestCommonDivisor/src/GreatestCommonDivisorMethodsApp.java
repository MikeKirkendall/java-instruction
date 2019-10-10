import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.String;

public class GreatestCommonDivisorMethodsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Greatest Common Divisor App Methods");
		Scanner sc = new Scanner (System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			int y = getInt("enter number")
			System.out.println("Enter number (x - lesser): ");
			int x = sc.nextInt();
			// repeat steps 1 and 2 until x = 0
			while (x !=0) {
				// subtract x from y repeatedly until y< x.
				while (y >= x) {
					y -= x;
				}
				// swap the values of x and y
				int temp = x;
				x = y;
				y = temp;
			}
			System.out.println("Greatest common divisor is " +y);
			System.out.println("Continue? ");
			choice =sc.next();
		}


		
		sc.close();
		System.out.println("Bye!");
		
		private static int getInt(String prompt, Scanner scan) {
			boolean isValid = false;
			int i = 0;
			while (!isValid) {
				try {
				System.out.println(prompt);
				i = scan.nextInt();
				isValid = true;
			}
			catch (InputMismatchException ime) {
				System.out.println("Invalid entry. Try again.");
				scan.nextLine(); // discard input
				continue;
				
			}
			return i;
			
		}
	}

}
