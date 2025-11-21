package com.fusion.studentmanagementsystem.MainApp;

import java.util.Scanner;
import com.fusion.studentmanagementsystem.entity.Student;
import com.fusion.studentmanagementsystem.entity.StudentManagementImpl;

public class Main {

	public static void main(String[] args) {
		StudentManagementImpl smi = new StudentManagementImpl();
		Scanner scan = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("========= Student Management System =========");
			System.out.println("Enter 1 to Add Student");
			System.out.println("Enter 2 to Display All Students");
			System.out.println("Enter 3 to Remove a Student");
			System.out.println("Enter 4 to Update a Student");
			System.out.println("Enter 5 to Search Student by ID");
			System.out.println("Enter 6 to Exit");
			System.out.print("Enter your choice: ");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter ID: ");
				int id = scan.nextInt();
				System.out.print("Enter Name: ");
				String name = scan.next();
				System.out.print("Enter Age: ");
				int age = scan.nextInt();
				Student s = new Student(name, age, id);
				smi.addstudent(s);
				break;

			case 2:
				smi.displayStudents();
				break;

			case 3:
				System.out.print("Enter ID to remove student: ");
				int idToRemove = scan.nextInt();
				smi.removeStudent(idToRemove);
				break;

			case 4:
				System.out.print("Enter ID to update: ");
				int id1 = scan.nextInt();
				System.out.print("Enter New Name: ");
				String name1 = scan.next();
				System.out.print("Enter New Age: ");
				int age1 = scan.nextInt();
				Student s1 = new Student(name1, age1, id1);
				smi.updateStudent(s1);
				break;

			case 5:
				System.out.print("Enter ID to search student: ");
				int idToSearch = scan.nextInt();
				smi.searchStudent(idToSearch);
				break;

			case 6:
				System.out.println("Thank you for using Student Management System!");
				break;

			default:
				System.out.println("Invalid choice! Please enter a valid option.");
			}
		} while (choice != 6);

		scan.close();
	}
}