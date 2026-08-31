package com.student.UpdateStudent;

import java.util.Scanner;

import com.student.Service;

public class UpdateStudent {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void updateStudent() {
		System.out.println("Enter the Student ID to Update details:");
		int id=sc.nextInt();
		
		for(int i=0;i<Service.count;i++) {
			if(id==Service.students[i].getStudentId()) {
				
				System.out.println("What Data you want to Update");
				System.out.println("1.Name:\n2.Age:\n3.Course:\n4.Department:\n");
				int option=sc.nextInt();
				switch(option) {
				case 1->{
					System.out.println("Enter the Name to Update:");
					String name=sc.next();
					Service.students[i].setStudentName(name);
					
				}
				case 2->{
					System.out.println("Enter the Age to Update:");
					int age=sc.nextInt();
					Service.students[i].setStudentAge(age);
					
				}
				case 3->{
					System.out.println("Enter the Course to Update:");
					String course=sc.next();
					Service.students[i].setStudentCourse(course);
					
				}
				case 4->{
					System.out.println("Enter the Dept to Update");
					String dept=sc.next();
					Service.students[i].setStudentDept(dept);
					
				}
				default->{
					System.out.println("Invalid option....");
				}
				
				}
				System.out.println("Updated successfully...");
				return;
			}
		}
		System.out.println("No student there with id:"+id);
	}

}