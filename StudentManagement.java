package com.fusion.studentmanagementsystem.entity;

public interface StudentManagement {
	//add student
	void addstudent(Student s);
	//display all student
	void displayStudents();
	//remove student by id
	void removeStudent(int id);
	// student update
	void updateStudent(Student s);
	// search according to id
	void searchStudent(int id);
	
}
