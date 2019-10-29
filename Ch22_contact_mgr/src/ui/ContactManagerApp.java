package ui;
import java.util.ArrayList;
import java.util.List;

import business.Contact;
import util.Console;

public class ContactManagerApp {
	
	

	public static void main(String[] args) {
		System.out.println("Welcome to the Customer Manager App");
		int command = 0;
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, "null"));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", "null"));
		
		while (command!=9) {
	 		command = Console.getInt(getMenu(),0, 10);
	 		switch (command) {
	 		case 1:
	 			//list contacts
	 			System.out.println("List all contacts:");
	 			for (Contact c: contacts) {
	 				System.out.println(c);
	 			}
	 			break;
	 			
	 		case 2:
	 			//list contacts w/ no phone #
	 			System.out.println("Cntacts missing phone #:");
	 			break;
	 		case 3:
	 			System.out.println("Contacts missing email");
	 			break;
	 			
	 			
	 		}		
		}
		
		System.out.println("Goodbye");

	}
	

private static String getMenu() {
	String menu = "COMMAND MENU:\n" + "1 - List Contacts\n" + "2 - List Contacts with No phone number\n" + "3 - List contacts with no email\n" + "4 - " + "9 - Delete\n"
			+ "9 - Exit\n" + "ENTER COMMAND\n";
	return menu;
	
}

}
