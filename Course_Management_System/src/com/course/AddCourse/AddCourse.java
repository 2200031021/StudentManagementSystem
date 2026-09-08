package com.course.AddCourse;

import java.util.Scanner;
import com.course.Service;
import com.course.Course;

public class AddCourse {
public static void addcourse() {
if(Service.count == Service.courses.length) {
System.out.println("Can't add Courses..limit reached");
return;
}

System.out.println("Enter the course details:");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the id:");
int id=sc.nextInt();

for(int i=0;i<Service.count;i++) {
if(Service.courses[i].getCourseId()==id) {
System.out.println("Course Id already Exist...Try to again");
return;
}
}

System.out.println("Enter the name:");
String name=sc.next();
System.out.println("Enter the duration:");
String duration=sc.next();
System.out.println("Enter the trainer:");
String trainer=sc.next();
System.out.println("Enter the fee:");
double fee=sc.nextDouble();
if(fee<0) {
System.out.println("Fee cannot be negative");
return;
}

Course c1=new Course(id,name,duration,trainer,fee);
Service.courses[Service.count]=c1;
Service.count++;
System.out.println("Course added successfully...");
}
}
