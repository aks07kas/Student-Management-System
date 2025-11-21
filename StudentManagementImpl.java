package com.fusion.studentmanagementsystem.entity;

import java.util.ArrayList;
import java.util.ListIterator;

public class StudentManagementImpl implements StudentManagement {

	ArrayList<Student> student = new ArrayList<Student>();

	@Override
	public void addstudent(Student s) {
		if (student.add(s)) {
			System.out.println("Student has been added successfully...");
		} else {
			System.out.println("Failed...");
		}
	}

	@Override
	public void displayStudents() {
		for (Student s : student) {
			System.out.println(s.getId() + " " + s.getName() + " " + s.getAge());
		}
	}

	@Override
	public void removeStudent(int id) {
		boolean status = false;
		ListIterator<Student> ir = student.listIterator();
		while (ir.hasNext()) {
			Student s = ir.next();
			if (s.getId() == id) {
				ir.remove();
				status = true;
			}
		}
		if (status) {
			System.out.println("Student removed for ID " + id);
		} else {
			System.out.println("Student not found with ID " + id);
		}
	}

	@Override
	public void updateStudent(Student s) {
		boolean setstatus = false;
		ListIterator<Student> ir1 = student.listIterator();
		while (ir1.hasNext()) {
			Student s1 = ir1.next();
			if (s1.getId() == s.getId()) {
				s1.setName(s.getName());
				s1.setAge(s.getAge());
				setstatus = true;
			}
		}
		if (setstatus) {
			System.out.println("Student updated successfully");
		} else {
			System.out.println("Student not found");
		}
	}

	@Override
	public void searchStudent(int id) {
		boolean found = false;
		for (Student s : student) {
			if (s.getId() == id) {
				System.out.println("Student Found: ID=" + s.getId() + ", Name=" + s.getName() + ", Age=" + s.getAge());
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("No student found with ID: " + id);
		}
	}
}