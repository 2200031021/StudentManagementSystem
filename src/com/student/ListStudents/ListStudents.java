package com.student.ListStudents;

import com.student.Service;
import com.student.Student;

public class ListStudents {
	public void listStudents() {
		if(Service.count == 0) {
			System.out.println("No students to show..Please add any students to see...");
			return;
		}
		System.out.println("List of Students....");
		for(int i=0;i<Service.count;i++) {
			Student stu = Service.students[i];
			stu.displayStudentDetails();
		}
	}
}
