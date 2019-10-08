import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String fName = "";
		String lName = "";
		int birthYear;
		
	
		System.out.println("Welcome to Student registration");
		
		
		System.out.println("Enter first name");
		fName = sc.nextLine();
		
		System.out.println("Enter last name");
		lName = sc.nextLine();
		
		System.out.println("Enter Your Birthyear");
		birthYear = sc.nextInt();
		
		
		
		System.out.println("Your temporary password is: fName + "*" + birthYear");
	
	}

}
