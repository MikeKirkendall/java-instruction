package ui;

import business.Stuffy;
import db.StuffyDB;
import util.Console;

public class StuffyDispenserApp {
	private static StuffyDB sdb = new StuffyDB();

	public static void main(String[] args) {
		System.out.println("Welcome to the Stuffy Dispenser App");

		int command = 0;
		while (command != 6) {
			command = Console.getInt(getMenu(), 0, 7);

			switch (command) {
			case 1:
				// list
				break;
			case 2:
				// get
				int id = Console.getInt("ID: ");
				Stuffy s = getStuffy(id);

				break;
			case 3:
				// add - prompt user for stuffy values
				String type = Console.getString("Type: ");
				String color = Console.getString("Color: ");
				String size = Console.getString("Size: ");
				int limbs = Console.getInt("Limbs: ");

				s = new Stuffy(type, color, size, limbs);
				int rowCount = sdb.add(s);
				System.out.println(rowCount + " rows affected.");
				break;
			case 4:
				// edit
				break;
			case 5:
				// delete
				break;
			case 6:
				// exit
				break;
			default:

				// Error
				System.out.println("Invalid Command!");
				break;
			}

		}
		System.out.println("Bye");
	}

	private static String getMenu() {
		String menu = "COMMAND MENU:\n" + "1 - List\n" + "2 - Get\n" + "3 - Add\n" + "4 - Edit\n" + "5 - Delete\n"
				+ "6 - Exit\n" + "ENTER COMMAND\n";
		

		return menu;
	}

	private static Stuffy getStuffy(int id) {
		id = Console.getInt("ID: ");
		Stuffy s = sdb.get(id);
		if (s != null) {
			System.out.println("Stuffy: ");
			System.out.println(s);
		} else {
			System.out.println("No stuffy exist for id: " + id);

		}
		return s;
	}

}
