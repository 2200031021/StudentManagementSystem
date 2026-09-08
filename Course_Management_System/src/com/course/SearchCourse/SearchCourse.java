package com.course.SearchCourse;

import java.util.Scanner;
import com.course.Service;

public class SearchCourse {
public static void searchCourse() {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the course name to Search : ");
String name=sc.next();
boolean found=false;
for(int i=0;i<Service.count;i++) {
if(Service.courses[i].getCourseName().equalsIgnoreCase(name)) {
Service.courses[i].displayCourseDetails();
found=true;
}
}
if(!found) {
System.out.println("No record Found..");
}
}
}
