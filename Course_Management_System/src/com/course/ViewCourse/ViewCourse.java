package com.course.ViewCourse;

import java.util.Scanner;
import com.course.Service;

public class ViewCourse {
public static void viewCourse() {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Id to View Course : ");
int id=sc.nextInt();
for(int i=0;i<Service.count;i++) {
if(id==Service.courses[i].getCourseId()) {
Service.courses[i].displayCourseDetails();
return;
}
}
System.out.println("No record Found..");
}
}
