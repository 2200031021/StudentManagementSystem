package com.student;

import java.util.Scanner;

import com.student.AddStudent.AddStudent;
import com.student.DeleteStudent.DeleteStudent;
import com.student.ListStudents.ListStudents;
import com.student.UpdateStudent.UpdateStudent;
import com.student.ViewStudent.ViewStudent;

public class Main {
	
	public static void welcomeMsg() {
		System.err.println("****--Welcome to Student Management System--****");
		System.out.println();
	}
	public static void selectOptions() {
		System.out.println("Select any option to perform : \n");
		System.out.println("1. List of students :");
		System.out.println("2. Add student :");
		System.out.println("3. Update student :");
		System.out.println("4. Delete student :");
		System.out.println("5. View student :");
		System.out.println("6. Exit :\n");
	}
	
	public static void selectedOption(Scanner sc) {
		ListStudents ls=new ListStudents();
		System.out.println("Enter the option:");
		boolean isexit=true;
		while(isexit) {
			int option=sc.nextInt();
			
			switch(option) {
			case 1->{
				ls.listStudents();
				
			}
			case 2->{
				System.out.println("add");	
				AddStudent.addstudent();
			}
			case 3->{
				System.out.println("update");	
				UpdateStudent.updateStudent();
			}
			case 4->{
				System.out.println("delete");	
				DeleteStudent.deleteStudent();
			}
			case 5->{
				System.out.println("view");		
				ViewStudent.viewStudent();
			}
			case 6->{
				System.out.println("Exited.....");
				isexit=false;				
			}
			default ->{
				System.out.println("Invalid option");			
			}

			}
		}
		
		

	}

	public static void main(String[] args) {
		welcomeMsg();
		selectOptions();
		Scanner sc=new Scanner(System.in);
		selectedOption(sc);
		
		
	}

}