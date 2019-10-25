package prs.db;

import java.util.List;

import prs.util.Console;

public class User {
	private int id;
	private String userName;
	private String passWord;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private boolean isReviewer;
	private boolean isAdmin;

	public User() {
		super();
	}

	public User(int id, String userName, String passWord, String firstName, String lastName, String phoneNumber,
			String email, boolean isReviewer, boolean isAdmin) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.isReviewer = isReviewer;
		this.isAdmin = isAdmin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isReviewer() {
		return isReviewer;
	}

	public void setReviewer(boolean isReviewer) {
		this.isReviewer = isReviewer;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public static User getUserByName(List<User> users) {
		// declare Variables
		String input = "";
		boolean found = false;
		boolean validName = false;
		String fName = "";
		String lName = "";
		String[] splitName;

		while (!validName) {
			input = Console.getString("\nEnter the User's First and Last Name: ");
			splitName = splitName(input);
			if (splitName.length == 2) {
				fName = splitName[0];
				lName = splitName[1];
				validName = true;

			} else {
				System.out.println("Invalid entry. Please enter a valid name.\n");
			}

		}
		for (User user : users) {
			if (user.getFirstName().equalsIgnoreCase(fName) && user.getLastName().equalsIgnoreCase(lName)) {
				found = true;
				System.out.println(user.getFirstName() + " " + user.getLastName() + "Found");
				return user;
			}
		}
		if (!found) {
			System.out.println("No user found. Please Retry");
		}
		return null;
	}

	private static String[] splitName(String name) {
		name.trim();
		String[] splitName = name.split(" ");
		return splitName;
	}

	public static void addNewUser(List<User> users) {

		int id = users.size() + 1;
		String uName = "";
		String pwd = "";
		String fName = "";
		String lName = "";
		String phone = "";
		String email = "";
		String input = "";
		Boolean isReviewer = false;
		Boolean isAdmin = false;
		Boolean validR = false;
		Boolean validA = false;

		System.out.println("Add new user: ");
		uName = Console.getString("\tUsername: ");
		pwd = Console.getString("\tPassword: ");
		fName = Console.getString("\tFirst Name: ");
		lName = Console.getString("\tLast Name: ");
		phone = Console.getString("\tPhone Number: ");
		email = Console.getString("\tEmail: ");

		while (!validR) {
			input = Console.getString("\tIs User a reviewer?: ");
			switch (input.toLowerCase()) {
			case "y":
			case "yes":
				isReviewer = true;
				validR = true;
				break;
			case "n":
			case "no":
				isReviewer = false;
				validR = true;
			}

		}

		while (!validA) {
			input = Console.getString("\tIs User Admin?: ");
			switch (input.toLowerCase()) {
			case "y":
			case "yes":
				isAdmin = true;
				validA = true;
				break;
			case "n":
			case "no":
				isAdmin = false;
				validA = false;
			default:
				System.out.println("Invalid. Please enter Yes (Y) or No (N).");
			}
		}
		User newUser = new User(id, uName, pwd, fName, lName, phone, email, isReviewer, isAdmin);
		users.add(newUser);
		System.out.println("\n nUser " + newUser.getUserName() + " has been added");

	}

	public static void editUserEmail(List<User> users) {
		User user = getUserByName(users);
		user.setEmail(Console.getString("Enter New Email: "));
	}

	public static void deleteUser(List<User> users) {
		User user = getUserByName(users);
		users.remove(user);
		System.out.println("User Removed");
	}

	@Override
	public String toString() {
		return "UserID: " + id + ", Username: " + userName + ", Password: " + passWord + ", First Name:" + firstName
				+ ", Last Name: " + lastName + ", Phone number: " + phoneNumber + ", Email: " + email
				+ ", Is Reviewer: " + isReviewer + ", Is Admin: " + isAdmin;
	}

}
