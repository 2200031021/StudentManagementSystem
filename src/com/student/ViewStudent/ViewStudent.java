package com.student.ViewStudent;

import java.util.Scanner;

import com.student.Service;

public class ViewStudent {
	
	static Scanner sc=new Scanner(System.in);
	
	
	public static void viewStudent() {
		System.out.println("Enter the Student Id to View the Student Details:");
		int id=sc.nextInt();
		for(int i=0;i<Service.count;i++) {
			if(id==Service.students[i].getStudentId()) {
				Service.students[i].displayStudentDetails();
				return;
			}
		}
		System.out.println("No Student there with that id:"+id);
	}

}