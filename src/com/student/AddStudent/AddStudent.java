package com.student.AddStudent;

import java.util.Scanner;

import com.student.Service;
import com.student.Student;

public class AddStudent {
	//scanner id,name,age,course,dept
	
	
	public static void addstudent() {
		
		if(Service.count == Service.students.length) {
			System.out.println("Can't add Students..limit reached");
			return;
		}
		System.out.println("Enter the student details:");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the id:");
		int id=sc.nextInt();
		
		for(int i=0;i<Service.count;i++) {
			if(Service.students[i].getStudentId()==id) {
				System.out.println("Student Id already Exist...Try to again");
				return;
			}
		}
		
		System.out.println("Enter the name:");
		String name=sc.next();
	
		
		
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		
		System.out.println("Enter the course:");
		String course=sc.next();
		
		System.out.println("Enter the dept:");
		String dept=sc.next();
		
		Student s1=new Student(id,name,age,course,dept);
		Service.students[Service.count]=s1;
		Service.count++;
		System.out.println("Student added successfully...");
	
	}

}