package com.student.DeleteStudent;

import java.util.Scanner;

import com.student.Service;


public class DeleteStudent {
	
	static Scanner sc=new Scanner(System.in);
	public static void deleteStudent() {
		
		System.out.println("Enter the Id to Delete Student : ");
		int id=sc.nextInt();
		int index=-1;
		for(int i=0;i<Service.count;i++) {
			if(id==Service.students[i].getStudentId()) {
				index=i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("No record Found..");
			return;
		}
		for(int i=index;i<Service.count-1;i++) {
			Service.students[i]=Service.students[i+1];
		}
		Service.students[Service.count-1]=null;
		System.out.println("Deleted Successfully...");
	}

}