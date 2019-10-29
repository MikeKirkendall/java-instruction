package ui;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import business.Actor;
import business.Movie;
import db.ActorDB;
import db.MovieDB;
import util.Console;

public class BMDBConsoleApp {

	private static MovieDB movieDB = new MovieDB();
	private static ActorDB actorDB = new ActorDB();

	public static void main(String[] args) {
		System.out.println("Welcome to the bmdb Console App\n");

		int choice = 0;

		while (choice != 99) {
			choice = Console.getInt(getMenu(), 0, 100);
			switch (choice) {
			case 1:
				// list movies
				List<Movie> movies = movieDB.list();
				for (Movie m : movies) {
					System.out.println(m);
				}
				break;
			case 2:
				// list actors
				List<Actor> actors = actorDB.list();
				for (Actor a : actors) {
					System.out.println(a);
				}
				break;

			case 3:
				// add movie
				System.out.println("Add a movie: ");
				String t = Console.getString("Title?: ");
				int y = Console.getInt("Year?: ");
				String r = Console.getString("Rating?: ");
				String d = Console.getString("Director?: ");
				Movie m = new Movie(t, r, y, d);
				int rc = movieDB.add(m);
				if (rc == 1) {
					System.out.println("Movie added successfully");
				} else {
					System.out.println("Error adding movie..check logs");
				}
				break;
			case 4:
				// update movie
				m = getMovie();
				if (m != null) {
					int year = Console.getInt("New year? ");
					m.setYear(year);
					rc = movieDB.update(m);
					if (rc == 1) {
						System.out.println("Movie updated successfully!");
					} else {
						System.out.println("Error updating movie year");
					}

				}

				break;
			case 5:
				// delete movie
				m = getMovie();
				if (m != null) {
					rc = movieDB.delete(m);
					if (rc == 1) {
						System.out.println("Movie deleted successfully!");
					} else {
						System.out.println("Error.. movie id doesnt exist.");
					}

				}

				break;
			case 6:
				m = getMovie();
				if (m != null) {
					System.out.println("Movie: ");
					System.out.println(m);

				}
				break;
			case 99:
				// exit
				break;

			default:
				System.out.println("Invalid Command.");
			}
		}

		System.out.println("Bye");

	}

	private static String getMenu() {
		String menu = "COMMAND MENU:\n" + "1 - List Movie\n" + "2 - List Actors\n" + "3 - Add Movie\n"
				+ "4 - Edit Movie\n" + "5 - Delete Movie\n" + "6 - Get Movie\n" + "99 - Exit\n" + "ENTER COMMAND\n";

		return menu;

	}

	private static Movie getMovie() {
		int id = Console.getInt("Id? ", 0, Integer.MAX_VALUE);
		Movie m = movieDB.get(id);
		return m;
	}

}
