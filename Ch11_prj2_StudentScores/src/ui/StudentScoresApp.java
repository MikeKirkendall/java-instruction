package ui;

import java.util.Arrays;

import business.Student;
import util.Console;

public class StudentScoresApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Student Scores App");
		
		int nbrOfStudents = Console.getInt("Number of Students: ", 0, 501);
		Student[] students = new Student[nbrOfStudents];
		for (int i =0; i < nbrOfStudents; i++){
			System.out.println("\nSTUDENT "+ (i+1));
		
			String ln = Console.getString("lastName: ");
			String fn = Console.getString("firstName: ");
			int s = Console.getInt("Score: " , -1, 101);
			Student student = new Student (fn, ln,s);
			students[i] = student;
		}	
		
		
		//biz login
		Arrays.parallelSort(students);
		
		System.out.println("\nSUMMARY");
		for (Student s: students) {
			System.out.println(s);
		}
		
		System.out.println("Bye");

	}

}
