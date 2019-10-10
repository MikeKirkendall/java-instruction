import java.util.Scanner;

public class TestingJavaApp {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		// Show welcome to my test java app
		System.out.println("Welcome to my Java App!");
	
		
		System.out.println("This will be fun");
		
		// while statement
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.println("Continue? (y/n):");
		choice = sc.next ();
		
				
			
			
		}

	}

}
