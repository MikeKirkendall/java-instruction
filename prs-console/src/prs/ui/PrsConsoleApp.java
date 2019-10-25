package prs.ui;

import java.util.ArrayList;
import java.util.List;

import prs.db.*;
import prs.util.Console;

public class PrsConsoleApp {

	public static void main(String[] args) {

		Boolean exit = false;
		List<User> users = new ArrayList<>();
		String command = "";

		User u1 = new User(1, "mkirkendall", "pa55word", "Mike", "Kirkendall", "513-222-2222", "mkirk@gmail.com", true,
				false);
		User u2 = new User(2, "dthomas", "wendys", "Dave", "Thomas", "513-111-1111", "dthomas@gmail.com", false, false);
		User u3 = new User(3, "jjones", "dipset", "Jim", "Jones", "513-555-6666", "jjones@gmail.com", false, true);

		users.add(u1);
		users.add(u2);
		users.add(u3);

		System.out.println("Welcome to the PRS Console");
		displayMenu();
		while (!exit) {
			command = Console.getString("Enter Command: ");
			switch (command.toLowerCase()) {
			case "list":
			case "1":
				listUsers(users);
				break;
			case "get":
			case "2":
				User.getUserByName(users);
				break;
			case "add":
			case "3":
				User.addNewUser(users);
				break;
			case "edit":
			case "4":
				User.editUserEmail(users);
				break;
			case "delete":
			case "5":
				User.deleteUser(users);
				break;
			case "help":
			case "6":
				displayMenu();
				break;
			case "exit":
			case "7":
				exit = true;
				break;
			default:
				System.out.println("Invalid Entry. Please Try Again");
				break;
			}
		}

		System.out.println("Goodbye. Thank you for using the PRS Console");

	}

	private static void displayMenu() {
		String menu = "COMMAND MENU\n" + "\n1 - List Users" + "\n2 - Get a User" + "\n3 - Add a User"
				+ "\n4 - Edit a User" + "\n5 - Delete a User" + "\n6 - Help" + "\n7 - Exit";
		System.out.println(menu);

	}

	private static void listUsers(List<User> users) {
		for (User user : users) {
			System.out.println(user);
		}

	}

}
