import java.util.Scanner;

public class GreatestCommonDivisorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Greatest Common Divisor App");
		Scanner sc = new Scanner (System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter number (y - greater): ");
			int y = sc.nextInt();
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
	}

}
