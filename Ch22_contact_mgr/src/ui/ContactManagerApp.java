package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import business.Contact;
import business.TestContact;
import util.Console;

public class ContactManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Customer Manager App");
		int command = 0;
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));

		while (command != 99) {
			command = Console.getInt(getMenu(), 0, 100);
			switch (command) {
			case 1:
				// list contacts
				System.out.println("List all contacts:");
				for (Contact c : contacts) {
					System.out.println(c);
				}
				break;

			case 2:
				// list contacts w/ no phone #
				System.out.println("Contacts missing phone #:");
				List<Contact> contactsWithoutPhone = filterContactsWithoutPhoneNumbers(contacts);
				for (Contact c : contactsWithoutPhone) {
					System.out.println(c);
				}
				break;
			case 3:
				System.out.println("Contacts missing email:");
				List<Contact> contactsWithoutEmail = filterContactsWithoutPhoneNumbers(contacts);
				for (Contact c : contactsWithoutEmail) {
					System.out.println(c);
				}
				break;
			case 4: 
				// Lambda: list contacts w/no phone #
				System.out.println("Contacts missing phone #:");
				contactsWithoutPhone = filterContacts(contacts,
									c -> c.getPhone()== null);
				for (Contact c : contactsWithoutPhone) {
					System.out.println(c);
				}
				break;
				
			case 5: 
				// Lambda: list contacts w/no email #
				System.out.println("Contacts missing email:");
				contactsWithoutEmail = filterContacts(contacts,
									c -> c.getEmail()== null);
				for (Contact c : contactsWithoutEmail) {
					System.out.println(c);
				}
				break;
				
			case 6: 
				// Lambda: list contacts named mike murach 
				System.out.println("Contacts named Mike Murach:");
				List<Contact>contactsMike = filterContacts(contacts,
									c -> c.getName().equals("Mike Murach"));
				for (Contact c : contactsMike) {
					System.out.println(c);
				}
				break;
				
				
			case 7: 
				// Lambda predicate: no phone 
				System.out.println("Lambda: Predicate: No Phone");
				contactsWithoutPhone = filterContacts2(contacts,
									c -> c.getPhone() == null);
				for (Contact c : contactsWithoutPhone) {
					System.out.println(c);
				}
				break;
				
			case 8: 
				System.out.println("Lambda: Consumer: Print name");
				processContacts(contacts, c -> System.out.println(c.getName()));
				break;
			
			case 9:
				System.out.println("Streams - list names for each contact missing phone");
				contacts.stream().filter(c-> c.getPhone() ==null).
									forEach(c->System.out.println(c.getName()));
				break;
				
			case 10:
				System.out.println("Map and reduce contacts to a single string");
				String csv = contacts.stream(). map(c -> c.getName()).
						reduce("", (a,b) -> a + b + ", ");
				csv = csv.substring(0,csv.length() -2);
				System.out.println("All contacts "+csv);
				

			}
		}

		System.out.println("Goodbye");

	}

	private static String getMenu() {
		String menu = "COMMAND MENU:\n" + 
						"1 - List Contacts\n" + 
						"2 - List Contacts with No phone number\n" + 
						"3 - List contacts with no email\n" + 
						"4 - Lambda: List Contacts with No Phone Number\n" + 
						"5 - Lambda: List Contacts with No Email Address\n"  +
						"6 - Lambda: Contacts named Mike\n" +
						"7 - Lambda Predicate: No Phone Contacts" +
						"8 - Lambda Consumer:Print names\n" +
						"9 - Stream of contact names w/ no phone\n" +
						"10 - Map and reduce names to a single string\n" +
						"99 - Exit\n" + "ENTER COMMAND\n";
		return menu;

	}

	public static List<Contact> filterContactsWithoutPhoneNumbers(List<Contact> contacts) {
		List<Contact> contactsWithoutPhone = new ArrayList<>();
		for (Contact c : contacts) {
			if (c.getPhone() == null) {
				contactsWithoutPhone.add(c);
			}
		}

		return contactsWithoutPhone;

	}

	public static List<Contact> filterContactsWithoutEmails(List<Contact> contacts) {
		List<Contact> contactsWithoutEmail = new ArrayList<>();
		for (Contact c : contacts) {
			if (c.getEmail() == null) {
				contactsWithoutEmail.add(c);
			}
		}
		return contactsWithoutEmail;
	}
	
	// make one method that can replace the above 2 methods
	public static List<Contact> filterContacts(List<Contact> contacts,
											TestContact condition){
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c : contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
	}
	
	public static List<Contact> filterContacts2(List<Contact> contacts,
			Predicate<Contact> condition){
			List<Contact> filteredContacts = new ArrayList<>();
				for (Contact c : contacts) {
				if (condition.test(c)) {
					filteredContacts.add(c);
}
}
				return filteredContacts;

}
	public static void processContacts(List<Contact> contacts,
							Consumer<Contact> consumer) {
			for (Contact c: contacts) {
				consumer.accept(c);
			}
		
	}
}
