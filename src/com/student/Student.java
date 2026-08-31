package com.student;

public class Student {
	int studentId;
	String studentName;
	int studentAge;
	String studentCourse;
	String studentDept;
	
	public Student(int studentId,String studentName,
			int studentAge,String studentCourse,String studentDept){
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentAge=studentAge;
		this.studentCourse=studentCourse;
		this.studentDept=studentDept;
	}
	
	public int getStudentId() {
		return this.studentId;
		
	}

	public String getStudentName() {
		return this.studentName;
	}

	public int getStudentAge() {
		return this.studentId;
	}

	public String getStudentCourse() {
		return this.studentCourse;
	}

	public String getStudentDept() {
		return this.studentDept;
	}
	

	public void setStudentId(int studentId) {
		this.studentId=studentId;
		
	}

	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge=studentAge;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse=studentCourse;
	}

	public void setStudentDept(String studentDept) {
		this.studentDept=studentDept;
	}
	
	public void displayStudentDetails() {
		System.out.println("***----Student Details----***");
		System.out.println(this.studentId);
		System.out.println(this.studentName);
		System.out.println(this.studentAge);
		System.out.println(this.studentCourse);
		System.out.println(this.studentDept);
		System.out.println("-----------------------");
				
	}
	

}