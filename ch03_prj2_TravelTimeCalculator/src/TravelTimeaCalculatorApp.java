import java.util.Scanner;

public class TravelTimeaCalculatorApp {

	public static void main(String[] args) {
		// step 1
		System.out.println("Welcome to the Travel Time Calculator");
		
		// step 3 define scanner
		Scanner sc = new Scanner(System.in);
		
		// 5  set variable
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			// 
			System.out.println("Enter Miles: ");
			double miles = sc.nextDouble();
			System.out.println("Enter mph: ");
			double mph = sc.nextDouble();
			
			// 6 Business logic- compute Hours and Minutes
			double hours = miles/mph;
			int min = (int)(hours * 60);
			int hoursInt = min / 60;
			min %= 60;
			
			// display results
			
			System.out.println("Estimated Travel Time:");
			System.out.println(" ============");
			System.out.println("Hours:   "+hoursInt);
			System.out.println("Minutes: "+min);
			
			
			// 5 prompt to continue
						System.out.println("Continue?");
						choice = sc.next();
		}
		
		
		// step 4
		sc.close();
		//step 2
		System.out.println("Bye!");
		
	
	}

}
